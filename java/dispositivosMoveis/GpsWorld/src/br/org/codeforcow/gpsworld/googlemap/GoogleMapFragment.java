package br.org.codeforcow.gpsworld.googlemap;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import br.org.codeforcow.gpsworld.R;
import br.org.codeforcow.gpsworld.R.drawable;
import br.org.codeforcow.gpsworld.R.id;
import br.org.codeforcow.gpsworld.R.layout;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapFragment extends Fragment implements OnMapClickListener{
	private GoogleMap myMap;
	private Bitmap bmpText;
	final int RQS_GooglePlayServices = 1;
	public GoogleMapFragment() {
		super();
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_google_map,
				container, false);
		return rootView;

	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		FragmentManager myFragmentManager = getFragmentManager();
		  MapFragment myMapFragment 
		   = (MapFragment)myFragmentManager.findFragmentById(R.id.fragment1);
		  myMap = myMapFragment.getMap();
		  myMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		  
		  Paint paintText = new Paint();
		  Rect boundsText = new Rect();
		  paintText.getTextBounds("oiiiiiiiiiiiiiiiiiii", 0, "oiiiiiiiiiiiiiiiiiii".length(),
		      boundsText);
		  Bitmap.Config conf = Bitmap.Config.ARGB_8888;
		  bmpText = Bitmap.createBitmap(boundsText.width(),
		      boundsText.height(), conf);
		  
		  
		  myMap.setOnMapClickListener(this);
	}
	
	@Override
	public void onMapClick(LatLng point) {
		// TODO Auto-generated method stub
		Toast.makeText(getActivity(), "hahahahahahah", Toast.LENGTH_LONG).show();;
/*		CircleOptions circleOptions = new CircleOptions()
		  .center(point)   //set center
		  .radius(1000)   //set radius in meters
		  .fillColor(Color.RED)
		  .strokeColor(Color.BLACK)
		  .strokeWidth(5);
		  
		  myMap.addCircle(circleOptions);
	*/	  
//		  MarkerOptions markerOptions = new MarkerOptions()
//		    .position(point)
//		    .icon(BitmapDescriptorFactory.fromBitmap(bmpText))
//		    .anchor(0.5f, 1);
//		  myMap.addMarker(markerOptions);
			LatLng MELBOURNE = point;
		    Marker melbourne = myMap.addMarker(new MarkerOptions()
		                            .position(MELBOURNE)
		                            .title("Melbourne")
		                            .snippet("Population: 4,137,400")
		                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.common_signin_btn_text_focus_dark)));
		    
	}
	
	

}
