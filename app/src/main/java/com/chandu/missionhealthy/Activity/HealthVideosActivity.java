package com.chandu.missionhealthy.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.chandu.missionhealthy.Adapters.YoutubeAdapter;
import com.chandu.missionhealthy.Models.DataSetList;
import com.chandu.missionhealthy.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HealthVideosActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<DataSetList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_videos);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        arrayList = new ArrayList<DataSetList>();

        DataSetList dataSetList = new DataSetList("https://www.youtube.com/embed/t2N7OqjGPuw");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/p0Z2n4WAk4A");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/X9RG_XstOMY");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/upRG96oydVM&t");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/Pc3fCsmF78A");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/upRG96oydVM");
        arrayList.add(dataSetList);


        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
}