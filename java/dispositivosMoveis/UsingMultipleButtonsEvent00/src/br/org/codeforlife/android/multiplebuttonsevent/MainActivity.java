package br.org.codeforlife.android.multiplebuttonsevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import br.org.codeforlife.android.multiplebuttonsevent.event.MainListener;

public class MainActivity extends Activity {
	private Button buttonNewWindow;
	private Button buttonAbout;
	private Button buttonAlert;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MainListener myAppListener = new MainListener(this);
		
		buttonNewWindow = (Button)findViewById(R.id.button_new_window);
		buttonNewWindow.setOnClickListener(myAppListener);
			
		buttonAbout = (Button)findViewById(R.id.button_about);
		buttonAbout.setOnClickListener(myAppListener);
		
		buttonAlert = (Button)findViewById(R.id.button_alert);
		buttonAlert.setOnClickListener(myAppListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public Button getButtonAbout() {
		return buttonAbout;
	}

	public Button getButtonNewWindow() {
		return buttonNewWindow;
	}
	
	public Button getButtonAlert() {
		return buttonAlert;
	}


}
