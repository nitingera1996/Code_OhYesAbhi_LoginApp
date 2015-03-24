package com.example.loginapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Client extends WebViewClient {
	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		// TODO Auto-generated method stub
		view.loadUrl(url);

		return super.shouldOverrideUrlLoading(view, url);	
	}

}
