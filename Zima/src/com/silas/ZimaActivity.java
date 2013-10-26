package com.silas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ZimaActivity extends Activity {
    /** Called when the activity is first created. */
	//ImageButton visits;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R.layout.main.setBackgroundColor(#3A9F);
        setContentView(R.layout.home);
        
        /*visits = (ImageButton)findViewById(R.id.ImageButton01);
        visits.setOnClickListener(new View.OnClickListener() {    	 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), VisitsActivity.class);
                startActivity(nextScreen);

            }
        });*/
    }
    public void goToVisits(View v) {
        // Do something in response to button
    	//Log.d("mine>>", "onClickedzzzzz");
    	Intent visits = new Intent(v.getContext(), VisitsActivity.class);
    	startActivity(visits);
    }
    public void goToCalendar(View v) {
        // Do something in response to button
    	Intent calendar = new Intent(v.getContext(), CalendarActivity.class);
    	startActivity(calendar);
    }
    
}