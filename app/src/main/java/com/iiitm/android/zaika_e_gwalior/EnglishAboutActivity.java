package com.iiitm.android.zaika_e_gwalior;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EnglishAboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainengabout);


       /* CardView cardView1 = (CardView)findViewById(R.id.cardview6);
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

        Copyright 2018 Anurag Srivastava

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

        */
       // hideNavigationBar();

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
