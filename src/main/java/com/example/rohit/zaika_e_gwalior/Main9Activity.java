package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main9Activity extends AppCompatActivity {
    public List<Adaptertoilets> adaptertoiletsList = new ArrayList<>();
    Context mContext;
    MovieAdaptertoilets movieAdaptertoilets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
          recyclerView.setLayoutManager(layoutManager);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Toilets");
        movieAdaptertoilets = new MovieAdaptertoilets(adaptertoiletsList,this);
        recyclerView.setAdapter(movieAdaptertoilets);
        prepareMovieData();



    }

    private void prepareMovieData() {


        Adaptertoilets a = new Adaptertoilets("Sulabh Jan Suvidha Kendra","Public Bathroom","24 Hours"," Victoria Market, Near Choupati, Phool Bagh Rd, Phool Bagh, Lashkar, Gwalior, Madhya Pradesh 474007","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya Complex","Public Bathroom","7:30AM–9:00PM","Near Boat Club, Phool Bagh, Gwalior, Madhya Pradesh 474007","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sauchalay Complex","Public Bathroom","24 Hours","Khulaa Santar, Sardar Bazar, Morar, Gwalior, Madhya Pradesh 47400","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sauchalay","Public Bathroom","24 Hours","Near Laxmiganj New Mandi, AH47, Laxmi Ganj, Gwalior, Madhya Pradesh 474001","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya","Public Bathroom","24 Hours"," RVS Agriculture University Campus, Thatipur, Gwalior, Madhya Pradesh 474011","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);
    }
}
