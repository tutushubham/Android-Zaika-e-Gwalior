package com.iiitm.android.zaika_e_gwalior.cardslidertry;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.StyleRes;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.iiitm.android.zaika_e_gwalior.NearbyActivity;
import com.iiitm.android.zaika_e_gwalior.R;
import com.iiitm.android.zaika_e_gwalior.cardslidertry.cards.SliderAdapter;
import com.iiitm.android.zaika_e_gwalior.cardslidertry.utils.DecodeBitmapTask;

import java.util.Random;

public class MainActivitySliderNear extends AppCompatActivity {

    private final int[][] dotCoords = new int[7][2];
    private final int[] pics = {
            R.drawable.td,
            R.drawable.orchha,
            R.drawable.mnp,
            R.drawable.skm,
            R.drawable.swf, R.drawable.chanderi, R.drawable.nsnactuary,

    };
    private final int[] maps ={R.drawable.map_tghra,R.drawable.map_orcha,R.drawable.map_madhav,R.drawable.map_satkhand,R.drawable.map_sultan,R.drawable.map_chanderi,R.drawable.map_chambal};
    private final String[] descriptions = {"Tigra Dam creates a freshwater reservoir on the Sank River, about 23 km from Gwalior, Madhya Pradesh, India.It plays a crucial role in supplying water to the city"+"Water output from dam to the Motijheel Filtration Plant Gwalior" + "The dam is 24 metres high at its crest, and 1341 m long. The reservoir has a capacity of 4.8 million cubic metres and the spillway structure can pass up to 1274 cubic metres per second.A dam constructed on this site in 1916 failed on the afternoon of August 4, 1917, due to infiltration into its sandstone foundations. About 1000 people were killed downstream.",

            "Orchha Fort is situated on the island on Betwa River. The scenic location apart, the fort has more to offer. It houses many palaces and temples. The three most important palaces seen here are Jahangir Mahal, Raj Mahal and the famous Rai Parveen Mahal. Jahangir Mahal reflects the architectural splendor that prevailed in Orchha in the past. The views from the multi-storeyed balconies in the palace are spectacular. Raj Mahal ranks amongst the most ancient historic monuments in Orchha fort.",

            "Madhav National Park is situated in Shivpuri District of Gwalior region in northwest Madhya Pradesh, India.It was named after Madho Rao Scindia,the Maharaja of Gwalior belonging to the Scindia dynasty of the Marathas.It is the ancestral home of the line of ęAli Khan,a region based in Punjab,and most famous for the laws of commonly credited with defining modern day jurisprudence. Shivpuri town is located at 25°40' North, 77°44' East on Agra to Bombay National Highway-3. Shivpuri is steeped in the royal legacy of its past, when it was the summer capital of the Scindia rulers of Gwalior. Earlier its dense forests were the hunting grounds of the Mughal emperors and Maratha royals. Emperor Akbar captured herds of elephants for his stables while returning from Mandu in year 1564",

            "Datia Palace also known as Bir Singh Palace or Bir Singh Dev Palace is situated nearly 75 km from Gwalior City in Madhya pradesh.The specialty of this palace is that it is of 7 floor.However neither member from the royal family did ever lived here. The founder of the Datia State in Bundelkhand - Maharaj Birsingh Deo Build many such 52 monuments all around the Country India. Datia's Palace or the Satkhanda Palace is also called Datia Mahal, as well as the Purana Mahal or the \"Old palace\", Historian Abdul Hamid Lahori came to this city with Shahan Jahan on 19 November 1635. He said that the palace was nearly 80 meters long and was also this much broad.He said this as a very beautiful and strong palace.",

            "The mesmerizing waterfall in the region is the sultan garh waterfall.People’s oftenly visited this place in the rainy season due to the lush greenery in the region.The gathering of various colorful butterfly in the nearby region adds beauty to this place.The Sultan Garh Falls is an ideal picnic spot near Shivpuri,which is generally visited during the monsoon season.It is a natural waterfall on the River Parvati.The people visited this place to spend a whole day with family because of its panoramic beauty and easy location.",

            "Chanderi is a town of historic importance right from the time of Malwa Sultans and Bundela Rajputs, who ruled the region in 15th and 16th century. Surrounded by exotic hills, lakes, and forest, this attractive destination is incredibly famous for Chanderi saris and historic monuments that draw a large number of tourists to this place every year. Also, the great Jain monuments and their fascinating culture make Chanderi, one of the most preffered tourist destinations in Madhya Pardesh. There are many things that boost Tourism in Chanderi like Chanderi Fort, Chanderi museum, Jain palaces, and exquisite lakes.",

            "This is a perfect destination for the wildlife enthusiasts. It is a habitat of some of the most endangered species, but the main attraction here are, Gharial, Red crowned turtles, Gangetic Dolphins, Indian skimmers, among others.The beautiful sanctuary is surrounded by the Chambal river, known to be one of the cleanest river of India. It provides you a combination of a unique and unpolluted habitat, abundant wildlife and amazing landscapes, medieval temples and magnificent ancient ruins, animal fairs and naga sadhus, far far away from the chaos of the city. Tourists usually rent a motorized boat and go up and down the river as it flows through the ravines which makes for a serene experience. The boatmen are excellent at maneuvering as close to the birds and animals as possible without disturbing them to give you the opportunity to sight beautiful animals facilities",
    };
    private final String[] countries = {"Tighra Dam","Orchha","Madhav National Park","Satkhand Mahal ","Sultangadh Waterfall","Chanderi","Chambal Sanctuary"};
    private final String[] places = {"Tighra,M.P.","Orchha,Gwalior","Shivpuri,M.P.","Datiya,M.P.","Shivpuri,M.P"," Ashoknagar,M.P"," Dholpur (Rajasthan)"};
    private final String[] times ={"7A.M-7P.m","08:00 am - 08:00 pm","06:00 am - 05:00 pm","08:00 am- 11:00 pm","10:00 am - 06:00 pm","10:00 am - 06:00 pm","05:00 am - 07:00 pm"};
    private final String[] address={"Tighra,Gwalior 474001","Kanchanghat, Distt. Tikamgarh, Orachha, Madhya Pradesh 472246","Shivpuri-Jhansi Road,M.P 473551","Datiya-Jhansi Road,M.P.","Shivpuri,M.p. 475330"," Ashoknagar District,Madhya Pradesh"," Dhaulpur ,Madhya Pradesh"};
    private final String[] facilities={"Boating and water scooter","Cafe and restaurent including indian,chinese and continental","Boating,Hotel and Cafe","Hotel and Shopping","Bike Riding","Hotels and Shopping","Jeep safari, this national park offers river safari, bicycle ride, camel safari."};
    private final String [] timeVisit={"Summer Season","Summer Season","Winter Season","Any Time","Winter Season"," winter between October and April","Nov-Mar is the best time to visit."};
    private final String[] fee={"Not Applicable","Not Applicable","15Rs/Person","Not Applicable","Not Applicable","Not Applicable"," Indians: 50INR , Foreigners: 600INR"};

