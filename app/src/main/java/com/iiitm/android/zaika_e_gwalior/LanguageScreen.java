package com.iiitm.android.zaika_e_gwalior;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LanguageScreen extends AppCompatActivity {
    Button but1,but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlanguage);



        but1 = (Button) findViewById(R.id.button2);
        but2 = (Button) findViewById(R.id.button3);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LanguageScreen.this, MainHindiActivity.class);
                      startActivity(intent);

            }
        });


        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(LanguageScreen.this, MainEnglishActivity.class);
                startActivity(intent);


            }
        });
    }
}

