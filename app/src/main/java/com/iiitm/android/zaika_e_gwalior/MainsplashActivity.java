package com.iiitm.android.zaika_e_gwalior;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        mGwalior=(TextView)findViewById(R.id.textView);
        mJharokha=(TextView)findViewById(R.id.textView2);
        mSpalah=(ImageView)findViewById(R.id.imageView);

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
                    Intent intent = new Intent(MainsplashActivity.this, Main10Activity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };thread.start();

    }
}