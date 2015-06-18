package com.kenli.lily;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//ÎÞtitle      
	    requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity1);
		
	}

	
}
