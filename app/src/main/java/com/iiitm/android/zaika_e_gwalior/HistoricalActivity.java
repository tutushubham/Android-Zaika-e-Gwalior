package com.iiitm.android.zaika_e_gwalior;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HistoricalActivity extends AppCompatActivity {
    ImageView imageView, imageView1;
    TextView textView3,textView5,textView35,textView8,textView10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhistorical);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView1 = (ImageView) findViewById(R.id.map2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView35 = (TextView) findViewById(R.id.textView35);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView10 = (TextView) findViewById(R.id.textView10);


        imageView.setImageResource(getIntent().getIntExtra("imageView",00));
        imageView1.setImageResource(getIntent().getIntExtra("imageView1", 00));
        textView3.setText(getIntent().getStringExtra("textView1"));
        textView5.setText(getIntent().getStringExtra("textView2"));
        textView35.setText(getIntent().getStringExtra("textView3"));
        textView8.setText(getIntent().getStringExtra("textView4"));
        textView10.setText(getIntent().getStringExtra("textView5"));


        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
        collapsingToolbarLayout.setTitle("Gwalior-Jharokha");
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.BLACK);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.black));

        CardView cardView = (CardView) findViewById(R.id.cardview3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address;
                // address="City Centre, Opp Tadon Kothi, Gole ka Mandir, Kalpi Road, Gwalior, Madhya Pradesh 474005";
                address = textView5.getText().toString();
                String url = "http://maps.google.com/maps?daddr="+address;
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
            }
        });


        CardView cardView2 = (CardView) findViewById(R.id.cardview6);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone;
                phone = textView10.getText().toString();
                String uri = "tel:" + phone.trim();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(uri));
                startActivity(intent);
            }
        });

        hideNavigationBar();

    }

    @Override
    protected void onResume() {
        super.onResume();
        hideNavigationBar();
    }


    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    }
}
