package com.iiitm.android.zaika_e_gwalior;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Main7Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        CardView cardView1 = (CardView)findViewById(R.id.cardview6);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:09826189049"));
                startActivity(i);
            }
        });
        CardView cardView2 = (CardView)findViewById(R.id.cardview7);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("tel:08989472401"));
                startActivity(i);
            }
        });
        CardView cardView3 = (CardView)findViewById(R.id.cardview8);
        cardView3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("tel:08210051410"));
                startActivity(i);
            }
        });

        CardView cardView4 = (CardView)findViewById(R.id.cardview9);
        cardView4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("tel:08210051410"));
                startActivity(i);
            }
        });


    }
}
