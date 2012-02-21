package com.training.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class GridView2Activity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		GridView gridView = (GridView) findViewById(R.id.gridview);		
		gridView.setAdapter(new ImageAdapter(this));
	
		gridView.setOnItemClickListener(new OnItemClickListener() {			
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				// Sending image id to FullImageActivity
				Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
				// passing array index
				i.putExtra("id", position);
				startActivity(i);
			}
		});
	}
}
