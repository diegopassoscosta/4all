package br.org.codeforcow.capvideosystem;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import com.example.br.org.codeforcow.capvideosystem.R;

@SuppressLint("ValidFragment")
public class VideoFragment extends Fragment {
	MainActivity mainActivity;
	View myFragmentView;
	VideoView videoView;
	Button ativar;

	public VideoFragment() {
	}

	public VideoFragment(MainActivity mainActivity) {
		this.mainActivity = mainActivity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// pesquisar linha a seguir
		myFragmentView = inflater.inflate(R.layout.fragment_video, container,
				false);

		videoView = (VideoView) myFragmentView.findViewById(R.id.videoView);
		videoView.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4");

		MediaController mediaController = new MediaController(mainActivity);
		mediaController.setAnchorView(videoView);
		videoView.setMediaController(mediaController);

		videoView.start();

		ativar = (Button) myFragmentView.findViewById(R.id.botaoAtivar);
		ativar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ativar.setText("ola");
			}
		});

		View rootView = inflater.inflate(R.layout.fragment_video, container,
				false);

		return rootView;
	}
}
