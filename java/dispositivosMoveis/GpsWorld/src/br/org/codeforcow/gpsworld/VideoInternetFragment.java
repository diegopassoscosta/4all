package br.org.codeforcow.gpsworld;

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

@SuppressLint("ValidFragment")
public class VideoInternetFragment extends Fragment implements OnClickListener {
	View rootView;
	VideoView videoView;
	Button ativar;
	MainActivity mainActivity;
	private int count;

	public VideoInternetFragment() {
		super();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState == null) {
			count = 0;

		} else {
			count = savedInstanceState.getInt("counter", count);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_video, container, false);
		return rootView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		videoView = (VideoView) getActivity().findViewById(R.id.videoView);
		videoView
				.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4");
		ativar = (Button) getActivity().findViewById(R.id.botaoAtivar);
		MediaController mediaController = new MediaController(getActivity());
		mediaController.setAnchorView(videoView);
		videoView.setMediaController(mediaController);
		ativar.setOnClickListener(this);
	};

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("counter", count);
	}

	@Override
	public void onClick(View v) {
		// ativar.setText("iniciando video: "+count);
		count++;
		videoView.start();

	}

}
