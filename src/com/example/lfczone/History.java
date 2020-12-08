package com.example.lfczone;


import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class History extends Activity{
	 private String[] mPlanetTitles;
	 private LinearLayout mDrawerLayout;
	 private ListView mDrawerList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.history);
		//mPlanetTitles = getResources().getStringArray(R.array.planets_array);
    //    mDrawerLayout = (LinearLayout) findViewById(R.id.drawer_layout);
      //  mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        
        // Set the list's click listener
        //mDrawerList.setOnItemClickListener(new OnItemClickListener());

		
	}
	

}
