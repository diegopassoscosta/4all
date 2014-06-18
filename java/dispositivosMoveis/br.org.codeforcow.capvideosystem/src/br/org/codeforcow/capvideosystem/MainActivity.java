package br.org.codeforcow.capvideosystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.br.org.codeforcow.capvideosystem.R;

public class MainActivity extends Activity {
	Button teste;
	MainActivity mainActivity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mainActivity = this;
		teste = (Button)findViewById(R.id.button1);
		teste.setOnClickListener(btListener);
		
				
		if (savedInstanceState == null) {
			//getFragmentManager().beginTransaction().add(R.id.container, new VideoFragment(this)).commit();
		}
	}
	
	Button.OnClickListener btListener = new OnClickListener()
    {

        public void onClick(View v)
        {   
    		teste.setText("Iniciando");
			VideoView videoView = (VideoView)findViewById(R.id.videoView1);
			videoView.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4");

			MediaController mediaController = new MediaController(mainActivity);
			mediaController.setAnchorView(videoView);
			videoView.setMediaController(mediaController);

			videoView.start();

        } 

    };
	 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
//	public static class PlaceholderFragment extends Fragment {
//
//		public PlaceholderFragment() {
//		}
//
//		@Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//			View rootView = inflater.inflate(R.layout.fragment_main, container,
//					false);
//
//			
//			return rootView;
//		}
//	}

}
