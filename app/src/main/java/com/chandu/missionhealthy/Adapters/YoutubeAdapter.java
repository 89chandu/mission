package com.chandu.missionhealthy.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chandu.missionhealthy.Models.DataSetList;
import com.chandu.missionhealthy.Activity.VideoFullScreen;
import com.chandu.missionhealthy.Models.YoutubeViewHolder;
import com.chandu.missionhealthy.R;

import java.util.ArrayList;

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeViewHolder> {
    ArrayList<DataSetList> arrayList;
    Context context;


    public YoutubeAdapter(ArrayList<DataSetList> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public YoutubeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.video_per_row, viewGroup, false);
        return new YoutubeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YoutubeViewHolder youtubeViewHolder, int i) {


        final DataSetList current = arrayList.get(i);

        youtubeViewHolder.webView.loadUrl(current.getLink());
        youtubeViewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, VideoFullScreen.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.putExtra("link",current.getLink());
//                Intent i = new Intent(this, Wakeup.class);
                context.startActivity(i);


            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
