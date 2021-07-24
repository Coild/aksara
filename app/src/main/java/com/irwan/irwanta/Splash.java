package com.irwan.irwanta;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screens);
        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(2500);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally{
                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
