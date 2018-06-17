package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.iiitm.android.zaika_e_gwalior.Adapterkey;
import com.iiitm.android.zaika_e_gwalior.Movieadapterkey;
import com.iiitm.android.zaika_e_gwalior.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivam on 12/19/2017.
 */

public class KeyNumbersHindiActivity extends AppCompatActivity{

    List<Adapterkey> adapterkeyList = new ArrayList<>();
    Context mContext;
    Movieadapterkey movieadapterkey;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("महत्वपूर्ण फोन नंबर ");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieadapterkey = new Movieadapterkey(adapterkeyList,this);
        recyclerView.setAdapter(movieadapterkey);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Adapterkey a = new Adapterkey("पुलिस कंट्रोल रूम","07512445222");
        adapterkeyList.add(a);

        a = new Adapterkey("रोगी वाहन","09914111122");
        adapterkeyList.add(a);
        a = new Adapterkey("अग्निशामक दल","07512342101");
        adapterkeyList.add(a);
        a = new Adapterkey("महिला हेल्पलाइन","07049112018");
        adapterkeyList.add(a);
        a = new Adapterkey("बाल हेल्पलाइन","1098");
        adapterkeyList.add(a);
        a = new Adapterkey("आयुक्त हेल्पलाइन","07512438387");
        adapterkeyList.add(a);
        a = new Adapterkey("कलेक्टर हेल्पलाइन","07512446200");
        adapterkeyList.add(a);
        a = new Adapterkey("सुपरपरेंटेंट पुलिस हेल्पलाइन","07512445200");
        adapterkeyList.add(a);
        a = new Adapterkey("मेयर हेल्पलाइन","07514011151");
        adapterkeyList.add(a);
        a = new Adapterkey("एयर वेे बुकिंग","07512326872");
        adapterkeyList.add(a);
        a = new Adapterkey("रेलवे जांच","131");
        adapterkeyList.add(a);
        a = new Adapterkey("बस स्टैंड पूछताछ","07512341350");
        adapterkeyList.add(a);
        a = new Adapterkey("एयर वेे बुकिंग","07512326872");
        adapterkeyList.add(a);



    }
}
