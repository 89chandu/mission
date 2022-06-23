package com.chandu.missionhealthy.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.chandu.missionhealthy.R;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        getSupportActionBar().hide();

        Thread thread = new Thread () {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();

                } finally {
                    Intent intent = new Intent(Splash_Activity.this , MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();

    }
}