package com.example.fragmentdraw;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	
	
	
	
	
	
	
	
	
	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		Rect rect = new Rect(50, 50, 300, 300);
		Point p = new Point(rect.centerX(),rect.centerY());
		ImageView iv;
		public PlaceholderFragment() {
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
			// TODO Auto-generated method stub
			super.onActivityCreated(savedInstanceState);
			
		
			Rectangle clasRec = new Rectangle(getActivity());
			LinearLayout mDrawingPad=(LinearLayout)getActivity().findViewById(R.id.view_drawing_pad);
			mDrawingPad.addView(clasRec);
			//LinearLayout linearLayout = (LinearLayout) getActivity()
			//		.findViewById(R.id.container);
			//Rectangle rec = new Rectangle(getActivity());
			//linearLayout.addView(new Rectangle(getActivity()));
			//linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
		}
		
		
		private class Rectangle extends View {
			Paint paint = new Paint();

			public Rectangle(Context context) {
				super(context);
			}

			@Override
			public void onDraw(Canvas canvas) {
				super.onDraw(canvas);
				paint.setColor(Color.BLACK);
				canvas.drawPoint(p.x, p.y, paint);
				paint.setColor(Color.BLUE);
				canvas.drawRect(rect, paint);
				paint.setColor(Color.BLACK);
				
				//calculo centro do retangulo
				canvas.drawLine(0, rect.centerY(), 1000, rect.centerY(), paint);
				canvas.drawLine(rect.centerX(), 0, rect.centerX(), 1000, paint);
				
				//ponto objeto no centro do retangulo
				paint.setColor(Color.RED);
				canvas.drawLine(0,p.y,1000,p.y,paint);
				canvas.drawLine(p.x,0,p.x,1000, paint);
				
				//ok!!! testar no mapa
				
			}
		}
	}

}
