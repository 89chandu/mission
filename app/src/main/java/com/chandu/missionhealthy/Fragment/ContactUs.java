package com.chandu.missionhealthy.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.chandu.missionhealthy.R;
import com.chandu.missionhealthy.Model.WebViewController;
import com.chandu.missionhealthy.Model.SlideshowViewModel;

public class ContactUs extends Fragment {

    private SlideshowViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.contactus, container, false);

//        WebView webView=root.findViewById(R.id.contactus);
//        webView.loadUrl("https://chandubo.blogspot.com/p/contact-us_6.html");
//        webView.setWebViewClient(new WebViewController());
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);

//        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });
        return root;
    }
}
