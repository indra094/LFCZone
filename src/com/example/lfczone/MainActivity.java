package com.example.lfczone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	Button[] b=new Button[9];
	View b1;
	TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b[0]=(Button)findViewById(R.id.bhist);
        b[1]=(Button)findViewById(R.id.bsqd);
        b[2]=(Button)findViewById(R.id.bplrs);
        b[3]=(Button)findViewById(R.id.bfixres);
        b[4]=(Button)findViewById(R.id.blegs);
        b[5]=(Button)findViewById(R.id.bmoms);
        b[6]=(Button)findViewById(R.id.bmans);
        b[7]=(Button)findViewById(R.id.bynwa);
        b[8]=(Button)findViewById(R.id.bbye);
        for(int i=0;i<9;i++)
        	b[i].setOnClickListener(this);
        	
    }



	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
			case R.id.bhist:
				Intent i=new Intent("com.example.lfczone.History");
				startActivity(i);
				break;
			case R.id.bsqd:
				Intent i1=new Intent("com.example.lfczone.Squad");
				startActivity(i1);
				break;
			case R.id.bplrs:
				Intent i2=new Intent("com.example.lfczone.Players");
				startActivity(i2);
				break;
			case R.id.bfixres:
				Intent i3=new Intent("com.example.lfczone.FixRes");
				startActivity(i3);
				break;
			case R.id.blegs:
				Intent i4=new Intent("com.example.lfczone.Legends");
				startActivity(i4);
				break;
			case R.id.bmoms:
				Intent i5=new Intent("com.example.lfczone.Moments");
				startActivity(i5);
				break;
			case R.id.bmans:
				Intent i6=new Intent("com.example.lfczone.Managers");
				startActivity(i6);
				break;
			case R.id.bynwa:
				Intent i7=new Intent("com.example.lfczone.YNWA");
				startActivity(i7);
				break;
			case R.id.bbye:
				break;
		}
		
	}
    
}
