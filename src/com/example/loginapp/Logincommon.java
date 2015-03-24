package com.example.loginapp;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Logincommon extends Activity {

	WebView browser;
	String gotadd;
	String address1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser);

		browser = (WebView) findViewById(R.id.weblink);
		Bundle gotbasket = getIntent().getExtras();
		gotadd = gotbasket.getString("address");
		browser.setWebViewClient(new Client());
		browser.getSettings().setJavaScriptEnabled(true);
		
		//to display zoom out page;
		browser.getSettings().setLoadWithOverviewMode(true);
		browser.getSettings().setUseWideViewPort(true);


		try{
		browser.loadUrl(gotadd);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
	}

	
	
}
