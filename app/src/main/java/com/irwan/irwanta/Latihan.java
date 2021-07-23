package com.irwan.irwanta;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.irwan.irwanta.R;
import com.irwan.irwanta.Signature;
import com.irwan.irwanta.Splash;
import com.irwan.irwanta.helper.GifImageView;

public class Latihan extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tulis);
        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(R.mipmap.ja1);
    }


}
