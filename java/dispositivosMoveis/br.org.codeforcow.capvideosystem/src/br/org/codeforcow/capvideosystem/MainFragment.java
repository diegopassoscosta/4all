package br.org.codeforcow.capvideosystem;
import com.example.br.org.codeforcow.capvideosystem.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.VideoView;

public class MainFragment extends Fragment {
	VideoView videoView;
	Button ativar;
	public MainFragment() {
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		
		
		return rootView;
	}
}
