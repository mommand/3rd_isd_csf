package com.android.menuitems;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	switch(item.getItemId())
    	{
    	case R.id.item1:
    		Toast.makeText(getApplicationContext(), "Item 1 is selected", Toast.LENGTH_LONG).show();
    		return true;
    	case R.id.item2:
    		Toast.makeText(getApplicationContext(), "Item2 is selected", Toast.LENGTH_LONG).show();
    		return true;
    	case R.id.item3:
    		Toast.makeText(getApplicationContext(), "Item3 is selected", Toast.LENGTH_LONG).show();
    	default:
    		return super.onOptionsItemSelected(item);
    	}
    }
    
}
