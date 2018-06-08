   package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainfoodActivity extends AppCompatActivity {
  public List<Adapterfood> adapterfoodList = new ArrayList<>();
    public Context mContext;
    MovieAdapterfood movieAdapterfood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainfood);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Food Attraction");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
           recyclerView.setLayoutManager(layoutManager);
        movieAdapterfood = new MovieAdapterfood(adapterfoodList,this);
        recyclerView.setAdapter(movieAdapterfood);

        PrepareMovieData();
    }

    private void PrepareMovieData() {
        int[] covers = new int[]{
                R.drawable.bahadura,
                R.drawable.paratha,
                R.drawable.peda,
                R.drawable.faini,
                R.drawable.milk,
                R.drawable.gajak,
                R.drawable.namkin,
                R.drawable.hakeem,
                R.drawable.ich,
        };


        Adapterfood a = new Adapterfood(covers[0],"Bahadura Sweets","Lashkar,Gwalior","05:00am-11:00pm",
                "Since 85 year, savouring the mouth watering Boondi\n" + "ladoo and Gulab Jamuns.It has very old tradition in the city.Boondi Laddo are prepared from gram flour\n" + "(Besan) and Ghee.Run by Ambika Prasad sharma,this palce has such alluring taste that even former PM Shri Atal Bihari Vajpayee had tasted the ladoo of this place.","Near Bahadura Tiraha,Naya Bazar,Lashkar,Gwalior-474001,","Sweets","400/kg","09407243200");
        adapterfoodList.add(a);

         a = new Adapterfood(covers[1],"Delhi Paratha","sarafa Bazar,Gwalior","08:00 am-09:00pm",
                "The paratha destination of gwalior,savouring the different taste and flavours of paratha.Starting from 150 rupees the place provides type of paratha such as aaloo paratha,paneer paratha,matar paratha and mix paratha along with sabji and different sauces." + "The hand behind this crispy taste are of Mr.Banti sharma.Their which species ,ingrediants like jayfal,nagkesar,dalchini,almond etc and unique preparation amkes the paratha come again and having it due to the taste of desi ghee.","Sarafa Bazaar, Bajrang Katra, Sarafa Bazar, Daulat Ganj,Gwalior-474001","Street Food","150Rs-300Rs/piece","09926213146");
        adapterfoodList.add(a);


         a = new Adapterfood(covers[2],"Dwarika Peda House","Lashkar,Gwalior","10:00am-9:00pm",
                "Originating from the Bhind in the chabal Region,the Bhind peda has rich taste associated with itself starting from 1970 in\n" +
                        "in Bhind(M.p.) the peda got its fans even outside the Gwalior.Run by Mr.Golden Jain in Falka Bazar(Lashkar),the Dwarika Peda is prepared in behind by his brother Mr. Rajeev Jain .\n" +
                        "Ingedients such as Khoya(Milk byproduct),sugar,caddamom etc.The khoya is baked for certain perfect timing and ingredients such as cardmom and dry fruits mixed at that timimg and that is the speciality due to which peda  has got such speciality and test.","Dwarika peda house Mahaveer complex Nai sadak,Gwalior 474001","sweets","400/kg","08435060441");
        adapterfoodList.add(a);

         a = new Adapterfood(covers[3],"Om Ji Faini Wale","Lashkar,Gwalior","7:00am-10:00pm",
                "Situated in the old Dana Oli Market of Lashkar,the place is providing rich and unique delicacy of Faini a dish made up of refined flour (Maida) and Ghee which\n" + "is taken along with milk as a testy and healthy breakfast. The place has old history 70 years and run by Mr.Kishan Lal.The speciality include the items like vanaspati Ghee Faini,Ghee Faini,Ghevar faini,Balushahi and the process itself is self hand-made Faini and hygenic process.","Dana Oli Market,Lashkar,Gwalior474001","Sweets","120/kg-550/kg","09301107766");
        adapterfoodList.add(a);


         a = new Adapterfood(covers[4],"Keshriya Doodh","Achleshwar Road,Gwalior","05:00pm-10:30pm",
                "Sweet caramalise milk has been a special dessert of gwalior during winters.This place in Falka Bazar is famous for its sweet hot milk served in a glass which is the special dessert of winters.\n" +
                        "Providing taste,energy,nutrientsalong with warm milk is staple for many.This sweet milk is prepared using Buffalo milk,kesar,dry fruits,cardamom and flavouring spices and then heated for long time in condensed form.The main speciality lies in the fact that the milk has unique flavour of heating and cardamom which binds people to its taste.He has also a guinees world record and appened in India Got Talent for the longest liquid dribble record of milk dribbling from  4 feet 3 inch.","Near Police Chowki, Falka Bazar, Lashkar, Gwalior,474009","Drink ","30Rs/glass","9122663890");
        adapterfoodList.add(a);
         a = new Adapterfood(covers[5],"Morena Gajak ","Lashkar,Gwalior","09:00am-11:00pm",
                "aaaaaaaaaaaaaaaaaaaaaaaaa","hjsfhjjka","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterfoodList.add(a);
        a = new Adapterfood(covers[6],"Best Namkin","Falka Bazar,Gwalior","10:am-10:pm",
                "Best place to get namkin and different type of petha,bakery and various indian sancks.Since 1960 the place has been a snackhouse of the city and probably this is the best place in gwalior to get different namkin snacks.\n" +
                        "Their uniqueness lies in their handmade spices and ingredients and hygenic process.Their special chivda is favorite of former PM Atal Bihari Vajpayee ji.Their item includes ratlami sev,bikaneri bhujiya,long sev and bekri items like different bekri biscuit,rusk,cackes and chocolate.\"","Phalka Bazar, Near Sunhari Masjid, Lashkar,Gwalior-474009","Snacks,Bakery","150/kg-250/kg","07514068096");
        adapterfoodList.add(a);

        a = new Adapterfood(covers[7],"Hakeem Restaurent","Kailash Vihar,Gwalior","11:00am-11:00pm",
                "Hakeem's, Gwalior is the best destination for Non Veg food and has steadily earned the reputation of being a Non Veg specialist which is offering over 199 dishes under a single roof. Ambiance and taste is good, bills are pocket friendly.\n" +
                        "The www.hakeems.co.in offers complete information of the restaurant. This is a one of the renowned Restaurants in Gwalior. Established in the year 2014, this place is synonymous with delicious food that can satiate all food cravings. It is home to some of the most appreciated cuisines. So as to be able to cater to a large number of diners, it occupies a favourable location at City Centre. Near Nai Dunia Press,Plot No C/13, Kailash Vihar,City Centre-","Plot No C/13, Kailash Vihar,City Centre-474011","Food","Below 500","+(91)-9977025000");
        adapterfoodList.add(a);



    }
}
