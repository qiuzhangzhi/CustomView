package com.grasp.customview.activitys;

import com.grasp.customview.R;
import com.grasp.customview.R.layout;
import com.grasp.customview.model.Pointer;
import com.grasp.customview.widgets.TimerButton;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;

public class MultiTouchActivity extends Activity {

	private TextView mDistance;
	
	private Pointer mPointer1;
	
	private Pointer mPointer2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multi_touch);
		
		mDistance = (TextView)findViewById(R.id.distance);
		mPointer1 = new Pointer();
		mPointer2 = new Pointer();
/*		mPointer1.setX(2);
		mPointer1.setY(2);
		
		mPointer2.setX(5);
		mPointer2.setY(6);
	
		Log.d("test", "distance:"+Pointer.getPointerDistance(mPointer1, mPointer2)); */	
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if(event.getPointerCount() == 2){
			mPointer1.setX(event.getX(0));
			mPointer1.setY(event.getY(0));
			
			mPointer2.setX(event.getX(1));
			mPointer2.setY(event.getY(1));
			
			Log.d("test", "distance:"+Pointer.getPointerDistance(mPointer1, mPointer2));
			mDistance.setText(""+Pointer.getPointerDistance(mPointer1, mPointer2));
		}
		return super.onTouchEvent(event);
	}
}
