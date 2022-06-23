package com.chandu.missionhealthy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.chandu.missionhealthy.Models.WebViewController;
import com.chandu.missionhealthy.R;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        WebView webView=findViewById(R.id.playlist_web);
        webView.loadUrl("https://www.youtube.com/channel/UCn-QqRGTxmsFdhOTI3qLLzQ/videos");
        webView.setWebViewClient(new WebViewController());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}