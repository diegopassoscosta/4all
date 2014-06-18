/**
 * 
 */
package com.example.br.org.codeforcow.capvideosystem;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author diego
 *
 */
public class MainFragment extends Fragment {
	public MainFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_about, container,
				false);
		
		
		return rootView;
	}
}
