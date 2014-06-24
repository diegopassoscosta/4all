package br.org.codeforcow.gpsworld;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.br.org.codeforcow.capvideosystem.R;

public class MainActivity extends Activity implements OnClickListener {

	Button btVideoGPS;
	Button btVideoInternet;
	Button btVideoSobre;
	Button btVideoSair;

	Bundle savedInstanceState;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		this.savedInstanceState = savedInstanceState;

		btVideoGPS = (Button) findViewById(R.id.botaoVideoGPS);
		btVideoInternet = (Button) findViewById(R.id.botaoVideoInternet);
		btVideoSobre = (Button) findViewById(R.id.botaoVideoSobre);
		btVideoSair = (Button) findViewById(R.id.botaoVideoSair);

		btVideoGPS.setOnClickListener(this);
		btVideoInternet.setOnClickListener(this);
		btVideoSobre.setOnClickListener(this);
		btVideoSair.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		
		if (view == btVideoGPS) {
			// diferenca do add e replace
			// getFragmentManager().beginTransaction().add(R.id.container, new
			// AboutFragment()).commit();
			// getFragmentManager().beginTransaction().replace(R.id.container, new GPSFragment()).commit();
			ft.replace(R.id.container, new GPSFragment());
			//ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.commit();
		} else if (view == btVideoInternet) {
			ft.replace(R.id.container, new VideoInternetFragment());
			//ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.commit();
		} else if (view == btVideoSobre) {
			ft.replace(R.id.container, new AboutFragment());
			//ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.commit();
		} else if (view == btVideoSair) {
			this.finish();
		}

	}
}
