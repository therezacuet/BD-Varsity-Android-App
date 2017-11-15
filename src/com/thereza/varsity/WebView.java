package com.thereza.varsity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class WebView extends Activity {

	View web1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		web1=findViewById(R.id.webView1);
	}



}
