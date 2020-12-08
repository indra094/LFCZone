package com.example.lfczone;

import java.io.IOException;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

public class Squad extends FragmentActivity {
	
 
	
    DemoCollectionPagerAdapter mDemoCollectionPagerAdapter;
    ViewPager mViewPager;
    String cat[]={"Strikers","Midfielders","Defenders","Goalkeepers"};
    
    SquadDB sqdb= new SquadDB(this);

    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempsqd);
        
        
        
      //  final ActionBar actionBar = getActionBar();
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        TextView tv=(TextView)findViewById(R.id.tvsqd);
        
        try {
        	sqdb.createDataBase();
        } catch (IOException ioe) {
         	throw new Error("Unable to create database");
        }
        tv.setText(sqdb.getInfo());
        
 
    }
}

