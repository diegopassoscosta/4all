package br.org.codeforlife.android.geoapp;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	private Button button;
	private TextView latitude;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		latitude = (TextView) findViewById(R.id.textViewLatitudeLarge);
		//longitude = (EditText) findViewById(R.id.editTextLongitude);
		button = (Button)findViewById(R.id.buttonIntencao);
		button.setOnClickListener(new ButtonListener());
		
	}

	private class ButtonListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

			LocationListener locationListener = new LocationListener() {

				public void onLocationChanged(Location location) {

					Double latPoint = location.getLatitude();

					Double lngPoint = location.getLongitude();

					latitude.setText(latPoint.toString());

					//longitude.setText(lngPoint.toString());

				}

				public void onStatusChanged(String provider, int status,
						Bundle extras) {
				}

				public void onProviderEnabled(String provider) {
				}

				public void onProviderDisabled(String provider) {
				}

			};
			locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
