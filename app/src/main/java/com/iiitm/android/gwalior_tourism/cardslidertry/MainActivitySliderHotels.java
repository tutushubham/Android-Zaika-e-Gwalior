package com.iiitm.android.gwalior_tourism.cardslidertry;

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

import com.iiitm.android.gwalior_tourism.HotelActivity;
import com.iiitm.android.gwalior_tourism.R;
import com.iiitm.android.gwalior_tourism.cardslidertry.cards.SliderAdapter;
import com.iiitm.android.gwalior_tourism.cardslidertry.utils.DecodeBitmapTask;

import java.util.Random;

public class MainActivitySliderHotels extends AppCompatActivity {

    private final int[][] dotCoords = new int[8][2];
    private final int[] pics = {
            R.drawable.royalinn,
            R.drawable.grace,
            R.drawable.regency,
            R.drawable.lmark,
            R.drawable.cpark,
            R.drawable.shelter,
            R.drawable.tanseeen, R.drawable.ukiranplace,

    };
    private final int[] maps ={R.drawable.map_royalinn,R.drawable.map_grace,R.drawable.map_regency,R.drawable.map_landmark,R.drawable.map_central,R.drawable.map_shelter,R.drawable.map_tansen,R.drawable.map_usha};
    private final String[] descriptions = {  " Located in the heart of Gwalior, The Hotel Royal Inn, hosts most beautiful banquet halls of Gwalior in addition to popular restaurants to satisfy and exceed everyone's hospitality needs.It provide many facilities such as   Television Room, Climate Control, Desk, Cable/Satellite TV, Air Conditioning Room, Child Care, Internet Access, Wakeup Calls, Reading Lamps, Bottled Water in Room,Currency Exchange, Business Facilities, Disabled Facilities, Doctor on Call, Exhibit Space, Conference Hall, Wedding Services, Bar, Coffee Shop/Cafe, Security Guard.","Grace Hotel has spacious rooms with balconies providing full ventilation & natural air. Room facility includes attached bath, running hot and cold water, refrigerator, cable color television and direct dial service.Hotel facilities includes round the clock room service, doctor on call, travel desk, same day laundry and generator back up. Hotel accepts all major credit cards.", "The Gwalior Regency  hotel ensures a favourable ambience for work and leisure. Room service, 24-hour front desk, air conditioning, elevators, laundry, parking, travel desk and 24-hour security are the basal services. The set of business amenities comprise conference facilities, business services, audio visual equipment, conference suite, meeting facilities and meeting rooms. Guests have the pleasure of indulging in scrumptious Indian, Chinese, Mughlai and Continental cuisines at Blue Fox, the multi-cuisine onsite restaurant. Black Cadillac Bar, serves International exotic alcoholic beverages to the patrons. ","Landmark Hotel, Gwalior serves an exciting range of dishes from varied cuisines.Deluxe, Super Deluxe, Suite and Family Room are the four variants in the accommodation types offered to the guests. Some of the amenities provided in the room are an air-conditioner, sofa, television, tea/coffee maker and mini fridge. Apart from the regular facilities the property holds like a front desk, doctor on call, laundry services, the hotel is ideal for business purposes as it offers conference facilities, business services, audio visual equipment, conference suite and meeting facilities. Undoubtedly it is one of the best hotels in Gwalior Madhya Pradesh.", "The Central Park hotel offers modern amenities for a comfortable and hassle-free stay. Primary services include room service, internet access, 24-hour front desk, air conditioning, elevators, parking, travel desk and 24-hour security. A business centre is provided for arranging corporate meets and conventions. The amenities inside the business centre includes conference facilities, business services, audio visual equipment, LCD/projector, conference suite and meeting facilities. A gym, pool, flower shop and health club ensures complete rejuvenation. Banquet facilities for community gatherings are an added advantage. A tantalising gourmet treats can be enjoyed at the multi-cuisine eating outlet, Cafe Royal; a coffee shop, Rosebud and a well-stocked bar within the hotel complex.", "The hotel ensures a favourable ambience for work and leisure. Room service, 24-hour front desk, air conditioning, elevators, laundry, parking, travel desk and 24-hour security are the basal services. The set of business amenities comprise conference facilities, business services, audio visual equipment, conference suite, meeting facilities and meeting rooms. Guests have the pleasure of indulging in scrumptious Indian, Chinese, Mughlai and Continental cuisines at Blue Fox, the multi-cuisine onsite restaurant. Black Cadillac Bar, serves International exotic alcoholic beverages to the patrons.","A range of features are offered to the guests to make the stay convenient and pleasant. Basic features offered the guests are internet, 24-hour front desk, 24-hour room service, elevators, baby sitting, parking, travel desk, wheel chair access and 24-hour security. Business centre, audio visual equipment satiate the needs of corporate guests. Guests can savour delicious meals and enjoy fine liquor offered in the in-house restaurant and bar respectively. One can also enjoy a sip of hot coffee and munch light snacks in the coffee shop.", " Taj Usha Kiran Palace offers accommodation with a balcony and WiFi access.Along with a full-service spa, this hotel has a restaurant and an outdoor pool. Free WiFi in public areas and free self parking are also provided. Additionally, a fitness center, a coffee shop/café, business services, conference suite , cocktail lounge, free newspaper, meeting facility, conference hall , gym and etc.",
    };
    private final String[] countries = {"Royal Inn ","Grace Hotel","Gwalior Regency Hotel","Landmark Hotel","The Central Park Hotel","Hotel Shelter","Tansen Residency ","Taj Usha Kiran Place "};
    private final String[] places = {"City Center,Gwalior","Gandhi Road,Gwalior","Gandhi Road,Gwalior","Manik Vilas Colony,Gwalior","City Center,Gwalior","Tansen Road,Gwalior","Thatipur,Gwalior","Lashkar,Gwalior"};
    private final String[] times ={"24 hours","24 hours","24 hours","24 hours","24 hours","24 hours","24 hours","24 hours"};
    private final String[] address={"Royal Inn Hotel, City Center Road\n" +
            "Gwalior, Madhya Pradesh - 474011 ","40, Manik Vilas Colony, Gandhi Road\n" +
            "Gwalior, Madhya Pradesh - 474002 ","Gwalior Regency Hotel, Gandhi Road\n" +
            "Gwalior, Madhya Pradesh - 474002 ","47, Manik Vilas Colony, Near Railway Station, Gwalior, Madhya Pradesh 474002 ",  "City Center, Madhav Rao Scindia Marg, Opposite Vishal Megmart, Patel Nagar, Gwalior, Madhya Pradesh 474001 ", " Near Railway Station, Tansen Road, Padav, Gwalior, Madhya Pradesh 474002 "," LNUPE Campus, Thatipur, Gwalior, Madhya Pradesh 474002 ","Jayendraganj Lashkar, Gwalior, Madhya Pradesh 474009 "};
    private final String[] contact={"0751234 0892 ","+918191900022 ","+917417300033","07514011271"," 07512232440","07512376209","07512340370"," 07512444000",};
    private final String[] fee={"Standard Room 2200 INR\n Dulex Room 2700 INR\n Exclusive Siut Room 5000 INR","AC Dulex Room 1100 INR\n EXEcutive Room 1450 INR\n AC Siut Room 1950 INR"," Dulex Room 3500 INR\n EXecutive Room 4800 INR\n Grand Dulex Room 4800 INR","Maximum Room Rate: 4000 INR\n Minimum Room Rate:2500 INR","Maximum Room Rate: 7500 INR\n Minimum Room Rate: 3500 INR","Maximum Room Rate: 6500 INR\n Minimum Room Rate:2200 INR","Maximum Room Rate: 3300 INR\n Minimum Room Rate:2300 INR","Maximum Room Rate: 38000 INR\n Minimum Room Rate: 7000 INR"};

