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

import com.iiitm.android.zaika_e_gwalior.Main2historicalActivity;
import com.iiitm.android.zaika_e_gwalior.cardslidertry.cards.SliderAdapter;
import com.iiitm.android.zaika_e_gwalior.cardslidertry.utils.DecodeBitmapTask;
import com.iiitm.android.zaika_e_gwalior.R;

import java.util.Random;

public class MainActivitySlider extends AppCompatActivity {

    private final int[][] dotCoords = new int[27][2];
    private final int[] pics = {R.drawable.fort,
            R.drawable.jaivilashpalace,
            R.drawable.gopa,
            R.drawable.mansingh,
            R.drawable.sbt,
            R.drawable.skund,
            R.drawable.syndhiya,
            R.drawable.gujrimus,
            R.drawable.tombgauss, R.drawable.karan, R.drawable.jahagir, R.drawable.jauhar, R.drawable.moti,
            R.drawable.bhimsinghrana,  R.drawable.hamam,
            R.drawable.vikram1, R.drawable.jhansikirani, R.drawable.jhilmil,R.drawable.pichor,
            R.drawable.kila_behatt,R.drawable.atchatu,
            R.drawable.mitawli, R.drawable.padavli, R.drawable.bateshwer,
            R.drawable.dhume,R.drawable.behattt,
            R.drawable.rasslela,
            R.drawable.lathedi_gate};
    private final int[] maps = {R.drawable.map_gwalior_fort, R.drawable.map_jai_vilas, R.drawable.map_gopachal, R.drawable.map_man_singh, R.drawable.map_saas_bahu,R.drawable.map_suraj_kund,R.drawable.map_scindia_museum,R.drawable.map_gujari_mahal,R.drawable.map_muhammad_ghaus,R.drawable.map_jahangir_mahal,R.drawable.map_karan_mahal,R.drawable.map_jauhar_kund,R.drawable.map_moti_mahal,R.drawable.map_hamam_khana,R.drawable.map_bheem_singh,R.drawable.map_vikram_mahal,R.drawable.map_rani_laxmi_cenotaph,R.drawable.map_jhilmileshwar,R.drawable.map_fort_of_pichor,R.drawable.thumbnail,R.drawable.map_chaturbhuj,R.drawable.map_mitawali,R.drawable.thumbnail,R.drawable.map_bateshawar,R.drawable.map_dhumeshwar,R.drawable.thumbnail,R.drawable.thumbnail,R.drawable.thumbnail};
    private final String[] descriptions = {"Situated on a sandstone hill, it has been the administrative headquarters of the Tomars and witness to the rule of several dynasties. During the Revolt of 1857, it was under the control of Tantia Tope and Rani Lakshmibai for a brief period. Folklore says that it was built by King Suraj Sen on recommendation of sage Gwalipa. It offers panoramic view of the valley below. Way uphill, one can see statues of Jain Theerthankaras carved into rock faces. Son-et-Lumiere at the Man Mandir Palace gives you a glimpse into its glorious past. The fort’s façade glows with colours and offers a scintillating experience.","Jaivilas Palace was constructed by Maharaja Jayaji Rao Scindia in 1874 at a cost of Rs. 1 crore. It is a fine example of European architecture, designed and built by Sir Michael Filose. A combination of architectural styles, the first storey is Tuscan, the second Italian-Doric and the third Corinthian. The area of the Jai Vilas palace is 12,40,771 square feet and it is particularly famous for its large Durbar Hall. The interior of the Durbar Hall is decorated with gilt and gold furnishings and adorned with a huge carpet and gigantic chandeliers. It is 100 feet long, 50 feet wide and 41 feet in height. ", "The other place to visit in the Gwalior disitrict is the gopachal parvat. This is very beautifully adorned place in the Gwalior. Gopachal Parvat also known as “Yek Paththar ki Bawri” is a nice place to visit in the Gwalior There are number of towering imposing statues of Jain Tirthankaras. They are 26 in number. These constructions are credited to Tomar rulers, particularly Veeram Dev, Doongar Singh and Keerti Singh in duration of 1398 and 1536. These statues convey message of non-violence to the world and preach Hindus to shun making sacrifices in their worshipping. These gigantic statues of Jain Teerthankaras preach everyone to shun from following the superstitious beliefs and unnecessary complex rituals. ","Gwalior , one of the important historical destinations of the country has excuisite palaces and Man Singh Palace, Gwalior is one of them to really watch out for. It is housed within the Gwalior fort . The fort spreads out over an area of 3kms.The Gwalior fort encloses six palaces,numerous water tanks and three temples.The Fort has been witness to many ups and downs and has gone from one ruler to another. Initially ruled by the Tomars it passed to the Mughals, then the Marathas, the British and at last the Scindhias",  "Sahastra Bahu or Saas Bahu Temple is within the Gwalior Fort complex .it is a twin temple a larger one dedicated to  Lord Vishnu Lord with Thousand arms (Sahastra Bahu).it is the most impressive structure 32*32 meters,built for the King Mahipal’s wife who was a devotee of Lord Vishnu , a smaller one dedicated to Lord Sun built for her daughter-in-Law who was a devotee of Lord Shiva Collectively called the Mother-in-Law( Saas ) and Daughter-in- Law (Bahu) Temple.","Suraj Kund is a tank located in the Gwalior Fort. The kund was constructed in the 15th century though its history dates back to as early as 425 AD. Legend states that during this period a king named Suraj Sen went into the forest for hunting and was missing.The king asked for water from the sage Gwalipa, who lived in the forest. The sage asked him to climb a hill for water. The water of the tank cured his leprosy and as a token of gratitude to the sage, he constructed the Suraj tank and a temple.  The local people still believe that the water in the tank has medicinal power. Beautiful surroundings and historical significance of the tank attract many devotees as well tourists every year.","The Scindia Museum is part of the Jai Vilas Palace, built by Maharaja Jayajirao in 1874 using prisoners from the Gwalior fort. The convicts were then rewarded with the 12-year job of weaving the hall carpet, which is one of the largest in Asia. The palace has 400 rooms from which exclusively 40 rooms are transformed into Jiwaji Rao Scindia Museum","Gujari Mahal is one of the palaces in Gwalior which has now been transformed into a museum. The palace was constructed during the 15th century by Raja Man Singh for his wife Mrignayani, a Gujar princess.It was built on demand of the queen that she needed a separate palace for herself with regular water supply. For fulfilling the same, the structure was constructed near the Rai River.The palace was converted into a museum in 1922 and is known by the name of Central Archaeological Museum","To the east of the town stands the mausoleum of Muhammad Ghaus. It is built in the form of a square with hexagonal towers at its corners surmounted by small domes. The body of the building is enclosed on all sides by carved stone lattices of elaborate and delicate design the whole being crowned by a large dome which was once inlaid with blue glazed tiles. Shaikh Mohammad ghaus, whose body lies within, was a well-known Muslim saint of the sixteenth century. ", "Tomar Rajput occupied Gwalior in 1194 A.D. and ruled by viramdeva, Uddharan deva, Viramdeva, Ganpatideva, Dugrendra Singh and Kirti Singh. Karna palace was built during the period (1480-1486 A.D.) of Kirti Singh. The two stored palace was built on square plan and one side measured 200 feet. The palace is the best spaliman of Hindu architecture. It has complete arrangement of women bath named Hannam at the ground floor of palace. These are a flight of steps to go second floor and roofs. There is large assembly hall inside the palace.  ","The palace located in front Karn Mahal, having Jahangir Mahal and Shahjahan Mahal inside. A remarkable high walled building used as a prison by the later Mugals.The nine dark cells on the way to Jahangiri Mahal & it is said that It was known as Sher Mandir due to it construction by Shershah and later renovated by Mugal rules Jahangir and Shahjahan.A palace infront Jahangiri Mahal measured 320×170 feet in Mughal architecture was built by Shahjahan. It has attractive decoration of Mughal style.  ", "Beside places and temple, several water tanks were built inside Gwalior fort. There are Suraj Kund, Man Sarovar Tal, Gangola Tal, Ek Khabhatal, Ranital, Cherital and Jauhar Kund which were the main sourse of water for people living inside fort. Rajput women committed socide in this tank at the time of Iltutmiss’s attack in 1232 A.D ", "Moti Mahal was built by Maharaja Jayaji Rav Sciendia or Gwalior stati in 1827 A.D. The large palace Moti Mahal is controled under office of the commissioner Gwalior division except assembly hall of control India, meeting hall. Ragmala rooms which are protected by deptt. Of  M.P. state Archaeology. There are beautiful Ragmala paintings showing a ceremony of  Dashaara festival, there are attractive paintings of Radha-Krishna on the walls of meeting hall.  ","This monument is located in the bastion of rampart nearby west  entrance of Gwalior fort. Facing east this Hamam Khana has 3 floors. The lower floor has two basements. The entire Hamam Khana (Bath-hall) has six rooms which are attached throughout with each other. A big bath tub made of iron is placed in the middle room to keep water hot by burning wood. All the rooms have beantsful arches dewrted with intricate designe on plaster. Arched & decorative engraving on the plaster in all rooms.  ",  " Bhimsingh Rana was Jaat king of gohad. He was ruled Gwalior fort during 1754-1756 A.D. He was died in war against Maratha. This cenotaph built was Jat ruler near Joharkund in Gwalior fort. Bhimshing Rana cenotaph built by 4 feet high plate form & size is square. This cenotaph is 3 story & Sikhar is built top of cenotaph.", "The great king of Tomar dynasty Mansingh succeeded by his son Vikramaditya (1516-1523 A.D.) who ruled Gwalior infront the Karan Mahal and behind plan and 212 feet its one side. Palace has a open varanda with twelve doors, which was used as assembly hall. There is a fligat of steps to go upper storey.",
            "Maharani laxmi bai was born in Bithour near kanpur. She was married with gangadhar rao king of Jhansi. She become the ruler of jhansi after death of gangadhar raos. She was famous from maharani laxmi bai rani of jhansi to death. The first independent was 1957 she was fight against British army & died in the bank of subarn rekha river. This century of built by memorial of maharani laxmi bai.", "This place is called Tanay Pandey alias Tansen means a home. Legend that used Tansen Silence pops Shiva temple located under the banyan tree here. The present temple was tilted to one side due to the subsequent period, the landslide that is clear,This small temple was built in the later period at the site of the ancient Shiva temple. Nearby L0-llvin century AD. Artifacts such as a Mukhi Shiva Linga, maatrakaa Board, Nandi, Lord Vishnu statue bays, Uma Maheshwar, Shiva statue bays etc. exists. That set up a facing lingam at the site of the Shiva temple, the temple will Tansen worship and practice in the 15th century AD",
            "Proof of history of the past is started to meet us from the medieval period. The old name of Pichor was \"Champa Nagari\" which was destroyed in the year 1313 AD in the war between Tomar and Kshatriya Rajput kings. In 1675 AD, the kingdom of Bundela was ruled by Rajvir Vrishabhdev Singh of this region. At present, the northern and western part of the fort was also constructed by Rajveer Bundela. The Bundelas ruled this area for a long time, later Jat kings took over the area.The Jats had constructed many forts and fortresses, in the fort of Pichor, the Jats also built the castle and Baudi, which used to continue till Jat 1847. In 1847, this fort was taken by the British and Mahajadi Sindhiya by the mountain lion Jat. The soldiers of Mountain Singh joined the army of Sindhiya. In 1852 AD, this region was under the influence of Sardar Sardar Dinkar Rao, and they made it a tehsil that remained till independence.",  "This citadel is situated in the middle of the great village. A deep trench was constructed around the time of the construction of Garhi, within which the square was created. The trench is still safe. In a square period, turquoise is built on a fixed interval, with the structure of the chambers beneath. Near these rooms, the cave is made to reach the top of the wall. There are two entrances to East and South in Garhi.To go crafted within the buttress is entering the path of the swastika shape. Crafted the square is the structure of re Burjo on each corner. These Jat rulers Burjo laid Guns Lgai a cannon which is located on the turret of the northwest corner of today. In crafted northern side Dvimnjila were residential buildings which have fractal. Only the walls are protected by current crafted in. Yard are off-chime grown in.Construction of the fortress was built in the 18th century AD by the Jat ruler Ctrsinh the GOHAD that Jat was made are very at its headquarters GOHAD the position. Crafted historical and archaeological important terms. Therefore, it is proposed to be taken under the aegis of the Department." , "The Chaturbhuj temple is dedicated to Lord Vishnu  and is located on the eastern road to the Gwalior fort. It was believed to be built by the grandson of Nagarabhatta in the year 875 AD during the period of Pratiharas. Many Sanskrit inscriptions are engraved on this Monolithic temple.  Among the inscription is the first recorded representation of zero where it is written as a dot.",
            "Nurtured by the Chambal River, the hill atop which the Mitawali temple sits is lush green with trees, and only a quarter of the circular temple is visible from the ground below. the temple has a main shrine circular in shape which houses a large shivling encircled by an outer circumambulatory path that opens into the central courtyard. The circumambulatory path has pillars which open into sixty four niches or sixty four mini temples, each housing a shivling now, but which originally housed statues of Yoginis, giving the temple its name, Chaunsath Yogini Temple", "A few kilometres from Bateshwar are the gigantic bastions of a fortress called the Garhi Padawali, guarded by a pair of marble lion and lioness. The lions gracefully guard a steep flight of steps to the temple where once the rulers of the fort worshipped. The mukhamandap of the temple dedicated to Lord Shiv is embellished with intricate carvings but sadly the mandap or the sanctum sanctorum has deceased to a heap of rumble. The cornucopia of carvings elaborately make the walls of the mukhamandap look larger than life itself. Every inch of the pillars and the lintels speak out in stone and not even a fraction of the minutest unit of length has been left unchiselled","  Near Mitaoali Padawali Banmore, Morena, Madhya Pradesh", "Bateshwar is not home to only a solitary temple but the temples here form a giant jigsaw puzzle with its pieces scattered over twenty five acres of a hill slope. More than two hundred temples are packed together in Bateshwar, some in ruins, some given a new life by the Archaeological Survey of India. Dedicated to Shiv and Vishnu, who considered themselves to be Suryavanshis or descendants of Lord Lakshman! And the interesting part is that the temples can be distinguished by their different architecture pertaining to their different time periods, some with flat roofs while the other with curvilinear shikhars. Many of the temples have a sanctum sanctorum with shivlings.","Dhumeswar mahadev temple is locate in near village south of 6km distance of karyabati village in dabra bitarbar road. This temple was built by bundela rulear vearshing in during 17th century A.D. This shiv temple contracted is big plate form shiv linga is estblished in the seuntum. this temple is the fine exampal of the early bundeela & rajput style. This temple is the good example of buildings constraction work & very importance of historical & Archaeological veiw.","This fort is locate in a high hill coke in south of village behat main gate of fort was south facing but present fort in not original form. bastan & other part was constructed in 16th  century A.D. residential sctuter built all around in fort presenty all destroyed jat ruler of gohad was built the head quarter to behat in 18th century A.D. & reneued. The fort a court or darwar hall is built by jat king chatrsingh in fort. The court or darwar hall sctuture is rectangular. The use of portion as darbar hall court & deewan-e-aam.", "This monument is locate in Barai village in Gwalior. Shivpuri highway in 30 km distance of Gwalior city. This magnificent manument is built by maharaja mansingh tomar our ruling period during 1486-1516 A.D. This monument is early form of morden open amfi theyeter pillar based thyeter in the mid and stiar is built all around the theyeter. rooms was built by two side of maingate. This monument is built by rubble stone & lime mortar & peerless suctctre. this monument is importance of historical & Archaeological veiw. The rasleela ghar had a roof on all side four an audience.","Ladheri or Ladhedi Gate was built by Ayodhya’s administrator Ladakhan. " +
            "Later, Man Singh Tomar built a Sarai in 15-16th century A.D. for the stay of Muslim rulers. Jaunpur’s ruler Husainshah Shanki stayed here. \n" +
            "A mosque also existed here. Now only gate survive.","Gwalior(Madhya Pradesh)","Ladhedi Gate was built by Ayodhya’s administrator Ladakhan."};
    private final String[] countries = {"Gwalior Fort", "Jai Vilas Palace","Gopachal Parvat", "Mitawali Temple","Shahastra Bahu Temple","Suraj Kund ","Scindia Museum","Gujari Mahal Museum","Muhammad Ghaus Tomb", "Karan Mahal", "Jahangiri-Sahjahan Mahal", "Jauhar Kund", "Moti Mahal", "Hamam Khana Bastion ", "Bhimsingh Rana Cenotaph", "Vikram Temple or Palace", "Rani Laxmi Bai Cenotaph", "Jhilmileshwar Temple", "Fort of Pichor", "Gadhi Behat","Chaturbhuj Temple","Mitawali Temple","Padavali Temple","Bateshwar Temple","  Dhumeshwar Temple","Fort Behat","Rasleela Ghar", "Ladhedi Gate"};
    private final String[] places = {"Gwalior(M.p.)", "Lashkar,Gwalior","Lashkar,Gwalior", "Mitaoli,Gwalior", "Temple of Heaven", "Aegeana Sea"};
   // private final String[] temperatures = {"21°C", "19°C", "17°C", "23°C", "20°C"};
    private final String[] times = {"09:00 am- 06:00 pm", "10:00 am - 4:45 pm","10:00 am - 07:00 pm", "09:30 am -05:30 pm", "05:00 am- 09:00 pm", "08:00 am - 06:00 pm", "10:00 am- 05:00 pm", "10:00 am- 05:00 pm", "09:00 am- 06:00 pm", "09:00 am- 06:00 pm", "09:00 am- 06:00 pm", "09:00 am- 06:00 pm", "09:00 am- 06:00 pm"};
    private final String[] address={"Gwalior fort, Gwalior, Madhya Pradesh, 474001, India",
                                    "Jai Vilas Palace,Gwalior 474001",
            " Lashkar, Gwalior, Madhya Pradesh 474002", "Near Archaeological Museum Fort Campus,Gwalior 474001","Fort Campus Near Post Office,Gwalior 474001","Gwalior Fort Campus,Gwalior 474001", "Jaivilas Palace, Lashkar, Gwalior, Madhya Pradesh, 474009",
            "Lohamandi, Gwalior, Madhya Pradesh 474008","Tansen Rd, Tansen Nagar, Gwalior, Madhya Pradesh 474002", "Gwalior fort, Gwalior, Madhya Pradesh, 474001","Gwalior fort, Gwalior, Madhya Pradesh, 474001",  "Gwalior fort, Gwalior, Madhya Pradesh, 474001",  "Moti Mahal Rd, Lashkar, Gwalior, Madhya Pradesh 474007",    "Gwalior fort, Gwalior, Madhya Pradesh, 474001","Gwalior fort, Gwalior, Madhya Pradesh, 474001", "Gwalior fort, Gwalior, Madhya Pradesh, 474001",  "Gwalior fort, Gwalior, Madhya Pradesh, 474001","Dabra Gwalior(M.P.) 474001","Dabra ,Gwalior(M.P.) 474001","Dabra ,Gwalior(M.P.) 474001", "Gram Bhat District, Gwalior(M.P.) 474001", "Kila Gate Road, Raj Mandi, Lohamandi, Gwalior, Madhya Pradesh 474008"," Mitaoli, Madhya Pradesh 476444", "  Near Mitaoali Padawali Banmore, Morena, Madhya Pradesh","  Near Mitaoali Padawali Banmore, Morena, Madhya Pradesh"," Dhumeshwar, Madhya Pradesh 475220", " Behat Road,Gwalior Madhya Pradesh"," Barai, Gwalior, Madhya Pradesh","Gwalior(Madhya Pradesh)"};
    private final String[] build={ "8th century by Maharaja Mansingh","In  year 1874 by Maharaja Jayajirao Scindia,","built during the reign of Tomar Kings — Viramdev, Dungar Singh and Kirti Singh", "Built by Tomar ruler Man Singh between 1486 and 1516", "Built in 1092 by King Mahipal of the Kachhapaghata dynasty","Built in 15th century in the memory of prince named Suraj Sen",  " Built by Maharaja Jayajirao in 1874 using prisoners from the Gwalior fort","It was build During Mansingh Rule. ","It was assisted by Babur when he conquered the fort of Gwalior in 1526.","By Kriti singh during the period of 1480-1486A.D. ","Constructed by Shershah and later Mugal rules Jahangir and Shahjahan.",  "It was assisted by Babur when he conquered the fort of Gwalior in 1526."," Built by Maharaja Jayaji Rav Sciendia in 1827 A.D.","By Tomar King Karan Singh in 15th century A.D.","Built by Jat ruler near Joharkund in Gwalior fort","Built by Vikramaditya, son of Man Singh Tomar (1516-1523 A.D.)","Built in memorial of maharani laxmi bai.","This small temple has been built in ancient times at the site of the Shiva temple."," Jats Mahal and Bawdi constructed at Pichor's fortress ", "\n"+"\n"+" Was made deep trench around the building was crafted within the built square buttress.","\n"+"\n"+"It was believed that in the year 875 AD, the grandson of Nagarvatra was to be built during the prataharas.","This temple was built by the Kachchhapaghata king Devapala "," This temple was built by Pratihara dynasty of the 10th century A.D.","It was built by Pratihar Dynasty.","This temple was built by bundela rulear vearshing in during 17th century A.D."," The fort or darwar hall is built by jat king chatrsingh","This monument is built by rubble stone & lime mortar & peerless suctctre","Ladhedi Gate was built by Ayodhya’s administrator Ladakhan." };
    private final String[] ticket={ "Child-40 Rs/Person,Adult-75 Rs/Person","60 Rs/person","Child-40 Rs/Person,Adult-75 Rs/Person, Foreigner-250 Rs/Person","100 Rs/Person","50 Rs/Person","Child-40 Rs/Person,Adult-75 Rs/Person, Foreigner-250 Rs/Person","100 Rs/Person","10 per person  \n" + "50 for Camera","Not Available","Not Available", "Not Available", "Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available"};
    private final String [] contact={ "75140407777","9301107666", "0751 243 3400", "18002337777", "9781576646", "7514040777", "7512372390", "08985869526", "7512234557", "075140407777", "075140407777", "075140407777","07512424125","75140407777","075140407777","075140407777","075140407777","075140407777","75140407777","075140407777","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available"};

