package com.chandu.missionhealthy.Model;

import android.webkit.WebView;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;


public class WebViewController extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
