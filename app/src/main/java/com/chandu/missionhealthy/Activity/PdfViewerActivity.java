package com.chandu.missionhealthy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chandu.missionhealthy.R;
import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewerActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        pdfView = findViewById(R.id.pdfView);

        int chart_position = getIntent().getIntExtra("key_position",0);

        if (chart_position==0) {
            pdfView.fromAsset("weigh_gain.pdf").load();
        }
        else if (chart_position==1) {
            pdfView.fromAsset("wieght_gain.pdf").load();
        }
        else if (chart_position==2) {
            pdfView.fromAsset("weight_loss.pdf").load();
        }



    }
}