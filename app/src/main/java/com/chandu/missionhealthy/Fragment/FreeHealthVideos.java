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
import com.chandu.missionhealthy.Model.GalleryViewModel;

public class FreeHealthVideos extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.free_health_videos, container, false);

        WebView webView=root.findViewById(R.id.YotubeWeb);
//        webView.loadUrl("https://forms.gle/UU6aNfeMJPo6UtUi7");
        webView.loadUrl("https://www.youtube.com/channel/UCn-QqRGTxmsFdhOTI3qLLzQ/videos");
        webView.setWebViewClient(new WebViewController());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

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