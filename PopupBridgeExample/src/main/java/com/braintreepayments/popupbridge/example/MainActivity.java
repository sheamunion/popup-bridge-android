package com.braintreepayments.popupbridge.example;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.braintreepayments.popupbridge.PopupBridge;
import com.braintreepayments.popupbridge.example.R;

public class MainActivity extends Activity {

    private static final String LOCALHOST_URL = "http://10.0.2.2:3099";

    private WebView mWebView;
    private PopupBridge mPopupBridge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.web_view);
        mWebView.getSettings().setJavaScriptEnabled(true);

        mPopupBridge = PopupBridge.newInstance(this, mWebView);

        mWebView.loadUrl(LOCALHOST_URL);
    }
}