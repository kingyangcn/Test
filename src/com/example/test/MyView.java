package com.example.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MyView extends ImageView {

	public MyView(Context context) {
		super(context);
	}
	

	public MyView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}


	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}


	@Override
	public boolean onTouchEvent(MotionEvent event) {
		System.out.println("-->"+event.getAction());
		return super.onTouchEvent(event);
	}


}
