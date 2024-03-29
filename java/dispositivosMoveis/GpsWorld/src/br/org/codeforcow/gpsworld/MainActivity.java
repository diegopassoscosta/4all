package br.org.codeforcow.gpsworld;

import java.util.HashMap;
import java.util.Map;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import br.org.codeforcow.gpsworld.about.AboutFragment;
import br.org.codeforcow.gpsworld.googlemap.GoogleMapFragment;
import br.org.codeforcow.gpsworld.gps.GPSFragment;
import br.org.codeforcow.gpsworld.log.LogFragment;
import br.org.codeforcow.gpsworld.navofflline.StreetMapFragment;
import br.org.codeforcow.gpsworld.welcome.WelcomeFragment;

public class MainActivity extends FragmentActivity implements Communicator,
		OnClickListener {

	Map<String, Fragment> fragments = new HashMap<String, Fragment>();
	
	WelcomeFragment welcomeFragment;
	GPSFragment gpsFragment;
	GoogleMapFragment gmFragment;
	StreetMapFragment smFragment;
	AboutFragment aboutFragment;
	LogFragment logFragment;
	
	Button btGPS;
	Button btGoogleMap;
	Button btStreetMap;
	Button btLogGPS;
	Button btSobre;
	Button btSair;

	FragmentManager manager;

	

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);
		if (savedInstanceState == null){
		manager = getFragmentManager();
		btGPS = (Button) findViewById(R.id.botaoMAINGPS);
		btGoogleMap = (Button) findViewById(R.id.botaoMAINGoogleMap);
		btStreetMap = (Button) findViewById(R.id.buttonMAINOpenStreetMaps);
		btLogGPS = (Button) findViewById(R.id.botaoMAINLogGPS);
		btSobre = (Button) findViewById(R.id.botaoMAINSobre);
		btSair = (Button) findViewById(R.id.botaoMAINSair);

		welcomeFragment = new WelcomeFragment();
		gpsFragment = new GPSFragment();
		aboutFragment = new AboutFragment();
		gmFragment = new GoogleMapFragment();
		smFragment = new StreetMapFragment();
		logFragment = new LogFragment();
		
		FragmentTransaction ft = manager.beginTransaction();
		
		ft.add(R.id.container, gmFragment, "gmFragment");
		ft.addToBackStack(null);
		//ft.addToBackStack("addGMFragment");
		
		fragments.put("smFragment", smFragment);
		ft.replace(R.id.container, smFragment, "smFragment");
		ft.addToBackStack(null);
		//ft.addToBackStack("addGMFragment");
		fragments.put("smFragment", smFragment);
		
		ft.replace(R.id.container, logFragment, "logFragment");
		ft.addToBackStack(null);
		//ft.addToBackStack("addVIFragment");
		fragments.put("logFragment", logFragment);
		
		ft.replace(R.id.container, aboutFragment, "aboutFragment");
		ft.addToBackStack(null);
		//ft.addToBackStack("addABOUTFragment");
		fragments.put("aboutFragment", aboutFragment);
		
		ft.replace(R.id.container, gpsFragment, "gpsFragment");
		ft.addToBackStack(null);
		//ft.addToBackStack("addGPSFragment");
		fragments.put("gpsFragment", gpsFragment);
		
		ft.replace(R.id.container, welcomeFragment, "welcomeFragment");
		ft.addToBackStack(null);
		//ft.addToBackStack("addGPSFragment");
		fragments.put("welcomeFragment", welcomeFragment);
		
		ft.commit();
		
		
		btGPS.setOnClickListener(this);
		btGoogleMap.setOnClickListener(this);
		btStreetMap.setOnClickListener(this);
		btLogGPS.setOnClickListener(this);
		btSobre.setOnClickListener(this);
		btSair.setOnClickListener(this);
		}
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
		if (gmFragment == null) {
			gmFragment = new GoogleMapFragment();
			FragmentTransaction ft = manager.beginTransaction();
			if (fragments.isEmpty()){
				ft.add(R.id.container, gmFragment, "gmFragment");
				ft.addToBackStack("addGMFragment");
				fragments.put("gmFragment", gmFragment);
			}else{
				ft.replace(R.id.container, gmFragment, "gmFragment");
			}
			ft.commit();
		}else{
			FragmentTransaction ft = manager.beginTransaction();
			ft.replace(R.id.container, gmFragment, "gmFragment");
			ft.commit();
		}
		
	}

	public void addLogFragment(View v) {
		if (logFragment == null) {
			logFragment = new LogFragment();
			FragmentTransaction ft = manager.beginTransaction();
			if (fragments.isEmpty()){
				ft.add(R.id.container, logFragment, "logFragment");
				ft.addToBackStack("addVIFragment");
				fragments.put("viFragment", logFragment);
			}else{
				ft.replace(R.id.container, logFragment, "logFragment");
			}
			ft.commit();
		}else{
			FragmentTransaction ft = manager.beginTransaction();
			ft.replace(R.id.container, logFragment, "logFragment");
			ft.commit();
		}
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
	
	public void addOpenStreetMapFragment(View v) {
		if (smFragment == null) {
			smFragment = new StreetMapFragment();
			FragmentTransaction ft = manager.beginTransaction();
			if (fragments.isEmpty()){
				ft.add(R.id.container, smFragment, "smFragment");
				ft.addToBackStack("addSTREETMAPFragment");
				fragments.put("smFragment", smFragment);
			}else{
				ft.replace(R.id.container, smFragment, "smFragment");
			}
			ft.commit();
		}else{
			FragmentTransaction ft = manager.beginTransaction();
			ft.replace(R.id.container, smFragment, "smFragment");
			ft.commit();
		}

	}

	public void sair(View v) {
		this.finish();
	}

	@Override
	public void respond(String data) {
		Toast.makeText(this, data, Toast.LENGTH_LONG).show();
		FragmentTransaction ft = manager.beginTransaction();
		GoogleMapFragment fe = (GoogleMapFragment)manager.findFragmentByTag("gmFragment");
		//ft.replace(R.id.container, fe, "gmFragment");
		ft.commit();
		fe.changeText(data);
	}

	@Override
	public void onClick(View view) {
		if (view == btGPS) {
			addGPSFragment(view);
		} else if (view == btGoogleMap) {
			addGoogleFragment(view);
		} else if (view == btStreetMap) {
			addOpenStreetMapFragment(view);
		} else if (view == btLogGPS) {
			addLogFragment(view);
		} else if (view == btSobre) {
			addAboutFragment(view);
		} else if (view == btSair) {
			sair(view);
		}

	}

}
