package br.org.codeforlife.android.multiplebuttonsevent.event;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import br.org.codeforlife.android.multiplebuttonsevent.AboutActivity;
import br.org.codeforlife.android.multiplebuttonsevent.MainActivity;
import br.org.codeforlife.android.multiplebuttonsevent.NewWindowActivity;

public class MainListener implements OnClickListener {

	private MainActivity activity;
	
	public MainListener(Activity activity){
		this.activity = (MainActivity)activity;
	}
	
	@Override
	public void onClick(View view) {
		
		if (view instanceof Button){
			Button bt = ((Button)view);
			
			if(bt.getId() == this.activity.getButtonNewWindow().getId()){
				Intent myIntent = new Intent(view.getContext(), NewWindowActivity.class);
				activity.startActivityForResult(myIntent, 0);
				
			}
			
			if(bt.getId() == this.activity.getButtonAbout().getId()){
				Intent myIntent = new Intent(view.getContext(), AboutActivity.class);
				activity.startActivityForResult(myIntent, 0);
			}
			
			if(bt.getId() == this.activity.getButtonAlert().getId()){
				Toast.makeText(this.activity, "our alert button.", Toast.LENGTH_LONG).show();
			}
				
		}

	}

}
