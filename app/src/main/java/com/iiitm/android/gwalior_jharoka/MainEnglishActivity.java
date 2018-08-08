package com.iiitm.android.gwalior_jharoka;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainEnglishActivity extends AppCompatActivity {
    public List<Adapter> adapterlist  = new  ArrayList<>();
     private Context mContext;
     MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainenglish);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        movieAdapter = new MovieAdapter(adapterlist,this);
        recyclerView.setAdapter(movieAdapter);


        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
        collapsingToolbarLayout.setTitle("Gwalior झरोखा");
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.BLACK);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.black));

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
     //   hideNavigationBar();


    }

    @Override
    protected void onResume() {
        super.onResume();
       // hideNavigationBar();
    }


    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    }


    private void prepareMovieData() {

        int[] covers = new int[]{
                R.drawable.jai_bg,
                R.drawable.sun_bg,
                R.drawable.orcha_bg,
                R.drawable.hotels_bg,
                R.drawable.mediacal_bg,
                R.drawable.contact_bg,
                R.drawable.toilets_bg,
                R.drawable.aboutus_bg,
               // R.drawable.transpotation

        };

        Adapter a = new Adapter("Historical Attraction ",covers[0]);
        adapterlist.add(a);

        a = new Adapter("Worship Attraction",covers[1]);
        adapterlist.add(a);
      /*  a = new Adapter("Shopping Attraction ",covers[3]);
        adapterlist.add(a);*/
        a = new Adapter("Near By Places",covers[2]);
        adapterlist.add(a);
      /*  a = new Adapter("Event of Gwalior",covers[5]);
        adapterlist.add(a);*/
     /*   a = new Adapter(" Gwalior Gharana",covers[6]);
        adapterlist.add(a);*/
        a = new Adapter("Hotels",covers[3]);
        adapterlist.add(a);
        a = new Adapter("Medical",covers[4]);
        adapterlist.add(a);
        a = new Adapter("Key Numbers",covers[5]);
        adapterlist.add(a);

        a = new Adapter("Toilets",covers[6]);
        adapterlist.add(a);
        a = new Adapter("About us", covers[7]);
        adapterlist.add(a);
//        a = new Adapter("Transportation",covers[8]);
//        adapterlist.add(a);


    }
}
