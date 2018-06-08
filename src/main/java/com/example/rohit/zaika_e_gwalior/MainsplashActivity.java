package com.iiitm.android.zaika_e_gwalior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class MainsplashActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsplash);
        Thread thread = new Thread()
        {

            @Override
            public void run() {

                try {
                    sleep(2500);
                    Intent intent = new Intent(MainsplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };thread.start();

    }
}