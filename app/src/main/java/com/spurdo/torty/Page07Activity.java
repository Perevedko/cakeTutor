package com.spurdo.torty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Page07Activity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page01);

        MobileAds.initialize(this,
                "ca-app-pub-1950220727109099~3026136093");

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        webview = (WebView) findViewById(R.id.webview1);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl("file:///android_asset/index7.html");


    }
}