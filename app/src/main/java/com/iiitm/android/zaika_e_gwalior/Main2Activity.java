package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
      List<Adapternear> adapternearList = new ArrayList<>();
       Context mContext;
       MovieAdapternear movieAdapternear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Places Near By");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
           recyclerView.setLayoutManager(layoutManager);
        movieAdapternear = new MovieAdapternear(adapternearList,this);
        recyclerView.setAdapter(movieAdapternear);
        prepareMovieData();
    }

    private void prepareMovieData() {

        int[] covers = new int[]{
                R.drawable.td,
                R.drawable.orchha,
                R.drawable.mnp,
                R.drawable.skm,
                R.drawable.swf, R.drawable.chanderi, R.drawable.nsnactuary,
                R.drawable.behattt,
                R.drawable.dhume,
                R.drawable.rasslela,

        };


        Adapternear a = new Adapternear(covers[0],"Tighra Dam","Tighra,M.P.","7A.M-7P.m",
                "Tigra Dam creates a freshwater reservoir on the Sank River, about 23 km from Gwalior, Madhya Pradesh, India.It plays a crucial role in supplying water to the city"+"Water output from dam to the Motijheel Filtration Plant Gwalior" + "The dam is 24 metres high at its crest, and 1341 m long. The reservoir has a capacity of 4.8 million cubic metres and the spillway structure can pass up to 1274 cubic metres per second.A dam constructed on this site in 1916 failed on the afternoon of August 4, 1917, due to infiltration into its sandstone foundations. About 1000 people were killed downstream.","Tighra,Gwalior 474001","Boating and water scooter","Summer Season","Not Applicable");
        adapternearList.add(a);

        a = new Adapternear(covers[1],"Orchha","Orchha,Gwalior","08:00 am - 08:00 pm",
                "Orchha Fort is situated on the island on Betwa River. The scenic location apart, the fort has more to offer. It houses many palaces and temples. The three most important palaces seen here are Jahangir Mahal, Raj Mahal and the famous Rai Parveen Mahal. Jahangir Mahal reflects the architectural splendor that prevailed in Orchha in the past. The views from the multi-storeyed balconies in the palace are spectacular. Raj Mahal ranks amongst the most ancient historic monuments in Orchha fort.","Kanchanghat, Distt. Tikamgarh, Orachha, Madhya Pradesh 472246","Cafe and restaurent including indian,chnies and continental","Summer Season","Not Applicable");
        adapternearList.add(a);

        a = new Adapternear(covers[2],"Madhav National Park","Shivpuri,M.P.","06:00 am - 05:00 pm",
                "Madhav National Park is situated in Shivpuri District of Gwalior region in northwest Madhya Pradesh, India.It was named after Madho Rao Scindia,the Maharaja of Gwalior belonging to the Scindia dynasty of the Marathas.It is the ancestral home of the line of ęAli Khan,a region based in Punjab,and most famous for the laws of commonly credited with defining modern day jurisprudence. Shivpuri town is located at 25°40' North, 77°44' East on Agra to Bombay National Highway-3. Shivpuri is steeped in the royal legacy of its past, when it was the summer capital of the Scindia rulers of Gwalior. Earlier its dense forests were the hunting grounds of the Mughal emperors and Maratha royals. Emperor Akbar captured herds of elephants for his stables while returning from Mandu in year 1564","Shivpuri-Jhansi Road,M.P 473551","Boating,Hotel and Cafe","Winter Season"," 15Rs/Person");
        adapternearList.add(a);

        a = new Adapternear(covers[3],"Satkhand Mahal ","Datiya,M.P.","08:00 am- 11:00 pm",
                "Datia Palace also known as Bir Singh Palace or Bir Singh Dev Palace is situated nearly 75 km from Gwalior City in Madhya pradesh.The specialty of this palace is that it is of 7 floor.However neither member from the royal family did ever lived here. The founder of the Datia State in Bundelkhand - Maharaj Birsingh Deo Build many such 52 monuments all around the Country India. Datia's Palace or the Satkhanda Palace is also called Datia Mahal, as well as the Purana Mahal or the \"Old palace\", Historian Abdul Hamid Lahori came to this city with Shahan Jahan on 19 November 1635. He said that the palace was nearly 80 meters long and was also this much broad.He said this as a very beautiful and strong palace.","Datiya-Jhansi Road,M.P.","Hotel and Shopping","Any time","Not Applicable");
        adapternearList.add(a);

        a = new Adapternear(covers[4],"Sultangadh Waterfall","Shivpuri,M.P","10:00 am - 06:00 pm",
                "The mesmerizing waterfall in the region is the sultan garh waterfall.People’s oftenly visited this place in the rainy season due to the lush greenery in the region.The gathering of various colorful butterfly in the nearby region adds beauty to this place.The Sultan Garh Falls is an ideal picnic spot near Shivpuri,which is generally visited during the monsoon season.It is a natural waterfall on the River Parvati.The people visited this place to spend a whole day with family because of its panoramic beauty and easy location.","Shivpuri,M.p. 475330","Bike Riding","Winter season","Not Applicable");
        adapternearList.add(a);


        a = new Adapternear(covers[5],"Chanderi"," Ashoknagar,M.P","10:00 am - 06:00 pm",
                "Chanderi is a town of historic importance right from the time of Malwa Sultans and Bundela Rajputs, who ruled the region in 15th and 16th century. Surrounded by exotic hills, lakes, and forest, this attractive destination is incredibly famous for Chanderi saris and historic monuments that draw a large number of tourists to this place every year. Also, the great Jain monuments and their fascinating culture make Chanderi, one of the most preffered tourist destinations in Madhya Pardesh. There are many things that boost Tourism in Chanderi like Chanderi Fort, Chanderi museum, Jain palaces, and exquisite lakes."," Ashoknagar District,Madhya Pradesh","Hotels and Shopping"," winter between October and April","Not Applicable");
        adapternearList.add(a);


        a = new Adapternear(covers[6],"Chambal Sanctuary"," Dholpur (Rajasthan)","05:00 am - 07:00 pm",
                "This is a perfect destination for the wildlife enthusiasts. It is a habitat of some of the most endangered species, but the main attraction here are, Gharial, Red crowned turtles, Gangetic Dolphins, Indian skimmers, among others.The beautiful sanctuary is surrounded by the Chambal river, known to be one of the cleanest river of India. It provides you a combination of a unique and unpolluted habitat, abundant wildlife and amazing landscapes, medieval temples and magnificent ancient ruins, animal fairs and naga sadhus, far far away from the chaos of the city. Tourists usually rent a motorized boat and go up and down the river as it flows through the ravines which makes for a serene experience. The boatmen are excellent at maneuvering as close to the birds and animals as possible without disturbing them to give you the opportunity to sight beautiful animals facilities"," Dhaulpur ,Madhya Pradesh","Jeep safari, this national park offers river safari, bicycle ride, camel safari.","Nov-Mar is the best time to visit."," Indians: 50INR , Foreigners: 600INR");
        adapternearList.add(a);








    }
}
