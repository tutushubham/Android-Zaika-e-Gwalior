  package com.iiitm.android.zaika_e_gwalior;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2historicalActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView3,textView5,textView35,textView8,textView10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2historical);
        imageView = (ImageView)findViewById(R.id.imageView);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView35 = (TextView)findViewById(R.id.textView35);
        textView8 = (TextView)findViewById(R.id.textView8);
        textView10 = (TextView)findViewById(R.id.textView10);


        imageView.setImageResource(getIntent().getIntExtra("imageView",00));
        textView3.setText(getIntent().getStringExtra("textView1"));
        textView5.setText(getIntent().getStringExtra("textView2"));
        textView35.setText(getIntent().getStringExtra("textView3"));
        textView8.setText(getIntent().getStringExtra("textView4"));
        textView10.setText(getIntent().getStringExtra("textView5"));


        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
        collapsingToolbarLayout.setTitle("Zaika-e-Gwalior");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.holo_purple));
        CardView cardView = (CardView)findViewById(R.id.cardview3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.google.co.in/"));
                startActivity(intent);
            }
        });



        CardView cardView2 = (CardView)findViewById(R.id.cardview6);
        String url= textView10.getText().toString().trim();
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:url"));
                startActivity(intent);

            }
        });

    }
}
