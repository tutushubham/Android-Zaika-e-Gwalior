package com.iiitm.android.gwalior_jharoka.cardslidertry;

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

import com.iiitm.android.gwalior_jharoka.MedicalActivity;
import com.iiitm.android.gwalior_jharoka.R;
import com.iiitm.android.gwalior_jharoka.cardslidertry.cards.SliderAdapter;
import com.iiitm.android.gwalior_jharoka.cardslidertry.utils.DecodeBitmapTask;

import java.util.Random;

public class MainActivitySliderMedical extends AppCompatActivity {

    private final int[][] dotCoords = new int[12][2];
    private final int[] pics = {
            R.drawable.apoloh,
            R.drawable.pariwarh,
            R.drawable.navjeevanh,
            R.drawable.kalyanmemorialh,
            R.drawable.shaharah,
            R.drawable.apex,
            R.drawable.bimr,
            R.drawable.charitbal,R.drawable.jaya,R.drawable.rkm,R.drawable.gcivilh,R.drawable.kamalraja,


    };
    private final int[] maps ={R.drawable.map_apolo,R.drawable.map_pariwar,R.drawable.map_navjeevan,R.drawable.map_kalyan,R.drawable.map_sahara,R.drawable.map_apex,R.drawable.map_bimr,R.drawable.map_anandpur,R.drawable.map_jaya,R.drawable.map_rk,R.drawable.map_govern,R.drawable.map_kamla};
    private final String[] descriptions = {   "Apollo hospital offers superlative care in wide range of surgical specialties including General & Laparoscopic Surgery, Orthopaedic & Spine, Gynaecology, Ophthalmology, to name a few. In addition, the hospital provides comprehensive medical care in specialties like Nephrology, Neurology, Gastroenterology, Cardiology, Dental, Dermatology, Plastic & Cosmetic Surgery.", "Apollo hospital offers superlative care in wide range of surgical specialties including General & Laparoscopic Surgery, Orthopaedic & Spine, Gynaecology, Ophthalmology, to name a few. In addition, the hospital provides comprehensive medical care in specialties like Nephrology, Neurology, Gastroenterology, Cardiology, Dental, Dermatology, Plastic & Cosmetic Surgery.", " in Gwalior, Navjeevan Hospital is a recognized name in patient care. It was incepted in the year 2007. They are one of the well-known Private Hospitals in Moti Mahal Road. Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcaresuch as ICU with central oxygen supply & Multipara monitor ,Ultra modern operation theatres for surgical procedure , ICU with central oxygen supply & Multipara monitor , Ultra modern operation theatres for surgical procedure, Dialysis unit ,Medical Store,24 hours emergency facility,24 h ours Ambulance Service,Cashless and Mediclaim Insurance services ,Physiotherapy etc.", "Kalyan Memorial & KDJ Hospital is an upcomming hospital in gwalior. The hospital has a state of the art 100 bedded super specialty facility providing complete range of latest machines. It has a fully equipped Ortho and Trauma Unit, an emergency department and I.C.C for different facilities assisted  with round the clock post graduate doctors on duty supported Ventilator, Defibrillator, Multiparamonnitors and other Critical care equipment.","In Gwalior, Sahara Hospital is a recognized name in patient care. It was incepted in the year 2000. They are one of the well-known Hospitals in . Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities,", "In Gwalior,Apex Hospital is a recognized name in patient care. It is one of the well-known Private Hospitals in City Centre. Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities such as Dengue Fever Treatment ,Vaccination/Immunization ,Viral Fever Treatment,Diseases in Pregnancy ,General Pediatrics and etc.", "BIMR hospital provide many facilities such as Pharmacy,I.C.C.U., Neo-Natal Intermediate Ward with AHU, Post Operative Surgical Ward with AHU, Medical Intermediate Ward with AHU, Neuro I.C.U. and Neuro Surgery Center, Blood Bank, C.T. Scan, X-Ray (300 M.A.) with Digital Technology, Mobile X-Ray, Ultrasonography, NABL Accredited Laboratory services and etc.","Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities, they are one of the upcoming names in the healthcare industry. Located in , this hospital is easily accessible by various means of transport. A team of well-trained medical staff, non-medical staff and experienced clinical technicians work round-the-clock to offer various services . Their professional services make them a sought after Charitable Hospitals in Gwalior. A team of doctors on board, including specialists are equipped with the knowledge and expertise for handling various types of medical cases.", "At present the bed strength of Hospital is about 1200 beds. Hospital is equipped with the all the modern equipments.  It provide may facilities such as Neurosurgery,Spiral CT Scan and MR Imaging system,Chest Pain Treatment , Clinical Cardiology ,Heart Conditions,Skin Disease Treatment,Specialty Diagnostics in Tuberculosis ,Neurological Conditions ,Eye Checkup General ,Eye Surgery ,Bone Trauma ,Fracture Treatment and etc.","R K Memorial Heart Hospital and Medical Care Centre, Gwalior is among well-known hospital for valuable treatment.This hospital in Gwalior offers a lot of facilities for patient’s treatment like ambulance, ICU/general beds, Pharmacy, Canteen, etc.Along with above facilities, hospital is specialised for Cardiology.R K Memorial Heart Hospital and Medical Care Centre has specialist doctors practicing under different specializations.", "In Gwalior,Goverment  Civil Hospital is a recognized name in patient care. They are one of the well-known Hospitals . Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities, they are one of the upcoming names in the healthcare industry. Located in , this hospital is easily accessible by various means of transport. A team of well-trained medical staff, non-medical staff and experienced clinical technicians work round-the-clock to offer various services . Their professional services make them a sought after Hospitals in Gwalior. A team of doctors on board, including specialists are equipped with the knowledge and expertise for handling various types of medical cases.","There is formation of new neonatology wing (nursery) and also the pediatric ICU with latest gazette. It has Gynaecology and obstetric wards, Children wards, Children ICU, children surgical ward, female Orthopaedics ward, female surgical and burn ward and female ENT ward.At present the hospital is about 450 bedded and has a pediatric ICU under the Pediatric Department, A Burn ward for female Burn patients under Dept. of Surgery and a sonology section in Dept. of Obstetrics and Gynaecology."};
    private final String[] countries = {"Apolo Spectra","Pariwar Hospital","Navjeevan Hospital","Kalyan Hospital","Shahara Hospital","Apex Hospital","BIMR Hospital","Anandpur Charitable ","Jaya Arogya Hospital","R.K.Memorial Hospital","Government Hospital  "};
    private final String[] places = {"Lashkar,Gwalior","Lashkar,Gwalior","Moti Mahal Road ,Gwalior","Lashkar,Gwalior","Vasant Vihar,Gwalior","Tagore Nagar,Gwalior","Morar,Gwalior","Purani Chhawani,Gwalior","Kampoo,Gwalior","Kherapati Road,Gwalior","Tansen Nagar,Gwalior","Lashkar,Gwalior"};
    private final String[] times ={"24 Hours","24 Hours","24 Hours","24 Hours","24 Hours","24 Hours","8am-6am" ,"24 Hours","24 Hours","24 Hours","24 Hours","24 Hours"};
    private final String[] address={"Lashkar, Gwalior, Madhya Pradesh 474002","Lashkar, Gwalior, Madhya Pradesh 474001","Moti Mahal Road, Gwalior, Madhya Pradesh 474002","Lashkar,Gwalior-474001, Hospital road","Vasant Vihar, Gwalior, Madhya Pradesh 474007"," Tagore Nagar, Anupam Nagar, Saraswati Nagar, Gwalior, Madhya Pradesh 474011","Morar,Gwalior,Madhya Pradesh 474005","NH 3, Purani Chhawani, Gwalior West, Madhya Pradesh 474010","J A Hospital Campus,Kampoo Gwalior - 474001"," Ravi Nagar,Behind Gda Ofiice,Kherapati Road.,Gwalior, Madhya Pradesh","Unnamed Road, Tansen Nagar, Gwalior, Madhya Pradesh 474002"," J. A. Hospital Campus, Lashkar, Gwalior, Madhya Pradesh 474009"};
    private final String[] contact={"07512454600","07514047000","07514024081","07514006700","09926800870","07512340910","07512405617","07512401200"," 07512403200","07512630329","Not available","09425360494"};

