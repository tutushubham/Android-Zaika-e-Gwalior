package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity {

    List<Adapterkey> adapterkeyList = new ArrayList<>();
    Context mContext;
    Movieadapterkey movieadapterkey;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Key Numbers");
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieadapterkey = new Movieadapterkey(adapterkeyList,this);
        recyclerView.setAdapter(movieadapterkey);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Adapterkey a = new Adapterkey("Police Control Room","2445222");
        adapterkeyList.add(a);

        a = new Adapterkey("Ambulance","09914111122");
        adapterkeyList.add(a);
        a = new Adapterkey("Fire Brigade","07512438361");
        adapterkeyList.add(a);
        a = new Adapterkey("Women Helpline","07049112018");
        adapterkeyList.add(a);



    }
}
