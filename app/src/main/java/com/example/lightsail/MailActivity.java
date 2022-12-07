package com.example.lightsail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        WebView webView = (WebView) findViewById(R.id.mailView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // for javascript support
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webView.loadUrl("https://gmail.com/");
        webView.setWebViewClient(new WebViewController());
    }
}