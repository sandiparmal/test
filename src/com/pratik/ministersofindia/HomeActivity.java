package com.pratik.ministersofindia;

import java.util.ArrayList;

import com.pratik.adapters.DynamicListAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;

public class HomeActivity extends Activity {

	private ListView listViewObj;
	private TextView textViewObj;
	private String[] mainvalues = new String[] { "Android", "iPhone", "WindowsMobile",
	        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
	        "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
	        "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
	        "Android", "iPhone", "WindowsMobile" };
	private String[] secondvalues = new String[] { "Android", "iPhone", "WindowsMobile",
	        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
	        "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
	        "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
	        "Android", "iPhone", "WindowsMobile" };
	private DynamicListAdapter listAdapter;
	
	ArrayList<String> list = new ArrayList<String>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        
        initializeViews();
        
        
    }


	private void initializeViews() {
	
    	listViewObj = (ListView)findViewById(R.id.listView);
    	textViewObj = (TextView)findViewById(R.id.labelText);
		listAdapter = new DynamicListAdapter(this, secondvalues,mainvalues);
		listViewObj.setAdapter(listAdapter);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
}
