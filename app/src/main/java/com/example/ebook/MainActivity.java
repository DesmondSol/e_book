package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    private PDFView pdfview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pdfview = findViewById(R.id.pdfViewer);

        pdfview.useBestQuality(true);
        pdfview.enableSwipe(true);
        pdfview.fitToWidth();
        pdfview.fromAsset("kotlinbook.pdf").load(); //. a demo pdf file was put in res folder

    }
}
