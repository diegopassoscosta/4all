package com.cow.savingstatefragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class StartFragment extends Fragment implements OnClickListener{
	int count;
	Button aperte;
	TextView texto;
	public StartFragment() {
		super();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if (savedInstanceState == null){
			count = 0;
		}else{
			count = savedInstanceState.getInt("counter");
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		return rootView;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		texto =(TextView)getActivity().findViewById(R.id.editText1);
		aperte =(Button)getActivity().findViewById(R.id.button1);
		aperte.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v == aperte){
			++count;
			texto.setText(""+count);
		}
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("counter", count);
	}

}
