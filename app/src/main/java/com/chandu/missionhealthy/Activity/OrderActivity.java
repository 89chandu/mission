package com.chandu.missionhealthy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.chandu.missionhealthy.Models.WebViewController;
import com.chandu.missionhealthy.R;

public class OrderActivity extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        progressBar=findViewById(R.id.pdfProgress);



        WebView webView=findViewById(R.id.orderweb);
        progressBar.setVisibility(View.GONE);
        webView.loadUrl("https://www.amazon.in/s?k=Acupressure+product&ref=nb_sb_noss_2");
        webView.setWebViewClient(new WebViewController());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}