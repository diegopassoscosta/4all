package br.org.codeforcow.gpsworld;

import java.util.ArrayList;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GPSFragment extends Fragment implements LocationListener,
		GpsStatus.Listener, OnClickListener {
	LocationManager localManager;
	String localProvider;
	TextView latitude;
	TextView longitude;
	TextView altitude;
	TextView satelitesVisiveis;
	TextView PRNsaltelitesVisiveis;
	TextView satelitesEmUso;
	Button btAtivar;
	boolean gpsLigado = false;
	boolean verificar = true;
	//int visible = 0;
	//int used = 0;
	
	public GPSFragment() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		btAtivar = (Button) getActivity().findViewById(R.id.botaoAtivarGPS);
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
			localProvider = localManager.getProvider(
					LocationManager.GPS_PROVIDER).getName();
			Location location = localManager
					.getLastKnownLocation(localProvider);
			
		}
		
//		PNRView clasRec = new PNRView(getActivity());
//		LinearLayout mDrawingPad=(LinearLayout)getActivity().findViewById(R.id.panel_drawing);
//		mDrawingPad.addView(clasRec);
		
		
		btAtivar.setOnClickListener(this);

	}

	@Override
	public void onResume() {
		super.onResume();
		if (gpsLigado) {
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
		int visible = 0;
		int used = 0;
		StringBuilder output = new StringBuilder();
		output.append("Satelites Visíveis (PRN):");
		GpsStatus gpss = localManager.getGpsStatus(null);
		Iterable<GpsSatellite> sats = gpss.getSatellites();
		for (GpsSatellite sat : sats) {
			visible++;
			if (sat.usedInFix())
				used++;
			output.append(sat.getPrn() + " ");
		}
		if (verificar) {
			satelitesVisiveis.setText("No. de Satelites Visíveis:" + visible);
			satelitesEmUso.setText("No. de Satelites em Uso:" + used);
			PRNsaltelitesVisiveis.setText(output.toString());
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
	public void onClick(View v) {
		if (!verificar) {
			verificar = true;
			btAtivar.setText("Parar");
		} else {
			verificar = false;
			btAtivar.setText("Ativar");
		}

	}
	
	//Pessima solução mas vamos apelar
	private class PNRView extends View {
		Paint paint = new Paint();
		Rect rect = new Rect(50, 50, 300, 300);
		Point p = new Point(rect.centerX(),rect.centerY());
		
		public PNRView(Context context) {
			super(context);
		}

		@Override
		public void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			ArrayList<Paint> alVisiveis = new ArrayList<Paint>();
			ArrayList<Paint> alPRNVisiveis = new ArrayList<Paint>();
			
			//bolas
			for (int i=0; i < 10; i++){
				alVisiveis.add(new Paint());
				if (i%2==0){
					alVisiveis.get(i).setColor(Color.BLUE);
				}else{
					alVisiveis.get(i).setColor(Color.RED);
				}
			}
			
			//frequencias
			for (int i=0; i < 10; i++){
				alPRNVisiveis.add(new Paint());
				if (i%2==0){
					alPRNVisiveis.get(i).setColor(Color.BLUE);
				}else{
					alPRNVisiveis.get(i).setColor(Color.RED);
				}
			}
			
			
			for (int i = 0; i < alVisiveis.size(); i++) {
					canvas.drawCircle(10, (i+1)*25, 10, alVisiveis.get(i));
					//canvas.drawLine(10, (i+1)*25, 100, (i+1)*25, paint);
			}
				
		}
			
			
	}

}