    private final SliderAdapter sliderAdapter = new SliderAdapter(pics, 28, new OnCardClickListener());

    private CardSliderLayoutManager layoutManger;
    private RecyclerView recyclerView;
    private ImageSwitcher mapSwitcher;
    //private TextSwitcher temperatureSwitcher;
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
//       temperatureSwitcher.setCurrentText(temperatures[0]);
//
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
//                Intent intent = new Intent(MainActivitySlider.this, Main2historicalActivity.class);
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

        placeSwitcher.setInAnimation(MainActivitySlider.this, animV[0]);
        placeSwitcher.setOutAnimation(MainActivitySlider.this, animV[1]);
        placeSwitcher.setText(places[pos % places.length]);

        clockSwitcher.setInAnimation(MainActivitySlider.this, animV[0]);
        clockSwitcher.setOutAnimation(MainActivitySlider.this, animV[1]);
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
            final TextView textView = new TextView(MainActivitySlider.this);

            if (center) {
                textView.setGravity(Gravity.CENTER);
            }

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                textView.setTextAppearance(MainActivitySlider.this, styleId);
            } else {
                textView.setTextAppearance(styleId);
            }

            return textView;
        }

    }

    private class ImageViewFactory implements ViewSwitcher.ViewFactory {
        @Override
        public View makeView() {
            final ImageView imageView = new ImageView(MainActivitySlider.this);
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
                final Intent intent = new Intent(MainActivitySlider.this, Main2historicalActivity.class);
                intent.putExtra("imageView", pics[activeCardPosition % pics.length]);
                intent.putExtra("imageView1", maps[activeCardPosition % maps.length]);
                intent.putExtra("textView1",descriptions[activeCardPosition%descriptions.length]);
                intent.putExtra("textView2",address[activeCardPosition%address.length]);
                intent.putExtra("textView3",build[activeCardPosition%build.length]);
                intent.putExtra("textView4",ticket[activeCardPosition%ticket.length]);
                intent.putExtra("textView5",contact[activeCardPosition%contact.length]);

                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent);
                } else {
                    final CardView cardView = (CardView) view;
                    final View sharedView = cardView.getChildAt(cardView.getChildCount() - 1);
                    final ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(MainActivitySlider.this, sharedView, "shared");
                    startActivity(intent, options.toBundle());
                }
            } else if (clickedPosition > activeCardPosition) {
                recyclerView.smoothScrollToPosition(clickedPosition);
                onActiveCardChange(clickedPosition);
            }
        }
    }

}
