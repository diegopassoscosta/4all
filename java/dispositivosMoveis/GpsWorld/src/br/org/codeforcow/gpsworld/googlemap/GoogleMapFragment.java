package br.org.codeforcow.gpsworld.googlemap;

import java.util.ArrayList;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import br.org.codeforcow.gpsworld.R;
import br.org.codeforcow.gpsworld.gps.GPSFragment;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapFragment extends Fragment implements OnMapClickListener,
		LocationListener, GpsStatus.Listener {
	boolean gpsLigado = true;
	String localProvider;
	LocationManager localManager;

	GoogleMap myMap;
	TextView satelitesVisiveis;
	TextView satelitesEmUso;
	TextView PRNsaltelitesVisiveis;
	TextView latitude;

	final int RQS_GooglePlayServices = 1;
	GPSFragment gpsFragment = null;
	String data;

	public GoogleMapFragment(GPSFragment gpsFragment) {
		super();
		this.gpsFragment = gpsFragment;
	}

	public GoogleMapFragment() {
		super();
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (savedInstanceState == null) {
			Toast.makeText(getActivity(), "null", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(getActivity(), "not null", Toast.LENGTH_LONG).show();
		}

		View rootView = inflater.inflate(R.layout.fragment_google_map,
				container, false);
		return rootView;

	}

	public void changeText(String data) {
		this.data = data;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		if (savedInstanceState == null) {
			satelitesVisiveis = (TextView) getActivity().findViewById(
					R.id.textViewSatelitesVisiveis);
			satelitesEmUso = (TextView) getActivity().findViewById(
					R.id.textViewSatelitesUsados);
			PRNsaltelitesVisiveis = (TextView) getActivity().findViewById(
					R.id.textViewPRNUsados);
			latitude = (TextView) getActivity().findViewById(
					R.id.textView1);

			localManager = (LocationManager) getActivity().getSystemService(
					Context.LOCATION_SERVICE);

			if (localManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
				gpsLigado = true;
				// interrogação
				localProvider = localManager.getProvider(
						LocationManager.GPS_PROVIDER).getName();
				Location location = localManager
						.getLastKnownLocation(localProvider);
				FragmentManager myFragmentManager = getFragmentManager();
				MapFragment myMapFragment = (MapFragment) myFragmentManager
						.findFragmentById(R.id.id_fragment_google_map);
				myMap = myMapFragment.getMap();
				myMap.clear();
				MarkerOptions marker = new MarkerOptions()
						.position(
								new LatLng(location.getLatitude(), location
										.getLongitude()))
						.title("Hello Maps ")
						.icon(BitmapDescriptorFactory
								.fromResource(R.drawable.common_signin_btn_text_focus_dark));
				myMap.addMarker(marker);
				CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(
						location.getLatitude(), location.getLongitude()));
				CameraUpdate zoom = CameraUpdateFactory.zoomTo(20);
				myMap.moveCamera(center);
				myMap.animateCamera(zoom);
				myMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

				myMap.setOnMapClickListener(this);
			} else {
				// interrogacao
			}

		}
		Toast.makeText(getActivity(), ":-->KK" + data, Toast.LENGTH_LONG)
				.show();
		boolean b = verificaConexao();
		Toast.makeText(getActivity(), b + "", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onResume() {
		super.onResume();
		if (gpsLigado) {
			localManager.requestLocationUpdates(localProvider, 60000, 1, this);
			localManager.addGpsStatusListener(this);

		}
	}

	@Override
	public void onMapClick(LatLng point) {
		Toast.makeText(getActivity(), data, Toast.LENGTH_LONG).show();

		LatLng MELBOURNE = point;
		Marker melbourne = myMap
				.addMarker(new MarkerOptions()
						.position(MELBOURNE)
						.title("Melbourne")
						.snippet("Population: 4,137,400")
						.icon(BitmapDescriptorFactory
								.fromResource(R.drawable.common_signin_btn_text_focus_dark)));

	}

	@Override
	public void onGpsStatusChanged(int event) {
		int espaco = 2;
		int visivel = 0;
		int usados = 0;
		StringBuilder output = new StringBuilder();
		output.append("PRN:\n");
		GpsStatus gpss = localManager.getGpsStatus(null);
		Iterable<GpsSatellite> sats = gpss.getSatellites();
		ArrayList<GpsSatellite> alGPSSatelites = new ArrayList<GpsSatellite>();
		for (GpsSatellite sat : sats) {
			visivel++;
			if (sat.usedInFix())
				usados++;
			if (espaco % 2 == 0) {
				output.append(sat.getPrn() + "-");
			} else {
				output.append(sat.getPrn() + "\n");
			}
			++espaco;
			alGPSSatelites.add(sat);
		}
		// drawSatelite.setSatelitesVisiveis(alGPSSatelites);
		satelitesVisiveis.setText("Satelites Visíveis:" + visivel);
		satelitesEmUso.setText("Satelites em Uso:" + usados);
		PRNsaltelitesVisiveis.setText(output.toString());
		// drawSatelite.invalidate();
	}

	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub

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

	public boolean verificaConexao() {
		boolean conectado;
		ConnectivityManager conectivtyManager = (ConnectivityManager) getActivity()
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (conectivtyManager.getActiveNetworkInfo() != null
				&& conectivtyManager.getActiveNetworkInfo().isAvailable()
				&& conectivtyManager.getActiveNetworkInfo().isConnected()) {
			conectado = true;
		} else {
			conectado = false;
		}
		return conectado;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		MapFragment f = (MapFragment) getFragmentManager().findFragmentById(
				R.id.id_fragment_google_map);
		if (f != null)
			getFragmentManager().beginTransaction().remove(f).commit();
	}

}