    private final SliderAdapter sliderAdapter = new SliderAdapter(pics, 12, new OnCardClickListener());

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

        placeSwitcher.setInAnimation(MainActivitySliderMedical.this, animV[0]);
        placeSwitcher.setOutAnimation(MainActivitySliderMedical.this, animV[1]);
        placeSwitcher.setText(places[pos % places.length]);

        clockSwitcher.setInAnimation(MainActivitySliderMedical.this, animV[0]);
        clockSwitcher.setOutAnimation(MainActivitySliderMedical.this, animV[1]);
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
            final TextView textView = new TextView(MainActivitySliderMedical.this);

            if (center) {
                textView.setGravity(Gravity.CENTER);
            }

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                textView.setTextAppearance(MainActivitySliderMedical.this, styleId);
            } else {
                textView.setTextAppearance(styleId);
            }

            return textView;
        }

    }

    private class ImageViewFactory implements ViewSwitcher.ViewFactory {
        @Override
        public View makeView() {
            final ImageView imageView = new ImageView(MainActivitySliderMedical.this);
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
                final Intent intent = new Intent(MainActivitySliderMedical.this, MedicalActivity.class);
                intent.putExtra("imageView", pics[activeCardPosition % pics.length]);
                intent.putExtra("textView1",descriptions[activeCardPosition%descriptions.length]);
                intent.putExtra("textView2",address[activeCardPosition%address.length]);

                intent.putExtra("imageView2", maps[activeCardPosition % maps.length]);
                intent.putExtra("textView3",contact[activeCardPosition%contact.length]);



                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent);
                } else {
                    final CardView cardView = (CardView) view;
                    final View sharedView = cardView.getChildAt(cardView.getChildCount() - 1);
                    final ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(MainActivitySliderMedical.this, sharedView, "shared");
                    startActivity(intent, options.toBundle());
                }
            } else if (clickedPosition > activeCardPosition) {
                recyclerView.smoothScrollToPosition(clickedPosition);
                onActiveCardChange(clickedPosition);
            }
        }
    }

}

