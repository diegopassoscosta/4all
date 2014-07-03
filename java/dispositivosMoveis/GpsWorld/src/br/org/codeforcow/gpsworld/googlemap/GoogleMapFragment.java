package br.org.codeforcow.gpsworld.googlemap;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import br.org.codeforcow.gpsworld.MainActivity;
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

public class GoogleMapFragment extends Fragment implements OnMapClickListener {
	private GoogleMap myMap;
	private Bitmap bmpText;
	final int RQS_GooglePlayServices = 1;
	GPSFragment gpsFragment = null;
	private String data;
	private Activity mainActivity;

	public GoogleMapFragment(GPSFragment gpsFragment) {
		super();
		this.gpsFragment = gpsFragment;
	}

	public GoogleMapFragment() {
		super();
	}

	public GoogleMapFragment(Activity mainActivity) {
		this.mainActivity = mainActivity;
		
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (savedInstanceState == null){
			Toast.makeText(this.mainActivity, "null", Toast.LENGTH_LONG).show();
		}else{
			Toast.makeText(this.mainActivity, "not null", Toast.LENGTH_LONG).show();
		}
		
		View rootView = inflater.inflate(R.layout.fragment_google_map,
				container, false);
		
		Toast.makeText(this.mainActivity, ":-->", Toast.LENGTH_LONG).show();
		return rootView;

	}

	public void changeText(String data) {
		Activity a = this.mainActivity;
		Toast.makeText(a, ":"+data, Toast.LENGTH_LONG).show();
		this.data = data;
	}

	public void changeText() {
		Activity a = this.mainActivity;
		Toast.makeText(a, ":-->", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		if (savedInstanceState == null) {
			FragmentManager myFragmentManager = getFragmentManager();
			MapFragment myMapFragment = (MapFragment) myFragmentManager
					.findFragmentById(R.id.id_fragment_google_map);
			myMap = myMapFragment.getMap();
			double latitude = -12.968941;
			double longitude = -38.464912;
			myMap.clear();
			MarkerOptions marker = new MarkerOptions()
					.position(new LatLng(latitude, longitude))
					.title("Hello Maps ")
					.icon(BitmapDescriptorFactory
							.fromResource(R.drawable.common_signin_btn_text_focus_dark));
			myMap.addMarker(marker);
			CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(
					latitude, longitude));
			CameraUpdate zoom = CameraUpdateFactory.zoomTo(7);
			myMap.moveCamera(center);
			myMap.animateCamera(zoom);

			myMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			myMap.setOnMapClickListener(this);
		}

	}

	@Override
	public void onMapClick(LatLng point) {
		Toast.makeText(getActivity(), data, Toast.LENGTH_LONG).show();
		;
		/*
		 * CircleOptions circleOptions = new CircleOptions() .center(point)
		 * //set center .radius(1000) //set radius in meters
		 * .fillColor(Color.RED) .strokeColor(Color.BLACK) .strokeWidth(5);
		 * 
		 * myMap.addCircle(circleOptions);
		 */
		LatLng MELBOURNE = point;
		Marker melbourne = myMap
				.addMarker(new MarkerOptions()
						.position(MELBOURNE)
						.title("Melbourne")
						.snippet("Population: 4,137,400")
						.icon(BitmapDescriptorFactory
								.fromResource(R.drawable.common_signin_btn_text_focus_dark)));

	}

}
