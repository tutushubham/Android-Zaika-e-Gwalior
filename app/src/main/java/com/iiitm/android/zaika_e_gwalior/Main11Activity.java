package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main11Activity extends AppCompatActivity {
    public List<Adapterhindi> adapterlist  = new ArrayList<>();
    private Context mContext;
    MovieAdapterHindi movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        movieAdapter = new MovieAdapterHindi(adapterlist,this);
        recyclerView.setAdapter(movieAdapter);


        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
        collapsingToolbarLayout.setTitle("ग्वालियर-झरोखा ");
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.holo_purple));

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.i14);
        Palette.generateAsync(bitmap,
                new Palette.PaletteAsyncListener() {
                    @Override
                    public void onGenerated(Palette palette) {
                        Palette.Swatch vibrant =
                                palette.getVibrantSwatch();
                        int mutedColor = palette.getVibrantSwatch().getRgb();
                        if (vibrant != null) {
                            // If we have a vibrant color
                            // update the title TextView
                            collapsingToolbarLayout.setBackgroundColor(mutedColor);
                            //  mutedColor = palette.getMutedColor(R.attr.colorPrimary);
                            collapsingToolbarLayout.setStatusBarScrimColor(palette.getDarkMutedColor(mutedColor));
                            collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(mutedColor));

                        }
                    }
                });


        prepareMovieData();


    }

    private void prepareMovieData() {

        int[] covers = new int[]{
                R.drawable.newhistorical,
                R.drawable.worship,
                R.drawable.nbyp,
                R.drawable.hotel,
                R.drawable.medical,
                R.drawable.newphone,
                R.drawable.toilets,
                R.drawable.about,R.drawable.transpotation

        };

        Adapterhindi a = new Adapterhindi("ऐतिहासिक जगह ",covers[0]);
        adapterlist.add(a);

        a = new Adapterhindi("पूजा स्थान",covers[1]);
        adapterlist.add(a);
      /*  a = new Adapter("Shopping Attraction ",covers[3]);
        adapterlist.add(a);*/
        a = new Adapterhindi("नजदीकी क्षेत्र ",covers[2]);
        adapterlist.add(a);
      /*  a = new Adapter("Event of Gwalior",covers[5]);
        adapterlist.add(a);*/
     /*   a = new Adapter(" Gwalior Gharana",covers[6]);
        adapterlist.add(a);*/
        a = new Adapterhindi("होटल",covers[3]);
        adapterlist.add(a);
        a = new Adapterhindi("मेडिकल",covers[4]);
        adapterlist.add(a);
        a = new Adapterhindi("महत्वपूर्ण फोन नंबर ",covers[5]);
        adapterlist.add(a);

        a = new Adapterhindi("शौचालय",covers[6]);
        adapterlist.add(a);
        a = new Adapterhindi("फीडबैक ",covers[7]);
        adapterlist.add(a);
        a = new Adapterhindi("परिवहन",covers[8]);
        adapterlist.add(a);




    }
}
