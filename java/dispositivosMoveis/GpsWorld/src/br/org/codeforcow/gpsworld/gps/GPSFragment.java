package br.org.codeforcow.gpsworld.gps;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import br.org.codeforcow.gpsworld.Communicator;
import br.org.codeforcow.gpsworld.R;

public class GPSFragment extends Fragment implements LocationListener,
		GpsStatus.Listener, OnClickListener, SensorEventListener {

	Communicator com;
	LocationManager localManager;
	String localProvider;
	TextView latitude;
	TextView longitude;
	TextView altitude;
	TextView satelitesVisiveis;
	TextView PRNsaltelitesVisiveis;
	TextView satelitesEmUso;

	Button btAtivar;
	Button btInformacoesGraficasBasicas;
	Button btInformacoesGraficasAvancadas;
	Button btBulsola;

	boolean gpsLigado = false;
	boolean verificar = false;
	int visivel = 0;
	int usados = 0;

	LinearLayout mDrawingPad;
	PRNView drawSatelite;
	AZMView drawAZM;

	BulsolaView drawBulsola;
	static SensorManager mySensorManager;
	private boolean sersorrunning;

	public GPSFragment() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState == null) {
			Toast.makeText(getActivity(), "text -1", Toast.LENGTH_LONG).show();
			verificar = false;
		} else {
			verificar = savedInstanceState.getBoolean("gpsAtivado");
			Toast.makeText(getActivity(), "text 1", Toast.LENGTH_LONG).show();
		}

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		if (savedInstanceState != null) {
			// savedInstanceState
		}
		com = (Communicator) getActivity();
		btAtivar = (Button) getActivity().findViewById(R.id.botaoAtivarGPS);
		btInformacoesGraficasBasicas = (Button) getActivity().findViewById(
				R.id.botaoGraficoBasico);
		btInformacoesGraficasAvancadas = (Button) getActivity().findViewById(
				R.id.botaoGraficoAvancado);
		btBulsola = (Button) getActivity().findViewById(R.id.botaoBulsola);

		latitude = (TextView) getActivity().findViewById(R.id.textViewLatitude);
		longitude = (TextView) getActivity().findViewById(
				R.id.textViewLongitude);
		altitude = (TextView) getActivity().findViewById(R.id.textViewAltitude);
		satelitesVisiveis = (TextView) getActivity().findViewById(
				R.id.textViewSatelitesVisiveis);
		PRNsaltelitesVisiveis = (TextView) getActivity().findViewById(
				R.id.textViewPRNSatelitesVisiveis);
		satelitesEmUso = (TextView) getActivity().findViewById(
				R.id.textViewSatelitesEmUso);

		localManager = (LocationManager) getActivity().getSystemService(
				Context.LOCATION_SERVICE);

		if (localManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
			gpsLigado = true;
			// interrogação
			localProvider = localManager.getProvider(
					LocationManager.GPS_PROVIDER).getName();
			Location location = localManager
					.getLastKnownLocation(localProvider);
		} else {
			// interrogacao
		}

		// VIEWS
		drawSatelite = new PRNView(getActivity());
		drawAZM = new AZMView(getActivity());
		drawBulsola = new BulsolaView(getActivity());

		mDrawingPad = (LinearLayout) getActivity().findViewById(
				R.id.panel_drawing);

		// bulsola
		mySensorManager = (SensorManager) getActivity().getSystemService(
				Context.SENSOR_SERVICE);
		List<Sensor> mySensors = mySensorManager
				.getSensorList(Sensor.TYPE_ORIENTATION);

		if (mySensors.size() > 0) {
			mySensorManager.registerListener(this, mySensors.get(0),
					SensorManager.SENSOR_DELAY_NORMAL);
			sersorrunning = true;
		} else {
			sersorrunning = false;

		}
		// fim bulsola
		btAtivar.setOnClickListener(this);
		btInformacoesGraficasBasicas.setOnClickListener(this);
		btInformacoesGraficasAvancadas.setOnClickListener(this);
		btBulsola.setOnClickListener(this);
	}

	@Override
	public void onResume() {
		super.onResume();
		if (gpsLigado) {
			// Toast.makeText(getActivity(), "text -1.1",
			// Toast.LENGTH_LONG).show();
			localManager.requestLocationUpdates(localProvider, 60000, 1, this);
			localManager.addGpsStatusListener(this);
			
		}
	};

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_gps, container,
				false);
		return rootView;
	}

	@Override
	public void onGpsStatusChanged(int event) {
		visivel = 0;
		usados = 0;
		StringBuilder output = new StringBuilder();
		output.append("Satelites Visíveis (PRN):");
		GpsStatus gpss = localManager.getGpsStatus(null);
		Iterable<GpsSatellite> sats = gpss.getSatellites();
		ArrayList<GpsSatellite> alGPSSatelites = new ArrayList<GpsSatellite>();
		for (GpsSatellite sat : sats) {
			visivel++;
			if (sat.usedInFix())
				usados++;
			output.append(sat.getPrn() + " ");
			alGPSSatelites.add(sat);
		}
		drawSatelite.setSatelitesVisiveis(alGPSSatelites);
		drawAZM.setSatelitesVisiveis(alGPSSatelites);
		if (verificar) {
			satelitesVisiveis.setText("No. de Satelites Visíveis:" + visivel);
			satelitesEmUso.setText("No. de Satelites em Uso:" + usados);
			PRNsaltelitesVisiveis.setText(output.toString());
			drawSatelite.invalidate();
			drawAZM.invalidate();
		} else {
			satelitesVisiveis.setText("No. de Satelites Visíveis:");
			satelitesEmUso.setText("No. de Satelites em Uso:");
			PRNsaltelitesVisiveis.setText("Satelites Visíveis (PRN):");
		}
	}

	@Override
	public void onLocationChanged(Location location) {
		if (verificar) {
			latitude.setText("Latitude: " + location.getLatitude());
			longitude.setText("Longitude: " + location.getLongitude());
			altitude.setText("Altitude: " + location.getAltitude());
		} else {
			latitude.setText("Latitude: ");
			longitude.setText("Longitude: ");
			altitude.setText("Altitude: ");
		}
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View view) {
		if (view == btAtivar) {
			if (!verificar) {
				verificar = true;
				btAtivar.setText("Parar");
				com.respond("teste");
			} else {
				verificar = false;
				btAtivar.setText("Ativar");
			}
		} else if (view == btInformacoesGraficasBasicas) {
			if (verificar) {
				mDrawingPad.removeAllViews();
				mDrawingPad.addView(drawSatelite);
			}
		} else if (view == btInformacoesGraficasAvancadas) {
			if (verificar) {
				mDrawingPad.removeAllViews();
				mDrawingPad.addView(drawAZM);
			}
		} else if (view == btBulsola) {
			mDrawingPad.removeAllViews();
			mDrawingPad.addView(drawBulsola);
		}
	}

	// Pessima solução mas vamos apelar
	private class PRNView extends View {
		int coluna1, coluna2, coluna3;
		Paint paintVermelho = new Paint();
		Paint paintAzul = new Paint();
		Paint paintLinha = new Paint();
		Paint paintTexto = new Paint();

		
		ArrayList<GpsSatellite> alSatelitesVisiveis = new ArrayList<GpsSatellite>();

		public PRNView(Context context) {
			super(context);
		}

		public void setSatelitesVisiveis(ArrayList<GpsSatellite> sats) {
			alSatelitesVisiveis = sats;
		}

		@Override
		public void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			
			paintAzul.setColor(Color.BLUE);
			paintVermelho.setColor(Color.RED);
			paintLinha.setColor(Color.GREEN);
			paintTexto.setColor(Color.WHITE);

			coluna1 = 0;
			coluna2 = 0;
			coluna3 = 0;

			for (int i = 0; i < visivel; i++) {
				if (i < 7) {
					
					if (alSatelitesVisiveis.get(i).getPrn() > 65 && alSatelitesVisiveis.get(i).getPrn() < 88)
						canvas.drawCircle(30, (coluna1 + 1) * 45, 20,paintAzul);
					else
						canvas.drawCircle(30, (coluna1 + 1) * 45, 20,paintVermelho);
					
					canvas.drawText(alSatelitesVisiveis.get(i).getPrn() + "",20, (coluna1 + 1) * 45, paintTexto);
					paintLinha.setStrokeWidth((alSatelitesVisiveis.get(i).getSnr()));
					canvas.drawLine(45, (coluna1 + 1) * 45, 250, (coluna1 + 1) * 45, paintLinha);

					++coluna1;
				} else if (i < 14) {
					if (alSatelitesVisiveis.get(i).getPrn() > 65 && alSatelitesVisiveis.get(i).getPrn() < 88)
						canvas.drawCircle(300, (coluna2 + 1) * 45, 20, paintAzul);
					else
						canvas.drawCircle(300, (coluna2 + 1) * 45, 20, paintVermelho);
					
					canvas.drawText(alSatelitesVisiveis.get(i).getPrn() + "", 290, (coluna2 + 1) * 45, paintTexto);
					paintLinha.setStrokeWidth((alSatelitesVisiveis.get(i).getSnr()));
					canvas.drawLine(315, (coluna2 + 1) * 45, 500, (coluna2 + 1) * 45, paintLinha);

					++coluna2;
				} else if (i < 22) {
					if (alSatelitesVisiveis.get(i).getPrn() > 65 && alSatelitesVisiveis.get(i).getPrn() < 88)
						canvas.drawCircle(540, (coluna3 + 1) * 45, 20, paintAzul);
					else
						canvas.drawCircle(540, (coluna3 + 1) * 45, 20, paintVermelho);
					
					canvas.drawText(alSatelitesVisiveis.get(i).getPrn() + "",530, (coluna3 + 1) * 45, paintLinha);
					paintLinha.setStrokeWidth((alSatelitesVisiveis.get(i).getSnr()));
					canvas.drawLine(555, (coluna3 + 1) * 45, 700, (coluna3 + 1) * 45, paintLinha);
					
					++coluna3;
				}
			}
		}
	}

	private class AZMView extends View {
		int coluna1, coluna2, coluna3;
		Paint paintVermelho = new Paint();
		Paint paintAzul = new Paint();
		Paint paintLinha = new Paint();
		Paint paintTexto = new Paint();
		private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		private boolean primeiroDesenho;
		ArrayList<GpsSatellite> alSatelitesVisiveis = new ArrayList<GpsSatellite>();

		public AZMView(Context context) {
			super(context);
			init();
		}

		public AZMView(Context context, AttributeSet attrs) {
			super(context, attrs);
			init();
		}

		public AZMView(Context context, AttributeSet attrs, int defStyle) {
			super(context, attrs, defStyle);
			init();
		}

		private void init() {
			paint.setColor(Color.BLACK);
			// paint.setTextSize(30);

			primeiroDesenho = true;
		}

		public void setSatelitesVisiveis(ArrayList<GpsSatellite> sats) {
			alSatelitesVisiveis = sats;
		}

		@Override
		protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
			setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec),
					MeasureSpec.getSize(heightMeasureSpec));
		}

		@Override
		public void onDraw(Canvas canvas) {
			super.onDraw(canvas);
						
			/////////

			paintAzul.setColor(Color.BLUE);
			paintVermelho.setColor(Color.RED);
			paintLinha.setColor(Color.GREEN);
			paintTexto.setColor(Color.WHITE);

			coluna1 = 0;
			coluna2 = 0;
			coluna3 = 0;
			
			double cxCirculo =0;
			double cyCirculo =0;
			float  raioCirculo = 0;
			
			for (int i = 0; i < visivel; i++) {
				if (i < 7) {
					cxCirculo = 30;
					cyCirculo = (coluna1 + 1) * 45;
					raioCirculo = 20;
					if (alSatelitesVisiveis.get(i).getPrn() > 65 && alSatelitesVisiveis.get(i).getPrn() < 88)
						canvas.drawCircle((float)cxCirculo, (float)cyCirculo, 20,paintAzul);
					else
						canvas.drawCircle((float)cxCirculo, (float)cyCirculo, 20,paintVermelho);
					
					canvas.drawText(alSatelitesVisiveis.get(i).getPrn() + "",20, (coluna1 + 1) * 45, paintTexto);
					
					
					double xs = (double) (Math.sin(alSatelitesVisiveis.get(i).getAzimuth()) * Math.sin(alSatelitesVisiveis.get(i).getElevation()));
					double ys = (double) (Math.cos(alSatelitesVisiveis.get(i).getAzimuth()) * Math.cos(alSatelitesVisiveis.get(i).getElevation()));

					double xi = -xs + cxCirculo;
					double yi = -ys + cyCirculo;
			
					canvas.drawLine((float)cxCirculo+raioCirculo, (float)cyCirculo+raioCirculo, (float)xi, (float)yi, paintLinha);			
					
					++coluna1;
				} else if (i < 14) {
					if (alSatelitesVisiveis.get(i).getPrn() > 65 && alSatelitesVisiveis.get(i).getPrn() < 88)
						canvas.drawCircle(300, (coluna2 + 1) * 45, 20, paintAzul);
					else
						canvas.drawCircle(300, (coluna2 + 1) * 45, 20, paintVermelho);
					
					canvas.drawText(alSatelitesVisiveis.get(i).getPrn() + "", 290, (coluna2 + 1) * 45, paintTexto);
					paintLinha.setStrokeWidth((alSatelitesVisiveis.get(i).getSnr()));
					

					++coluna2;
				} else if (i < 22) {
					if (alSatelitesVisiveis.get(i).getPrn() > 65 && alSatelitesVisiveis.get(i).getPrn() < 88)
						canvas.drawCircle(540, (coluna3 + 1) * 45, 20, paintAzul);
					else
						canvas.drawCircle(540, (coluna3 + 1) * 45, 20, paintVermelho);
					
					canvas.drawText(alSatelitesVisiveis.get(i).getPrn() + "",530, (coluna3 + 1) * 45, paintLinha);
					
				}
					
			}
		}
			
	}

	private class BulsolaView extends View {
		double direcao;
		private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		private boolean primeiroDesenho;

		public BulsolaView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			int cxCirculo = getMeasuredWidth() / 2;
			int cyCirculo = getMeasuredHeight() / 2;
			float raioCirculo;

			if (cxCirculo > cyCirculo) {
				raioCirculo = (float) (cyCirculo * 0.9);
			} else {
				raioCirculo = (float) (cxCirculo * 0.9);
			}
			paint.setColor(Color.BLACK);
			canvas.drawCircle(cxCirculo, cyCirculo, raioCirculo, paint);
			if (!primeiroDesenho) {

				paint.setColor(Color.WHITE);
				canvas.drawLine(
						cxCirculo,
						cyCirculo,
						(float) (cxCirculo + raioCirculo
								* Math.sin((double) (-direcao) * 3.14 / 180)),
						(float) (cyCirculo - raioCirculo
								* Math.cos((double) (-direcao) * 3.14 / 180)),
						paint);

				canvas.drawText(String.valueOf(direcao), cxCirculo, cyCirculo,
						paint);

			}
			primeiroDesenho = false;
		}

		public void updateDirection(float dir) {
			primeiroDesenho = false;
			direcao = dir;
			invalidate();
		}
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putBoolean("gpsAtivado", verificar);
		// Toast.makeText(getActivity(), "text 0", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		drawBulsola.updateDirection((float) event.values[0]);
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
	}

}