    private final SliderAdapter sliderAdapter = new SliderAdapter(pics, 8, new OnCardClickListener());

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
        //hideNavigationBar();
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
//                Intent intent = new Intent(MainActivitySlider.this, Mainhistorical2Activity.class);
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

        placeSwitcher.setInAnimation(MainActivitySliderHotels.this, animV[0]);
        placeSwitcher.setOutAnimation(MainActivitySliderHotels.this, animV[1]);
        placeSwitcher.setText(places[pos % places.length]);

        clockSwitcher.setInAnimation(MainActivitySliderHotels.this, animV[0]);
        clockSwitcher.setOutAnimation(MainActivitySliderHotels.this, animV[1]);
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
            final TextView textView = new TextView(MainActivitySliderHotels.this);

            if (center) {
                textView.setGravity(Gravity.CENTER);
            }

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                textView.setTextAppearance(MainActivitySliderHotels.this, styleId);
            } else {
                textView.setTextAppearance(styleId);
            }

            return textView;
        }

    }

    private class ImageViewFactory implements ViewSwitcher.ViewFactory {
        @Override
        public View makeView() {
            final ImageView imageView = new ImageView(MainActivitySliderHotels.this);
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
                final Intent intent = new Intent(MainActivitySliderHotels.this, HotelActivity.class);
                intent.putExtra("imageView", pics[activeCardPosition % pics.length]);
                intent.putExtra("textView1",descriptions[activeCardPosition%descriptions.length]);
                intent.putExtra("textView2",address[activeCardPosition%address.length]);
                intent.putExtra("imageView1", maps[activeCardPosition % maps.length]);

                intent.putExtra("textView3",fee[activeCardPosition%fee.length]);
                intent.putExtra("textView4",contact[activeCardPosition%contact.length]);



                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent);
                } else {
                    final CardView cardView = (CardView) view;
                    final View sharedView = cardView.getChildAt(cardView.getChildCount() - 1);
                    final ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(MainActivitySliderHotels.this, sharedView, "shared");
                    startActivity(intent, options.toBundle());
                }
            } else if (clickedPosition > activeCardPosition) {
                recyclerView.smoothScrollToPosition(clickedPosition);
                onActiveCardChange(clickedPosition);
            }
        }
    }

}

