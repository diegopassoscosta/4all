package com.example.testemap;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	Rect rect = new Rect(50, 50, 300, 300);
	Point p = new Point(rect.centerX(),rect.centerY());
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Rectangle clasRec = new Rectangle(this);
		LinearLayout mDrawingPad=(LinearLayout)findViewById(R.id.view_drawing_pad);
		mDrawingPad.addView(clasRec);
		

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
