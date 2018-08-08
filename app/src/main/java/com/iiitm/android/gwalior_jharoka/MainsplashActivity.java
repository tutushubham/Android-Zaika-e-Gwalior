package com.iiitm.android.gwalior_jharoka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainsplashActivity extends AppCompatActivity {

    TextView mGwalior, mJharokha;
    ImageView mSpalah;

    // Animation
    Animation animFadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsplash);

        mGwalior= (TextView) findViewById(R.id.textView);
        mJharokha= (TextView) findViewById(R.id.textView2);
        mSpalah= (ImageView) findViewById(R.id.imageView);

        // load the animation
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);

        mGwalior.startAnimation(animFadein);
        mJharokha.startAnimation(animFadein);

        Thread thread = new Thread()
        {

            @Override
            public void run() {

                try {
                    sleep(4000);
                    Intent intent = new Intent(MainsplashActivity.this, LanguageScreen.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        thread.start();
      //  hideNavigationBar();

    }

    @Override
    protected void onResume() {
        super.onResume();
       // hideNavigationBar();
    }


    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    }
}