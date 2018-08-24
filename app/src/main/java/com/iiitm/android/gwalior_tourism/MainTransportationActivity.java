package com.iiitm.android.gwalior_tourism;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainTransportationActivity extends AppCompatActivity {

    List<Adapterkey> adapterkeyList = new ArrayList<>();
    Context mContext;
    Movieadapterkey movieadapterkey;
    int select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintransportation);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Nearest Facilites");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieadapterkey = new Movieadapterkey(adapterkeyList,this);
        recyclerView.setAdapter(movieadapterkey);

        select = getIntent().getExtras().getInt("lang");
        prepareMovieData();
       // hideNavigationBar();

    }

    @Override
    protected void onResume() {
        super.onResume();
     //   hideNavigationBar();
    }


    /*private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    }*/

    private void prepareMovieData() {

        if(select==0) {

        Adapterkey a = new Adapterkey("Police","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("ATM","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Petrol Pump","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Bank","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Grocery Store","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Medical Store","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Air port","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Railway Station","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Bus Stand","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("DD Mall","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Post Office","Click to Navigate");
        adapterkeyList.add(a);
        /*a = new Adapterkey("Bus Stand Enquiry","Click to Navigate");
        adapterkeyList.add(a);
        a = new Adapterkey("Air Ways Booking","Click to Navigate");
        adapterkeyList.add(a);
*/       }
        if(select==1){

            Adapterkey a = new Adapterkey("पुलिस","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("ATM","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("पेट्रोल पंप","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("बैंक","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("किराना दुकान","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("चिकित्सा स्टोर","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("हवाई अड्डा","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("रेलवे स्टेशन","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("बस स्टैंड","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("डीडी मॉल","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);
            a = new Adapterkey("डाक घर","नेविगेट करने के लिए क्लिक करें");
            adapterkeyList.add(a);

        }


    }
}
