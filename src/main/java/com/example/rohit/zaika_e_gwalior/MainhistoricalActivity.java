package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainhistoricalActivity extends AppCompatActivity {
     public List<Adapterhistorical> adapterhistoricalList = new ArrayList<>();
      Context mcontext;
      MovieAdapterhistorical movieAdapterhistorical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhistorical);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Historical Attraction");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
              recyclerView.setLayoutManager(layoutManager);
        movieAdapterhistorical = new MovieAdapterhistorical(adapterhistoricalList,this);
         recyclerView.setAdapter(movieAdapterhistorical);

        prepareMovieData();
    }

    private void prepareMovieData() {


        int[] covers = new int[]{
                R.drawable.fort,
                R.drawable.jaivilashpalace,
                R.drawable.gopa,
                R.drawable.mansingh,
                R.drawable.sbt,
                R.drawable.skund,
                R.drawable.syndhiya,

        };


        Adapterhistorical a = new Adapterhistorical(covers[0], "Gwalior Fort", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "Situated on a sandstone hill, it has been the administrative headquarters of the Tomars and witness to the rule of several dynasties. During the Revolt of 1857, it was under the control of Tantia Tope and Rani Lakshmibai for a brief period. Folklore says that it was built by King Suraj Sen on recommendation of sage Gwalipa. It offers panoramic view of the valley below. Way uphill, one can see statues of Jain Theerthankaras carved into rock faces. Son-et-Lumiere at the Man Mandir Palace gives you a glimpse into its glorious past. The fort’s façade glows with colours and offers a scintillating experience.", "Gwalior fort, Gwalior, Madhya Pradesh, 474001, India", "8th century by Maharaja Mansingh", "Child-40 Rs/Person,Adult-75 Rs/Person, Foreigner-250 Rs/Person", "751 40407777");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[1], "Jai Vilash Palace", "Lashkar,Gwalior", "10:00 am - 4:45 pm",
                "Jaivilas Palace was constructed by Maharaja Jayaji Rao Scindia in 1874 at a cost of Rs. 1 crore. It is a fine example of European architecture, designed and built by Sir Michael Filose. A combination of architectural styles, the first storey is Tuscan, the second Italian-Doric and the third Corinthian. The area of the Jai Vilas palace is 12,40,771 square feet and it is particularly famous for its large Durbar Hall. The interior of the Durbar Hall is decorated with gilt and gold furnishings and adorned with a huge carpet and gigantic chandeliers. It is 100 feet long, 50 feet wide and 41 feet in height. ", "Jai Vilas Palace,Gwalior 474001", "In  year 1874 by Maharaja Jayajirao Scindia,", "60 Rs/Person", "9301107666");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[2], "Gopachal Parvat", "Lashkar,Gwalior", "10:00 am - 07:00 pm",
                "The other place to visit in the Gwalior disitrict is the gopachal parvat. This is very beautifully adorned place in the Gwalior. Gopachal Parvat also known as “Yek Paththar ki Bawri” is a nice place to visit in the Gwalior There are number of towering imposing statues of Jain Tirthankaras. They are 26 in number. These constructions are credited to Tomar rulers, particularly Veeram Dev, Doongar Singh and Keerti Singh in duration of 1398 and 1536. These statues convey message of non-violence to the world and preach Hindus to shun making sacrifices in their worshipping. These gigantic statues of Jain Teerthankaras preach everyone to shun from following the superstitious beliefs and unnecessary complex rituals. ", "Fort Campus,Gwalior, 470008", "built during the reign of Tomar Kings — Viramdev, Dungar Singh and Kirti Singh", "Child-40 Rs/Person,Adult-75 Rs/Person, Foreigner-250 Rs/Person", "0751 243 3400");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[3], "Mansingh Palace", "Gwalior,M.p.", "10:00 am - 06:00 pm",
                "Gwalior , one of the important historical destinations of the country has excuisite palaces and Man Singh Palace, Gwalior is one of them to really watch out for. It is housed within the Gwalior fort . The fort spreads out over an area of 3kms.The Gwalior fort encloses six palaces,numerous water tanks and three temples.The Fort has been witness to many ups and downs and has gone from one ruler to another. Initially ruled by the Tomars it passed to the Mughals, then the Marathas, the British and at last the Scindhias", "Near Archaeological Museum Fort Campus,Gwalior 474001", "Built by Tomar ruler Man Singh between 1486 and 1516", "100 Rs/Person", "18002337777");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[4], "Shahtra Bahu Temple", "Gwalior Fort", "05:00 am- 09:00 pm",
                "Sahastra Bahu or Saas Bahu Temple is within the Gwalior Fort complex .it is a twin temple a larger one dedicated to  Lord Vishnu Lord with Thousand arms (Sahastra Bahu).it is the most impressive structure 32*32 meters,built for the King Mahipal’s wife who was a devotee of Lord Vishnu , a smaller one dedicated to Lord Sun built for her daughter-in-Law who was a devotee of Lord Shiva Collectively called the Mother-in-Law( Saas ) and Daughter-in- Law (Bahu) Temple.", "Fort Campus Near Post Office,Gwalior 474001", "Built in 1092 by King Mahipal of the Kachhapaghata dynasty", "50 Rs/Person", "9781576646");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[5], "Suraj Kund ", "Gwalior Fort,Gwalior", "08:00 am - 06:00 pm",
                "Suraj Kund is a tank located in the Gwalior Fort. The kund was constructed in the 15th century though its history dates back to as early as 425 AD. Legend states that during this period a king named Suraj Sen went into the forest for hunting and was missing.The king asked for water from the sage Gwalipa, who lived in the forest. The sage asked him to climb a hill for water. The water of the tank cured his leprosy and as a token of gratitude to the sage, he constructed the Suraj tank and a temple.  The local people still believe that the water in the tank has medicinal power. Beautiful surroundings and historical significance of the tank attract many devotees as well tourists every year.", "Gwalior Fort Campus,Gwalior 474001", "Built in 15th century in the memory of prince named Suraj Sen", "No Entry Fee", "7514040777");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[6], "Scindia Museum", "Lashkar,Gwalior", "10:00 am- 05:00 pm",
                "The Scindia Museum is part of the Jai Vilas Palace, built by Maharaja Jayajirao in 1874 using prisoners from the Gwalior fort. The convicts were then rewarded with the 12-year job of weaving the hall carpet, which is one of the largest in Asia. The palace has 400 rooms from which exclusively 40 rooms are transformed into Jiwaji Rao Scindia Museum", "Jaivilas Palace, Lashkar, Gwalior, Madhya Pradesh, 474009", " Built by Maharaja Jayajirao in 1874 using prisoners from the Gwalior fort", "100 Rs/Person", "7512372390");
        adapterhistoricalList.add(a);






    }}