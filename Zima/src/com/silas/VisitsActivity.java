package com.silas;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class VisitsActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visits);
        
        TabHost tabHost = getTabHost();
        
        // Tab for entering Visit Info
        TabSpec visitInfo = tabHost.newTabSpec("Visit Info");
        visitInfo.setIndicator("Visit Info", getResources().getDrawable(R.drawable.notebook));
        Intent addVisitInfoIntent = new Intent(this, AddVisitInfoActivity.class);
        visitInfo.setContent(addVisitInfoIntent);
        
        // Tab for Scheduling
        TabSpec schedule = tabHost.newTabSpec("Schedule");
        // setting Title and Icon for the Tab
        schedule.setIndicator("Schedule", getResources().getDrawable(R.drawable.calenda));
        Intent scheduleIntent = new Intent(this, ScheduleVisitActivity.class);
        schedule.setContent(scheduleIntent);
        
        // Tab for Visit history
        TabSpec history = tabHost.newTabSpec("History");
        history.setIndicator("History", getResources().getDrawable(R.drawable.safari));
        Intent historyIntent = new Intent(this, VisitHistoryActivity.class);
        history.setContent(historyIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(visitInfo);
        tabHost.addTab(schedule);
        tabHost.addTab(history);
    }
}