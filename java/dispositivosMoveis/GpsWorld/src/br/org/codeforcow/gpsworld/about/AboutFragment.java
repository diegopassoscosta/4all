package br.org.codeforcow.gpsworld.about;

import br.org.codeforcow.gpsworld.R;
import br.org.codeforcow.gpsworld.R.layout;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutFragment extends Fragment {
	public AboutFragment() {
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_about, container,
				false);

		return rootView;
	}

}
