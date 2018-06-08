package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {
    public List<Adaptermedical> adaptermedicalList = new ArrayList<>();
     Context mContext;
    MovieAdaptermedical movieAdaptermedical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Medical");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
         recyclerView.setLayoutManager(layoutManager);
        mContext=this;
        movieAdaptermedical = new MovieAdaptermedical(adaptermedicalList,this);
        recyclerView.setAdapter(movieAdaptermedical);
        prepareMovieData();
    }

    private void prepareMovieData() {
        int[] covers = new int[]{
                R.drawable.apoloh,
                R.drawable.pariwarh,
                R.drawable.navjeevanh,
                R.drawable.kalyanmemorialh,
                R.drawable.shaharah,

        };


        Adaptermedical a = new Adaptermedical(covers[0],"Apolo Spectra","Lashkar,Gwalior","24 Hours",
                "Bariatrics\n" +
                        "Orthopaedics & Spine\n" +
                        "ENT\n" +
                        "General & Laparoscopic Surgery\n" +
                        "Urology\n" +
                        "Ophthalmology","Lashkar, Gwalior, Madhya Pradesh 474002","gfsfhsgdj","gfjhgfjhdegj");
        adaptermedicalList.add(a);

        a = new Adaptermedical(covers[1],"Pariwar Hospital","Lashkar,Gwalior","24 Hours",
                "Paediatric Surgery\n" +
                        "Pain Management","Lashkar, Gwalior, Madhya Pradesh 474001","gfsfhsgdj","gfjhgfjhdegj");
        adaptermedicalList.add(a);

        a = new Adaptermedical(covers[2],"Navjeevan Hospital","Moti Mahal Road ,Gwalior","24 hour",
                "Gynecologist , Obstetrician","Moti Mahal Road, Gwalior, Madhya Pradesh 474002","gfsfhsgdj","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[3],"Kalyan Hospital","Lashkar,Gwalior","24 Hour",
                "Nurologist,Peadiatrician","Lashkar,Gwalior-474001, Hospital road","gfsfhsgdj","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[4],"Shahara Hospital","Vasant Vihar,Gwalior","24 Hours",
                "Deafness surgery - Allergy\n" +
                        "• Cochlear Implant - Septoplasty\n" +
                        "• Endoscopic nasal Surgery","Vasant Vihar, Gwalior, Madhya Pradesh 474007","gfsfhsgdj","gfjhgfjhdegj");
        adaptermedicalList.add(a);



    }
}
