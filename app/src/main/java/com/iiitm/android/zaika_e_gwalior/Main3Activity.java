  package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
  List<Adapterevent> adaptereventList = new ArrayList<>();
    Context mContext;
    MovieAdapterevent movieAdapterevent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Event of Gwalior");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
          recyclerView.setLayoutManager(layoutManager);
        movieAdapterevent = new MovieAdapterevent(adaptereventList,this);
         recyclerView.setAdapter(movieAdapterevent);
        prepareMovieData();

    }

    private void prepareMovieData() {
        int[] covers = new int[]{
                R.drawable.gvyapar,
                R.drawable.tansensamaroh,

        };


        Adapterevent a = new Adapterevent(covers[0],"Gwalior Vyapar Meala","gole ka mandir","10:00 am - 12:00 am",
                "Since its setup in 1904, Gwalior Trade Fair has shown immense popularity not only amongst traders, businessman, entrepreneurs and companies in India but also with multi national companies. The state of export facilitation centre also adds extra appeal for the trades and promoters to participate in the fair.\n" + "\n" + "People from all over India throng to this place in order to view and purchase versatile range of products available in the trade fair with special prices. During this trade fair, estimated sales of Rs. 650 crores takes place and approximately over 200 lakh people visits this fair.","Gole Ka Mandir, Station Road, Gwalior, Madhya Pradesh 474005","Conducting every year since 1994","Winter Season","Include every kind of things with verstile range");
        adaptereventList.add(a);


        a = new Adapterevent(covers[1],"Tansen Samaroh","Hazira,Gwalior","06:00 pm-02:00 am",
                "Tansen Samaroh or Tansen Sangeet Samaroh is celebrated every year in the month of December in Behat village of Gwalior district, Madhya Pradesh.It is a 4-day musical extravaganza . Artist and music lovers from all over the world gather here to pay tribute to the Great Indian Musical Maestro Tansen. The event is organized near the tomb of Tansen by the Academy of the department of culture, Government of Madhya Pradesh. Artists from all over India are invited to deliver vocal and instrumental performances.\n" +
                        "\n","Hazira,Gwalior,M.p. 474001","Conducting every year since 1950","From 16 Dec-20 Dec","Gives chance to gather all music and artist lover from all over world ");
        adaptereventList.add(a);







    }
}
