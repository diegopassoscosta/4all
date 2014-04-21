package br.org.codeforlife.android.usingbuttonevent01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView)findViewById(R.id.textView1);
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new MyButtonListener());
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private class MyButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			text.setText("Precionado..");
			
		}
		
	}

}
