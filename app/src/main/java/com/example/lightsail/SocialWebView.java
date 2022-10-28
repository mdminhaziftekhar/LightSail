package com.example.lightsail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SocialWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_web_view);

        Intent intent = getIntent();
        String Url = intent.getExtras().getString("link");



        WebView webView = (WebView) findViewById(R.id.socialWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // for javascript support
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webView.loadUrl(Url);
        webView.setWebViewClient(new WebViewController());
    }
}