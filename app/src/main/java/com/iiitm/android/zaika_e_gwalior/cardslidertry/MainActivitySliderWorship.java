package com.iiitm.android.zaika_e_gwalior.cardslidertry;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
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

import com.iiitm.android.zaika_e_gwalior.R;
import com.iiitm.android.zaika_e_gwalior.WorshipActivity;
import com.iiitm.android.zaika_e_gwalior.cardslidertry.cards.SliderAdapter;
import com.iiitm.android.zaika_e_gwalior.cardslidertry.utils.DecodeBitmapTask;

import java.util.Random;

public class MainActivitySliderWorship extends AppCompatActivity {

    private final int[][] dotCoords = new int[9][2];
    private final int[] pics = { R.drawable.at,
            R.drawable.gkehanuman,
            R.drawable.gupteshwer,
            R.drawable.gdbc,
            R.drawable.hkhawaza,
            R.drawable.smt,
            R.drawable.st,
            R.drawable.carthedral, R.drawable.sanichra,
            };
    private final int[] maps ={R.drawable.map_achaleshwar,R.drawable.map_gargaj,R.drawable.map_gupteshwar,R.drawable.map_guru_data,R.drawable.map_dargah_khwaja,R.drawable.map_shitla,R.drawable.map_sun,R.drawable.map_cathedral,R.drawable.map_shnichar};
    private final String[] descriptions = {"Shri achleshwar temple is the very famous temple in Gwalior, where people comes to worship Lord Shiva and Nandi. Nandi is usually depicted as a bull which also serves as the mount to the God Shiva. It is a very known myth among the city people  about the temple that once scindia ruler Shri Madhorao Scindia Ji were constructing road on that path but the Shivling keep as  still in path earlier thay thought it is any rock or something and they were continuously   trying to remove that rock but still they were unable to find depth of that rock and so Maharaj was in a great dilemma,and one night Lord Achalnath itself appeared in his dream and told him that the thing he is supposing to be rock is actually his form and he is there to bless devotees. Lord ordered him to build a great temple there and from next day Shivling start worshipping and temple got constructed as Achleshwar Temple in middle of the city.",

            "Gwalior town in the Indian state of Madhya Pradesh has been the penitentiary of Galav Sage in ancient times. In this supreme holy place, the ancient temple of Sankatmokhan Siddha Shri Khedapati ji Hanuman is situated. From here onwards, the arrival of devotees starts from 4 a.m. every night, which runs at an uninterrupted speed.\n" +
                    "The temple is run by Shri Ram Janaki Temple, small house, Sri Siddha Khedapati Hanuman Trust, Gwalior. The text of Ramayana and Sundar Kand is kept in the temple. Devotees are fed by the devotees to the poor. Special electrification and flower arrangement is done on the occasion of Hanuman Jayanti. Shree Khedapati Ji is offered a Chappan Bhoga to God.",

            "The Gupteshwar temple is a centre of great spirituality among the people. The temple is located inside the Forest .There is a large rush during the month of Shravan in temple known as the month of Lord Shiva  and Abhishek programs carry out during whole of the year.The temple is located on a large hill on the road leading to Tighra.Along with Shivling there is a temple of Maa and Lord Ram-Sita. The place has a huge auspiciousness associated with Lord Shiva.",

            "Gurudwara Data Bandi Chhod is a memorial constructed in the memory of Guru Hargobind Sahib, the 6th Sikh Guru. History states that Guru Hargobind Sahib was imprisoned in the premises by Jehangir for over two years. During the time of release of the guru, he also wanted 52 Hindu kings, who were his fellow prisoners, to be released.Built inside the Gwalior Fort, the Gurudwara was constructed in 1970. Made up of marble and colourful stained glass exteriors, the Gurudwara is one of the significant Sikh pilgrimage sites and is visited by many tourists each year. Jehangir gave instructions that whoever holds the robe of Guru would be freed. This incident earned the Guru the title of Data Bandi Chhod.",

            "Dargah Khwaja Kanoon Sahib was built in the memory of Khwaja Kanoon Sahib Nagauri. He was a resident of Marwad and arrived in Gwalior during 1481. His full name was Saiyed Saiyeeduddin Kanoon Rehmat Ullah Aleh chishtiya, which is carved on the dome of the Dargah.  To serve the parents, to respect the elders and to obey the Pious and the En lightened were the cherished principles of his life.\n" +
                    "Khwaja Ismail blessed Khanoon Sahib with all that heavenly wisdom and insight which he himself had imbibed from his father and preceptor. He instructed Khanoon Sahib to first go to Aimer and then to settle at Gwalior to spread out the message of God and the gospel of truth and righteousness.",

            "Sheetla Mata temple is a temple dedicated to the Mata Sheetla Devi",

            "Surya Mandir, also known as Sun Temple, is the replica of the famous Sun Temple of Konark in Orissa. Dedicated to the Sun god, the temple is situated near the residency at Morar, and is one of the pilgrimage places in the region.The temple was constructed by G.D. Birla, the famous industrialist of India in 1988. Surya Mandir is constructed using red sand stone and white marble.The exterior of the temple is decorated with red sand stone while the interiors present a perfect white marble work. The exteriors of the temple are also decorated with numerous stone carved images depicting various Hindu gods.",

            "It is famous church place  in Gwalior",

            "The Shanichara Temple made  of stone at Aeti is rather special, though it doesn’t appear so from the outside. It houses the original black idol of Shani brought from Lanka (presently Sri Lanka).Legend has it that Shanideva was held prisoner by the demon-king Ravana (king of Lanka), in the Hindu epic Ramayana. The dusty village of Aeti came into being only after the temple was established. Earlier it was just a barren hilltop dotted with a few trees .",


    };
    private final String[] countries = {"Achaleshwar Temple","Gargaj Ke Hanuman","Gupteshwar Temple","Gurudwara Data Bandi","Dargah Khawaja","Shitla Mata Mandir","Sun Temple","St.John Cathedral","Shanishchara Temple"};
    private final String[] places = {"Gwalior,M.p.","Bahodapur,Gwalior","Tighra Road,Gwalior","Gwalior Fort,Gwalior","Near Gwalior Fort","Shivaji Nagar,Gwalior","Near BIMR,Gwalior","Phalka Bazar,Gwalior","Aiti Barahwali,Gwalior"};
    private final String[] times ={"10:00 am - 06:00 pm","10:00 am - 06:00 pm","09:00 am- 08:00 pm","24 hours","06:00 am- 10:00 pm","10:00 am - 08:00 pm","8:00 am-5:00 pm","10:00 am -10:00 pm","10:00 am -10:00 pm"};
    private final String[] address={"Lalitpur Colony, Lashkar, Gwalior, Madhya Pradesh 474009","Laxmi Ganj, Gwalior, Madhya Pradesh 474008","Tighra Road, Gwalior, Madhya Pradesh 475330","Gwalior Fort,Gwalior","Near Gwalior Fort","shivaji Nagar,Gwalior","Morar,Gwalior  M.P"," Phalka Bazar, Lashkar, Gwalior, Madhya Pradesh 474015"," Aiti Barahwali, Madhya Pradesh, Gwalior 476444"};


