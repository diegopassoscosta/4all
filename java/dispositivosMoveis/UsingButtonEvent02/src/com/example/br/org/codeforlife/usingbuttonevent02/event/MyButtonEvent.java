package com.example.br.org.codeforlife.usingbuttonevent02.event;

import android.view.View;
import android.view.View.OnClickListener;

import com.example.br.org.codeforlife.usingbuttonevent02.MainActivity;

public class MyButtonEvent implements OnClickListener {

	private MainActivity mainActivity;
	
	public MyButtonEvent(MainActivity mainActivity) {
		super();
		this.mainActivity = mainActivity;
	}

	@Override
	public void onClick(View component) {
		this.mainActivity.getText().setText("Clicado....");

	}

}
