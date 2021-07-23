package com.irwan.irwanta;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.irwan.irwanta.R;
import com.irwan.irwanta.Signature;
import com.irwan.irwanta.Splash;
import com.irwan.irwanta.helper.GifImageView;

public class Latihan extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tulis);
//        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
//        gifImageView.setGifImageResource(R.mipmap.ja1);
        ImageView imageView = findViewById(R.id.gambar);
        Glide.with(this).load(R.mipmap.ba1).into(imageView);
    }


}
