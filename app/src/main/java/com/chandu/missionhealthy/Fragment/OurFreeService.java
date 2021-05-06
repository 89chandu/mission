package com.chandu.missionhealthy.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.chandu.missionhealthy.R;
import com.chandu.missionhealthy.Model.WebViewController;

import androidx.fragment.app.Fragment;

public class OurFreeService extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OurFreeService() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoxNewsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OurFreeService newInstance(String param1, String param2) {
        OurFreeService fragment = new OurFreeService();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ourfreeservice, container, false);

//        WebView webView=view.findViewById(R.id.FreeService);
//        webView.loadUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.com%2Ffree-vector%2Fcoming-soon-with-megaphone-design_9504684.htm&psig=AOvVaw2ejYXdGTwoP41A78qSBCjL&ust=1620278955260000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPDDzM7nsfACFQAAAAAdAAAAABAI");
//        webView.setWebViewClient(new WebViewController());
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);


        return  view;


    }

}
