package br.org.codeforcow.gpsworld.camera;

import java.io.File;

import br.org.codeforcow.gpsworld.R;
import br.org.codeforcow.gpsworld.R.layout;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CameraMapFragment extends Fragment {

	public CameraMapFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_camera_map,
				container, false);
		File mediaFile = new File(Environment.getExternalStorageDirectory()
				.getAbsolutePath() + "/myvideo.mp4");
		Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
		Uri videoUri = Uri.fromFile(mediaFile);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, videoUri);
		startActivityForResult(intent, 101);

		return rootView;

	}

}
