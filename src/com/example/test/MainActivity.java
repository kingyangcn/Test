package com.example.test;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	private MyView myView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myView=(MyView) findViewById(R.id.myView1);
		
	}

	

}
