package com.example.ITA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AspettiStorici extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_storici);


        PDFView pdfView = findViewById(R.id.storiciPdf);
        pdfView.fromAsset("storici.pdf").load();
    







    }









}