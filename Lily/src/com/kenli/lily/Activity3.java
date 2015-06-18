package com.kenli.lily;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Activity3 extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//ÎÞtitle      
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity3);
	}
}