    private final SliderAdapter sliderAdapter = new SliderAdapter(pics, 7, new OnCardClickListener());

    private CardSliderLayoutManager layoutManger;
    private RecyclerView recyclerView;
    private ImageSwitcher mapSwitcher;
    // private TextSwitcher temperatureSwitcher;
    private TextSwitcher placeSwitcher;
    private TextSwitcher clockSwitcher;
    private TextSwitcher descriptionsSwitcher;
    private View greenDot;

    private TextView country1TextView;
    private TextView country2TextView;
    private int countryOffset1;
    private int countryOffset2;
    private long countryAnimDuration;
    private int currentPosition;

    private DecodeBitmapTask decodeMapBitmapTask;
    private DecodeBitmapTask.Listener mapLoadListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_slider);

        initRecyclerView();
        initCountryText();
        initSwitchers();
        initGreenDot();
        hideNavigationBar();

    }

    @Override
    protected void onResume() {
        super.onResume();
        hideNavigationBar();
    }


    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    }

    private void initRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(sliderAdapter);
        recyclerView.setHasFixedSize(true);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    onActiveCardChange();
                }
            }
        });

        layoutManger = (CardSliderLayoutManager) recyclerView.getLayoutManager();

        new CardSnapHelper().attachToRecyclerView(recyclerView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isFinishing() && decodeMapBitmapTask != null) {
            decodeMapBitmapTask.cancel(true);
        }
    }

    private void initSwitchers() {
//        temperatureSwitcher = (TextSwitcher) findViewById(R.id.ts_temperature);
//        temperatureSwitcher.setFactory(new TextViewFactory(R.style.TemperatureTextView, true));
//        temperatureSwitcher.setCurrentText(temperatures[0]);

//        temperatureSwitcher.setText("View More");

        placeSwitcher = (TextSwitcher) findViewById(R.id.ts_place);
        placeSwitcher.setFactory(new TextViewFactory(R.style.PlaceTextView, false));
        placeSwitcher.setCurrentText(places[0]);

        clockSwitcher = (TextSwitcher) findViewById(R.id.ts_clock);
        clockSwitcher.setFactory(new TextViewFactory(R.style.ClockTextView, false));
        clockSwitcher.setCurrentText(times[0]);

        descriptionsSwitcher = (TextSwitcher) findViewById(R.id.ts_description);
        descriptionsSwitcher.setInAnimation(this, android.R.anim.fade_in);
        descriptionsSwitcher.setOutAnimation(this, android.R.anim.fade_out);
        descriptionsSwitcher.setFactory(new TextViewFactory(R.style.DescriptionTextView, false));
        descriptionsSwitcher.setCurrentText(descriptions[0]);

        mapSwitcher = (ImageSwitcher) findViewById(R.id.ts_map);
        mapSwitcher.setInAnimation(this, R.anim.fade_in);
        mapSwitcher.setOutAnimation(this, R.anim.fade_out);
        mapSwitcher.setFactory(new ImageViewFactory());
        mapSwitcher.setImageResource(maps[0]);

        mapLoadListener = new DecodeBitmapTask.Listener() {
            @Override
            public void onPostExecuted(Bitmap bitmap) {
                ((ImageView)mapSwitcher.getNextView()).setImageBitmap(bitmap);
                mapSwitcher.showNext();
            }
        };

//        temperatureSwitcher.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivitySlider.this, HistoricalActivity.class);
//
//                intent.putExtra("imageView",pics[currentPosition]);
//                intent.putExtra("textView1",descriptions[currentPosition]);
//                intent.putExtra("textView2",places[currentPosition]);
//                intent.putExtra("textView3",places[currentPosition]);
//                intent.putExtra("textView4",);
//                intent.putExtra("textView5",adapter.getName8());
//                startActivity(intent);
//
//
//            }
//        });
    }

    private void initCountryText() {
        countryAnimDuration = getResources().getInteger(R.integer.labels_animation_duration);
        countryOffset1 = getResources().getDimensionPixelSize(R.dimen.left_offset);
        countryOffset2 = getResources().getDimensionPixelSize(R.dimen.card_width);
        country1TextView = (TextView) findViewById(R.id.tv_country_1);
        country2TextView = (TextView) findViewById(R.id.tv_country_2);

        country1TextView.setX(countryOffset1);
        country2TextView.setX(countryOffset2);
        country1TextView.setText(countries[0]);
        country2TextView.setAlpha(0f);

        country1TextView.setTypeface(Typeface.createFromAsset(getAssets(), "open-sans-extrabold.ttf"));
        country2TextView.setTypeface(Typeface.createFromAsset(getAssets(), "open-sans-extrabold.ttf"));
    }

    private void initGreenDot() {
        mapSwitcher.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mapSwitcher.getViewTreeObserver().removeOnGlobalLayoutListener(this);

                final int viewLeft = mapSwitcher.getLeft();
                final int viewTop = mapSwitcher.getTop() + mapSwitcher.getHeight() / 3;

                final int border = 100;
                final int xRange = Math.max(1, mapSwitcher.getWidth() - border * 2);
                final int yRange = Math.max(1, (mapSwitcher.getHeight() / 3) * 2 - border * 2);

                final Random rnd = new Random();

                for (int i = 0, cnt = dotCoords.length; i < cnt; i++) {
                    dotCoords[i][0] = viewLeft + border + rnd.nextInt(xRange);
                    dotCoords[i][1] = viewTop + border + rnd.nextInt(yRange);
                }

                greenDot = findViewById(R.id.green_dot);
                greenDot.setX(dotCoords[0][0]);
                greenDot.setY(dotCoords[0][1]);
            }
        });
    }

    private void setCountryText(String text, boolean left2right) {
        final TextView invisibleText;
        final TextView visibleText;
        if (country1TextView.getAlpha() > country2TextView.getAlpha()) {
            visibleText = country1TextView;
            invisibleText = country2TextView;
        } else {
            visibleText = country2TextView;
            invisibleText = country1TextView;
        }

        final int vOffset;
        if (left2right) {
            invisibleText.setX(0);
            vOffset = countryOffset2;
        } else {
            invisibleText.setX(countryOffset2);
            vOffset = 0;
        }

        invisibleText.setText(text);

        final ObjectAnimator iAlpha = ObjectAnimator.ofFloat(invisibleText, "alpha", 1f);
        final ObjectAnimator vAlpha = ObjectAnimator.ofFloat(visibleText, "alpha", 0f);
        final ObjectAnimator iX = ObjectAnimator.ofFloat(invisibleText, "x", countryOffset1);
        final ObjectAnimator vX = ObjectAnimator.ofFloat(visibleText, "x", vOffset);

        final AnimatorSet animSet = new AnimatorSet();
        animSet.playTogether(iAlpha, vAlpha, iX, vX);
        animSet.setDuration(countryAnimDuration);
        animSet.start();
    }

    private void onActiveCardChange() {
        final int pos = layoutManger.getActiveCardPosition();
        if (pos == RecyclerView.NO_POSITION || pos == currentPosition) {
            return;
        }

        onActiveCardChange(pos);
    }

    private void onActiveCardChange(int pos) {
        int animH[] = new int[] {R.anim.slide_in_right, R.anim.slide_out_left};
        int animV[] = new int[] {R.anim.slide_in_top, R.anim.slide_out_bottom};

        final boolean left2right = pos < currentPosition;
        if (left2right) {
            animH[0] = R.anim.slide_in_left;
            animH[1] = R.anim.slide_out_right;

            animV[0] = R.anim.slide_in_bottom;
            animV[1] = R.anim.slide_out_top;
        }

        setCountryText(countries[pos % countries.length], left2right);

//        temperatureSwitcher.setInAnimation(MainActivitySlider.this, animH[0]);
//        temperatureSwitcher.setOutAnimation(MainActivitySlider.this, animH[1]);
//        temperatureSwitcher.setText(temperatures[pos % temperatures.length]);

        placeSwitcher.setInAnimation(MainActivitySliderNear.this, animV[0]);
        placeSwitcher.setOutAnimation(MainActivitySliderNear.this, animV[1]);
        placeSwitcher.setText(places[pos % places.length]);

        clockSwitcher.setInAnimation(MainActivitySliderNear.this, animV[0]);
        clockSwitcher.setOutAnimation(MainActivitySliderNear.this, animV[1]);
        clockSwitcher.setText(times[pos % times.length]);

        descriptionsSwitcher.setText(descriptions[pos % descriptions.length]);

        showMap(maps[pos % maps.length]);

        ViewCompat.animate(greenDot)
                .translationX(dotCoords[pos % dotCoords.length][0])
                .translationY(dotCoords[pos % dotCoords.length][1])
                .start();

        currentPosition = pos;
    }

    private void showMap(@DrawableRes int resId) {
        if (decodeMapBitmapTask != null) {
            decodeMapBitmapTask.cancel(true);
        }

        final int w = mapSwitcher.getWidth();
        final int h = mapSwitcher.getHeight();

        decodeMapBitmapTask = new DecodeBitmapTask(getResources(), resId, w, h, mapLoadListener);
        decodeMapBitmapTask.execute();
    }

    private class TextViewFactory implements  ViewSwitcher.ViewFactory {

        @StyleRes final int styleId;
        final boolean center;

        TextViewFactory(@StyleRes int styleId, boolean center) {
            this.styleId = styleId;
            this.center = center;
        }

        @SuppressWarnings("deprecation")
        @Override
        public View makeView() {
            final TextView textView = new TextView(MainActivitySliderNear.this);

            if (center) {
                textView.setGravity(Gravity.CENTER);
            }

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                textView.setTextAppearance(MainActivitySliderNear.this, styleId);
            } else {
                textView.setTextAppearance(styleId);
            }

            return textView;
        }

    }

    private class ImageViewFactory implements ViewSwitcher.ViewFactory {
        @Override
        public View makeView() {
            final ImageView imageView = new ImageView(MainActivitySliderNear.this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

            final LayoutParams lp = new ImageSwitcher.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
            imageView.setLayoutParams(lp);

            return imageView;
        }
    }

    private class OnCardClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            final CardSliderLayoutManager lm =  (CardSliderLayoutManager) recyclerView.getLayoutManager();

            if (lm.isSmoothScrolling()) {
                return;
            }

            final int activeCardPosition = lm.getActiveCardPosition();
            if (activeCardPosition == RecyclerView.NO_POSITION) {
                return;
            }

            final int clickedPosition = recyclerView.getChildAdapterPosition(view);
            if (clickedPosition == activeCardPosition) {
                final Intent intent = new Intent(MainActivitySliderNear.this, NearbyActivity.class);
                intent.putExtra("imageView", pics[activeCardPosition % pics.length]);
                intent.putExtra("imageView1", maps[activeCardPosition % maps.length]);
                intent.putExtra("textView1",descriptions[activeCardPosition%descriptions.length]);
                intent.putExtra("textView2",address[activeCardPosition%address.length]);
                intent.putExtra("textView3",facilities[activeCardPosition%facilities.length]);
                intent.putExtra("textView4",timeVisit[activeCardPosition%timeVisit.length]);
                intent.putExtra("textView5",fee[activeCardPosition%fee.length]);


                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent);
                } else {
                    final CardView cardView = (CardView) view;
                    final View sharedView = cardView.getChildAt(cardView.getChildCount() - 1);
                    final ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(MainActivitySliderNear.this, sharedView, "shared");
                    startActivity(intent, options.toBundle());
                }
            } else if (clickedPosition > activeCardPosition) {
                recyclerView.smoothScrollToPosition(clickedPosition);
                onActiveCardChange(clickedPosition);
            }
        }
    }

}

