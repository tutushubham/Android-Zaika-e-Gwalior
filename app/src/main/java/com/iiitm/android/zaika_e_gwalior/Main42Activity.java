package com.iiitm.android.zaika_e_gwalior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main42Activity extends AppCompatActivity {

    ImageView imageView;
    TextView textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main42);


        imageView = (ImageView)findViewById(R.id.imageView);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView2 = (TextView)findViewById(R.id.textView2);

        imageView.setImageResource(getIntent().getIntExtra("imageView",00));
        textView2.setText(getIntent().getStringExtra("textView1"));
        textView3.setText(getIntent().getStringExtra("textView2"));
    }
}
