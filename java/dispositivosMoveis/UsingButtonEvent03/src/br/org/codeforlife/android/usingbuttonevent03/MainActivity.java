package br.org.codeforlife.android.usingbuttonevent03;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text;
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView)findViewById(R.id.textView);
		button = (Button)findViewById(R.id.button);
		button.setOnClickListener(btListener);
	}

	private OnClickListener btListener = new OnClickListener()
    {

        public void onClick(View v)
        {   
            text.setText("Clicado.....");
        } 

    };
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
