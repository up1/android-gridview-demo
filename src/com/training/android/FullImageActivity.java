package com.training.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.full_image);

		// Get intent data
		Intent i = getIntent();
		// Selected image id
		int position = i.getExtras().getInt("id");
		ImageAdapter imageAdapter = new ImageAdapter(this);

		ImageView imageView = (ImageView) findViewById(R.id.imageView1);
		imageView.setImageResource(imageAdapter.mThumbIds[position]);
	}
}
