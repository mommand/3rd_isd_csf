package com.android.explicitintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_two extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView vt = new TextView(this);
		vt.setText("Second Activity");
		setContentView(R.layout.activity_two);
		Bundle extras = getIntent().getExtras();
		String value1 = extras.getString("value1");
		String value2 = extras.getString("value2");
		Toast.makeText(getApplicationContext(), "Values are:\n First value:"+value1+"\n Second Value:"+value2, Toast.LENGTH_LONG).show();
		Button btn1 = (Button)findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Activity_one.class);
				startActivity(i);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_two, menu);
		return true;
	}

}
