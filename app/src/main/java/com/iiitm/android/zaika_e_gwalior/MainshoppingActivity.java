    package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainshoppingActivity extends AppCompatActivity {

    public List<Adaptershopping> adaptershoppingList = new ArrayList<>();
       Context mContext;
    MovieAdaptershopping movieAdaptershopping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainshopping);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Shopping Attraction");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
         recyclerView.setLayoutManager(layoutManager);
        movieAdaptershopping = new MovieAdaptershopping(adaptershoppingList,this);
        recyclerView.setAdapter(movieAdaptershopping);


        prepareMovieData();


    }

    private void prepareMovieData() {

            int[] covers = new int[]{
                    R.drawable.mb,
                    R.drawable.ddmal,
                    R.drawable.pb,
                    R.drawable.sb,
                    R.drawable.arihant,
                    R.drawable.vm,

            };

        Adaptershopping a = new Adaptershopping(covers[0],"Maharaj Bada","Daulatganj,Gwalior","10:00 am- 09:00 pm",
                "Maharaj Bada or Jiwaji chowk is one of the most significant place of Gwalior, Madhya Pradesh, India. Maharaj Bada, which is sometimes just called as Bada, is the central focus of Gwalior, with a large square, a former opera house, banks, tea, coffee and juice stands and a municipal market building.","Daulatganj,Gwalior 474001");
        adaptershoppingList.add(a);

        a = new Adaptershopping(covers[1],"Dindyal City Mall","Lashkar,Gwalior","10:00 am- 11:00 pm",
                "The Dindayal City Mall with its ultra modern architecture and stylish setting of extensively landscaped greens will be identified as Gwalior's new 21st century landmark.Designed to be an earthquake resistant structure with bigger span pillars the city mall will create a feeling of solidity while retaining elegance. Provisions for rainwater harvesting, a waterfall and fountains will also add to the city Mall's distinctive eco-friendly appeal."," Mlb Road, Lashkar City, Gwalior - 474009, ");
        adaptershoppingList.add(a);


        a = new Adaptershopping(covers[2],"Patankar Bazar","Daulatganj,Gwalior","10:00 am - 09:00 pm",
                "If you want to take back souvenirs, a lot of handicrafts shops offer artistic stone carvings and artifacts. You may visit Patankar Bazaar to have a taste of the authentic crafts of Gwalior. Mrignayani, a shop in the market is especially famous for its impeccable handlooms.","Khurjewala Mohalla, Daulat Ganj, Gwalior, Madhya Pradesh 474009");
        adaptershoppingList.add(a);


        a = new Adaptershopping(covers[3],"Sarafa Bazar","Daulatganj,Gwalior","10:00 am-10:00 pm",
                "Sarafa Bazar is one of the oldest markets in the city and also, the most popular one. If you want to find out more about the handicrafts of this region, drop in here and take a look at the myriad wares on display. Colorful lacquer worked items, traditional handicraft items and more, delight you here. Marvel at the craft and the intricate designs on the boxes, vases and jewelry. Any of these will be a worthy addition to your home or wardrobe. Patterns of gold woven into royal blue, light pink, purple and green soft silken fabric, make you feel like buying all these Chanderi Silk for yourself. Handmade carpets of good quality and pretty colors are also a great buy here","Sarafa Bazar, Daulat Ganj, Gwalior 474001");
        adaptershoppingList.add(a);


        a = new Adaptershopping(covers[4],"Arihant Emporium","Lashkar,Gwalior","10:00 am-10:00 pm",
                "Famous for selling Gwalior style silver boxes decorated with images from the tile work of Man Mandir Palace, this shop is located near Jai Vilas Palace.","Roshni Ghar Mohalla, Lashkar, Gwalior, Madhya Pradesh 474009");
        adaptershoppingList.add(a);

        a = new Adaptershopping(covers[5],"Victoria Market","Lohiya Bazaar, Gwalior","10:00 am-9:00 pm",
                "victoria market, Gwalior is a perfect destination for a great time with your dear ones. Enjoy the attractions of this popular tourist spot. With so much to lure your senses and offer you recreation at its best, get drenched in the spirit of adventure that you get to explore at victoria market, Gwalior. Enjoy together all the points of popular interests and bring back several memorable moments. victoria market, Gwalior is not just the place for sightseeing, but it also enables you to steal a self-indulgent moment for yourself as well"," Lohiya Bazaar, Gwalior, Madhya Pradesh 474001");
        adaptershoppingList.add(a);




        }
}
