package br.org.codeforcow.gpsworld.googlemap;

import java.util.ArrayList;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Point;
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
import android.widget.TextView;
import android.widget.Toast;
import br.org.codeforcow.gpsworld.R;
import br.org.codeforcow.gpsworld.gps.GPSFragment;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapFragment extends Fragment implements OnMapClickListener,
		LocationListener, GpsStatus.Listener {
	boolean gpsLigado = true;
	String localProvider;
	LocationManager localManager;
	Location location;
	
	TextView satelitesVisiveis;
	TextView satelitesEmUso;
	TextView PRNsaltelitesVisiveis;
	TextView latitude;
	TextView longitude;
	TextView altitude;
	
	GoogleMap myMap;
	Projection projection;
	Point screenPosition;
	MarkerOptions marker;
	
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
					R.id.textViewSatelitesVisiveisGoogle);
			satelitesEmUso = (TextView) getActivity().findViewById(
					R.id.textViewSatelitesUsadosGoogle);
			PRNsaltelitesVisiveis = (TextView) getActivity().findViewById(
					R.id.textViewPRNUsados);
			latitude = (TextView) getActivity().findViewById(R.id.textViewLatitudeGoogle);
			longitude = (TextView) getActivity().findViewById(R.id.textViewLongitudeGoogle);
			altitude = (TextView) getActivity().findViewById(R.id.textViewAltitudeGoogle);

			localManager = (LocationManager) getActivity().getSystemService(
					Context.LOCATION_SERVICE);

			if (localManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
				gpsLigado = true;
				// interrogação
				localProvider = localManager.getProvider(
						LocationManager.GPS_PROVIDER).getName();
				location = localManager
						.getLastKnownLocation(localProvider);
				FragmentManager myFragmentManager = getFragmentManager();
				MapFragment myMapFragment = (MapFragment) myFragmentManager
						.findFragmentById(R.id.id_fragment_google_map);
				myMap = myMapFragment.getMap();
				myMap.clear();
				marker = new MarkerOptions()
						.position(
								new LatLng(location.getLatitude(), location
										.getLongitude()))
						.title("Hello Maps ")
						.icon(BitmapDescriptorFactory
								.fromResource(R.drawable.cow_marker));
				myMap.addMarker(marker);
				CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(
						location.getLatitude(), location.getLongitude()));
				CameraUpdate zoom = CameraUpdateFactory.zoomTo(20);
				
				myMap.moveCamera(center);
				myMap.animateCamera(zoom);
				myMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
				
				//projection = myMap.getProjection();
				//screenPosition = projection.toScreenLocation(marker.getPosition());


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
		
		screenPosition = projection.toScreenLocation(melbourne.getPosition());
		latitude.setText(screenPosition+"");
		
		
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
		
		projection = myMap.getProjection();
		screenPosition = projection.toScreenLocation(marker.getPosition());
		latitude.setText("latitude: " +location.getLatitude());
		latitude.setX(screenPosition.x);
		latitude.setY(screenPosition.y);
		
		longitude.setText("Longitude: " +location.getLongitude());
		longitude.setX(screenPosition.x+40);
		longitude.setY(screenPosition.y+120);
		
		altitude.setText("Altitude: " +location.getAltitude());
		altitude.setX(screenPosition.x-40);
		altitude.setY(screenPosition.y-120);
		
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
