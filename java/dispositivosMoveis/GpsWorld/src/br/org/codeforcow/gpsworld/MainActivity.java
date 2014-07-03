package br.org.codeforcow.gpsworld;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import br.org.codeforcow.gpsworld.about.AboutFragment;
import br.org.codeforcow.gpsworld.googlemap.GoogleMapFragment;
import br.org.codeforcow.gpsworld.gps.GPSFragment;
import br.org.codeforcow.gpsworld.gps.video.VideoInternetFragment;

public class MainActivity extends Activity implements Communicator,
		OnClickListener {

	Map<String, Fragment> fragments = new HashMap<String, Fragment>();
	
	GPSFragment gpsFragment;
	GoogleMapFragment gmFragment;
	VideoInternetFragment viFragment;
	AboutFragment aboutFragment;

	Button btVideoGPS;
	Button btGoogleMap;
	Button btVideoInternet;
	Button btVideoSobre;
	Button btVideoSair;

	FragmentManager manager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);
		manager = getFragmentManager();
		btVideoGPS = (Button) findViewById(R.id.botaoVideoGPS);
		btGoogleMap = (Button) findViewById(R.id.botaoGoogleMap);
		btVideoInternet = (Button) findViewById(R.id.botaoVideoInternet);
		btVideoSobre = (Button) findViewById(R.id.botaoVideoSobre);
		btVideoSair = (Button) findViewById(R.id.botaoVideoSair);

		btVideoGPS.setOnClickListener(this);
		btGoogleMap.setOnClickListener(this);
		btVideoInternet.setOnClickListener(this);
		btVideoSobre.setOnClickListener(this);
		btVideoSair.setOnClickListener(this);
	}

	public void addGPSFragment(View v) {
		if (gpsFragment == null) {
			gpsFragment = new GPSFragment();
			FragmentTransaction ft = manager.beginTransaction();
			if (fragments.isEmpty()){
				ft.add(R.id.container, gpsFragment, "gpsFragment");
				ft.addToBackStack("addGPSFragment");
				fragments.put("gpsFragment", gpsFragment);
			}else{
				ft.replace(R.id.container, gpsFragment, "gpsFragment");
			}
			ft.commit();
		}else{
			FragmentTransaction ft = manager.beginTransaction();
			ft.replace(R.id.container, gpsFragment, "gpsFragment");
			ft.commit();
		}
	}

	public void addGoogleFragment(View v) {
		gmFragment = new GoogleMapFragment();
		FragmentTransaction ft = manager.beginTransaction();
		ft.add(R.id.container, gmFragment, "gmFragment");
		ft.addToBackStack("addGMFragment");
		ft.commit();
	}

	public void addVideoFragment(View v) {
		viFragment = new VideoInternetFragment();
		FragmentTransaction ft = manager.beginTransaction();
		ft.add(R.id.container, viFragment, "viFragment");
		ft.addToBackStack("addVIFragment");
		ft.commit();
	}

	public void addAboutFragment(View v) {
		
		if (aboutFragment == null) {
			aboutFragment = new AboutFragment();
			FragmentTransaction ft = manager.beginTransaction();
			if (fragments.isEmpty()){
				ft.add(R.id.container, aboutFragment, "aboutFragment");
				ft.addToBackStack("addABOUTFragment");
				fragments.put("aboutFragment", aboutFragment);
			}else{
				ft.replace(R.id.container, aboutFragment, "aboutFragment");
			}
			ft.commit();
		}else{
			FragmentTransaction ft = manager.beginTransaction();
			ft.replace(R.id.container, aboutFragment, "aboutFragment");
			ft.commit();
		}

	}

	public void sair(View v) {
		this.finish();
	}

	@Override
	public void respond(String data) {
		Toast.makeText(this, "oal", Toast.LENGTH_LONG).show();
		FragmentManager manager = getFragmentManager();
		GoogleMapFragment fe = new GoogleMapFragment(this);
		manager.beginTransaction().replace(R.id.container, fe);
		manager.beginTransaction().commit();
		fe.changeText(data);
	}

	@Override
	public void onClick(View view) {
		if (view == btVideoGPS) {
			addGPSFragment(view);
		} else if (view == btGoogleMap) {
			addGoogleFragment(view);
		} else if (view == btVideoInternet) {
			addVideoFragment(view);
		} else if (view == btVideoSobre) {
			addAboutFragment(view);
		} else if (view == btVideoSair) {
			sair(view);
		}

	}

}
