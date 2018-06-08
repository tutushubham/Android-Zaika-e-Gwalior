package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main8Activity extends AppCompatActivity {
    public List<Adapterhotel> adapterhotelList = new ArrayList<>();
     Context mContext;
    MovieAdapterhotel movieAdapterhotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Hotels");
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieAdapterhotel = new MovieAdapterhotel(adapterhotelList,this);
        recyclerView.setAdapter(movieAdapterhotel);
        prePareMovieData();

    }

    private void prePareMovieData() {


        int[] covers = new int[]{
                R.drawable.royalinn,
                R.drawable.grace,
                R.drawable.regency,
                R.drawable.lmark,
                R.drawable.cpark,
                R.drawable.shelter,
                R.drawable.tanseeen, R.drawable.ukiranplace,

        };
        Adapterhotel a = new Adapterhotel(covers[0],"Royal Inn ","City Center,Gwalior","24 hours",
                " Wakeup Calls, Complimentary Newspaper, Reading Lamps, Smoking Rooms, Attached Bathroom, Child Care, Toothbrush/Razor on Request, Television Room, Cable/Satellite TV, Iron/Ironing Board, Coffee Shop/Cafe, Internet/Wi-Fi and parking ","Royal Inn Hotel, City Center Road\n" +
                "Gwalior, Madhya Pradesh - 474011 ","Standard Room 2200INR\n Dulex Room 2700 INR\n Exclusive Siut Room 5000 INR","0751234 0892 ","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[1],"Grace Hotel","Gandhi Road,Gwalior","24 hours",
                "Iron/Ironing Board, Toothbrush/Razor on Request, Desk, Bottled Water in Room, Climate Control, Fax Machine Room, Complimentary Toiletries, Smoking Rooms, Child Care, H/C Water","40, Manik Vilas Colony, Gandhi Road\n" +
                "Gwalior, Madhya Pradesh - 474002 ","AC Dulex Room 1100INR\n EXEcutive Room 1450 INR\n AC Siut Room 1950 INR","+918191900022 ","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[2],"Gwalior Regency Hotel","Gandhi Road,Gwalior","24 hours",
                " \tDesk, Wakeup Calls, Iron/Ironing Board, Fax Machine Room, Slippers, Room Heater, Toothbrush/Razor on Request, Air Conditioning Room, Complimentary Newspaper, Reading Lamps. ","Gwalior Regency Hotel, Gandhi Road\n" +
                "Gwalior, Madhya Pradesh - 474002 "," Dulex Room 3500INR\n EXecutive Room 4800 INR\n Grand Dulex Room 4800 INR","+917417300033","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[3],"Landmark Hotel","Manik Vilas Colony,Gwalior","24 hours",
                "Landmark Hotel, Gwalior serves an exciting range of dishes from varied cuisines.Deluxe, Super Deluxe, Suite and Family Room are the four variants in the accommodation types offered to the guests. Some of the amenities provided in the room are an air-conditioner, sofa, television, tea/coffee maker and mini fridge. Apart from the regular facilities the property holds like a front desk, doctor on call, laundry services, the hotel is ideal for business purposes as it offers conference facilities, business services, audio visual equipment, conference suite and meeting facilities. Undoubtedly it is one of the best hotels in Gwalior Madhya Pradesh.",
                "47, Manik Vilas Colony, Near Railway Station, Gwalior, Madhya Pradesh 474002 ","Maximum Room Rate: 4000INR\n Minimum Room Rate:2500 INR","07514011271","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[4],"The Central Park Hotel","City Center,Gwalior","24 hours",
                "The Central Park hotel offers modern amenities for a comfortable and hassle-free stay. Primary services include room service, internet access, 24-hour front desk, air conditioning, elevators, parking, travel desk and 24-hour security. A business centre is provided for arranging corporate meets and conventions. The amenities inside the business centre includes conference facilities, business services, audio visual equipment, LCD/projector, conference suite and meeting facilities. A gym, pool, flower shop and health club ensures complete rejuvenation. Banquet facilities for community gatherings are an added advantage. A tantalising gourmet treats can be enjoyed at the multi-cuisine eating outlet, Cafe Royal; a coffee shop, Rosebud and a well-stocked bar within the hotel complex.",
                "City Center, Madhav Rao Scindia Marg, Opposite Vishal Megmart, Patel Nagar, Gwalior, Madhya Pradesh 474001 ","Maximum Room Rate: 7500INR\n Minimum Room Rate:3500 INR",": 07512232440","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[5],"Hotel Shelter","Tansen Road,Gwalior","24 hours",
                "The hotel ensures a favourable ambience for work and leisure. Room service, 24-hour front desk, air conditioning, elevators, laundry, parking, travel desk and 24-hour security are the basal services. The set of business amenities comprise conference facilities, business services, audio visual equipment, conference suite, meeting facilities and meeting rooms. Guests have the pleasure of indulging in scrumptious Indian, Chinese, Mughlai and Continental cuisines at Blue Fox, the multi-cuisine onsite restaurant. Black Cadillac Bar, serves International exotic alcoholic beverages to the patrons.",
                " Near Railway Station, Tansen Road, Padav, Gwalior, Madhya Pradesh 474002 ","Maximum Room Rate: 6500 INR\n Minimum Room Rate:2200 INR","07512376209","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[6],"Tansen Residency ","Thatipur,Gwalior","24 hours",
                "A range of features are offered to the guests to make the stay convenient and pleasant. Basic features offered the guests are internet, 24-hour front desk, 24-hour room service, elevators, baby sitting, parking, travel desk, wheel chair access and 24-hour security. Business centre, audio visual equipment satiate the needs of corporate guests. Guests can savour delicious meals and enjoy fine liquor offered in the in-house restaurant and bar respectively. One can also enjoy a sip of hot coffee and munch light snacks in the coffee shop.",
                " LNUPE Campus, Thatipur, Gwalior, Madhya Pradesh 474002 ","Maximum Room Rate: 3300 INR\n Minimum Room Rate:2300 INR","07512340370","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[7],"Taj Usha Kiran Place ","Lashkar,Gwalior","24 hours",
                "",
                "Jayendraganj Lashkar, Gwalior, Madhya Pradesh 474009 ","Maximum Room Rate: 38000INR\n Minimum Room Rate:7000 INR"," 07512444000","hjhjjh");
        adapterhotelList.add(a);





    }
}
