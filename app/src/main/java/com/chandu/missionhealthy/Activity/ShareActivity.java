package com.chandu.missionhealthy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.chandu.missionhealthy.R;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,"STORY AND STATUS SAVER");
        i.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.chandu.missionhealthy");
        startActivity(Intent.createChooser(i,"Share With"));

    }
}