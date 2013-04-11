package com.npa.publicrelations;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends ExpandableListActivity {

	View listView = findViewById(R.id.listeventi);
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listeventi);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.eventi, menu);
		return true;
	}
}