    private final SliderAdapter sliderAdapter = new SliderAdapter(pics, 9, new OnCardClickListener());

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
      //  hideNavigationBar();

    }

    @Override
    protected void onResume() {
        super.onResume();
       // hideNavigationBar();
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
        mapSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CardSliderLayoutManager lm =  (CardSliderLayoutManager) recyclerView.getLayoutManager();
                final int activeCardPosition = lm.getActiveCardPosition();
                String address1;
                // address="City Centre, Opp Tadon Kothi, Gole ka Mandir, Kalpi Road, Gwalior, Madhya Pradesh 474005";
                address1 = address[activeCardPosition%address.length];
                String url = "http://maps.google.com/maps?daddr="+address1;
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
            }
        });

//        temperatureSwitcher.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivitySliderHistorical.this, Mainhistorical2Activity.class);
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

//        temperatureSwitcher.setInAnimation(MainActivitySliderHistorical.this, animH[0]);
//        temperatureSwitcher.setOutAnimation(MainActivitySliderHistorical.this, animH[1]);
//        temperatureSwitcher.setText(temperatures[pos % temperatures.length]);

        placeSwitcher.setInAnimation(MainActivitySliderWorship.this, animV[0]);
        placeSwitcher.setOutAnimation(MainActivitySliderWorship.this, animV[1]);
        placeSwitcher.setText(places[pos % places.length]);

        clockSwitcher.setInAnimation(MainActivitySliderWorship.this, animV[0]);
        clockSwitcher.setOutAnimation(MainActivitySliderWorship.this, animV[1]);
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
            final TextView textView = new TextView(MainActivitySliderWorship.this);

            if (center) {
                textView.setGravity(Gravity.CENTER);
            }

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                textView.setTextAppearance(MainActivitySliderWorship.this, styleId);
            } else {
                textView.setTextAppearance(styleId);
            }

            return textView;
        }

    }

    private class ImageViewFactory implements ViewSwitcher.ViewFactory {
        @Override
        public View makeView() {
            final ImageView imageView = new ImageView(MainActivitySliderWorship.this);
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
                final Intent intent = new Intent(MainActivitySliderWorship.this, WorshipActivity.class);
                intent.putExtra("imageView", pics[activeCardPosition % pics.length]);
                intent.putExtra("imageView1", maps[activeCardPosition % maps.length]);
                intent.putExtra("textView1",descriptions[activeCardPosition%descriptions.length]);
                intent.putExtra("textView2",address[activeCardPosition%address.length]);

                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent);
                } else {
                    final CardView cardView = (CardView) view;
                    final View sharedView = cardView.getChildAt(cardView.getChildCount() - 1);
                    final ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(MainActivitySliderWorship.this, sharedView, "shared");
                    startActivity(intent, options.toBundle());
                }
            } else if (clickedPosition > activeCardPosition) {
                recyclerView.smoothScrollToPosition(clickedPosition);
                onActiveCardChange(clickedPosition);
            }
        }
    }

}

