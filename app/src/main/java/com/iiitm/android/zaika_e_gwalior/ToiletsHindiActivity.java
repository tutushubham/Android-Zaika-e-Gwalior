package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.iiitm.android.zaika_e_gwalior.Adaptertoilets;
import com.iiitm.android.zaika_e_gwalior.MovieAdaptertoilets;
import com.iiitm.android.zaika_e_gwalior.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivam on 12/19/2017.
 */

public class ToiletsHindiActivity extends AppCompatActivity {

    public List<Adaptertoilets> adaptertoiletsList = new ArrayList<>();
    Context mContext;
    MovieAdaptertoilets movieAdaptertoilets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Toolbar toolbar= findViewById(R.id.toolbar);
        toolbar.setTitle("शौचालय");
        movieAdaptertoilets = new MovieAdaptertoilets(adaptertoiletsList,this);
        recyclerView.setAdapter(movieAdaptertoilets);
        prepareMovieData();

    }

    private void prepareMovieData() {


        Adaptertoilets a = new Adaptertoilets("सुलभ जन सुविधा केंद्र","सार्वजनिक बाथरूम","24 Hours"," विक्टोरिया मार्केट, चौपाती के पास, फूल बाग आरडी, फूल बाग, लश्कर, ग्वालियर, मध्य प्रदेश 474007","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर","सार्वजनिक बाथरूम","7:30AM–9:00PM","बोट क्लब के पास, फूल बाग, ग्वालियर, मध्य प्रदेश 474007","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर","सार्वजनिक बाथरूम","24 Hours","खुला संतर, सरदार बाजार, मोरार, ग्वालियर, मध्य प्रदेश 47400","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय","सार्वजनिक बाथरूम","24 Hours"," लक्ष्मी गंज, ग्वालियर, मध्य प्रदेश 474001","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय","सार्वजनिक बाथरूम","24 Hours", "आरवीएस कृषि विश्वविद्यालय कैम्पस, थातीपुर, ग्वालियर, मध्य प्रदेश 474011","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("सुलभ शौचालय","सार्वजनिक बाथरूम","24 Hours","राष्ट्रीय राजमार्ग 92, मोरार, ग्वालियर, मध्य प्रदेश 474004","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय","सार्वजनिक बाथरूम","24 Hours","ग्वालियर, जयेंद्रगंज, शिंदे की छ्वानी, ग्वालियर, मध्य प्रदेश 474009","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("स्वच्छ सार्वजनिक शौचालय","सार्वजनिक बाथरूम","24 Hours"," ललितपुर कॉलोनी, लश्कर, ग्वालियर, मध्य प्रदेश 474009","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सरकारी शौचालय","सार्वजनिक बाथरूम","24 Hours","नौगाजा आरडी के पास, शिंदे की छ्वानी, ग्वालियर, मध्य प्रदेश 474001","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("स्वच्छ सार्वजनिक शौचालय","सार्वजनिक बाथरूम","24 Hours","महाराणा प्रताप नगर, लश्कर, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("स्वच्छ शौचालय","सार्वजनिक बाथरूम","24 Hours","पारधी मोहल्ला, शेख की बागिया, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("जैव शौचालय","सार्वजनिक बाथरूम","24 Hours","लश्कर, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सामुदायिक शौचालय","सार्वजनिक बाथरूम","24 Hours","घासमंंडी, मिर्जापुर, घाटमपुर, ग्वालियर, मध्य प्रदेश ","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर","सार्वजनिक बाथरूम","24 Hours","माधव औषधालय, अस्पताल रोड, लश्कर, ग्वालियर,","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सार्वजनिक मूत्रालय","सार्वजनिक बाथरूम","24 Hours","सराफा बाजार, बाडा, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("सुलभ शौचालय","सार्वजनिक बाथरूम","24 Hours", "काम्पू, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय","सार्वजनिक बाथरूम","24 Hours","जवाहर कॉलोनी, वार्ड नं 46, ग्वालियर, मध्य प्रदेश ","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सिटी शौचालय","सार्वजनिक बाथरूम","24 Hours","मयूर नगर, थातीपुर, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);



        a = new Adaptertoilets("सुलभ शौचालय ","सार्वजनिक बाथरूम","24 Hours","जिंशी नाला नंबर: 1, अनटपुल, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("सुलभ शौचालय परिसर","सार्वजनिक बाथरूम","24 Hours","ललितपुर कॉलोनी, लश्कर, ग्वालियर, मध्य प्रदेश","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("सुलभ शौचालय","सार्वजनिक बाथरूम","24 Hours","सिटी सेंटर, तुलसी विहार कॉलोनी, ग्वालियर, मध्य प्रदेश 474002 ","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("नगर निगम शौचालय","सार्वजनिक बाथरूम","24 Hours","महलगांव, ग्वालियर, मध्य प्रदेश 474002 ","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("सुलभ शौचालय परिसर","सार्वजनिक बाथरूम","24 Hours","जे। ए। अस्पताल परिसर, लश्कर, ग्वालियर, मध्य प्रदेश 474009 ","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर","सार्वजनिक बाथरूम","24 Hours","सिंधी कॉलोनी रोड, ग्वालियर, मध्य प्रदेश 474001","hfhgdshfh","hgjsdghfh");
        adaptertoiletsList.add(a);
    }
}
