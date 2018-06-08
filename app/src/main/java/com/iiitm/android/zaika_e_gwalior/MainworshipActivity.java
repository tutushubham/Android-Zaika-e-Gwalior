package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainworshipActivity extends AppCompatActivity {
    public List<Adapterworship> adapterworshipList = new ArrayList<>();
       Context mContext;
    MovieAdapterworship movieAdapterworship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainworship);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Worship Attraction");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieAdapterworship = new MovieAdapterworship(adapterworshipList,this);
        recyclerView.setAdapter(movieAdapterworship);





        prepareMovieData();
    }

    private void prepareMovieData() {

        int[] covers = new int[]{
                R.drawable.at,
                R.drawable.gkehanuman,
                R.drawable.gupteshwer,
                R.drawable.gdbc,
                R.drawable.hkhawaza,
                R.drawable.smt,
                R.drawable.st,
                R.drawable.carthedral, R.drawable.sanichra,
                R.drawable.vikkkkkk,

        };


        Adapterworship a = new Adapterworship(covers[0],"Achaleshwar Temple","Gwalior,M.p.","10:00 am - 06:00 pm",
                "Shri achleshwar temple is the very famous temple in Gwalior, where people comes to worship Lord Shiva and Nandi. Nandi is usually depicted as a bull which also serves as the mount to the God Shiva. It is a very known myth among the city people  about the temple that once scindia ruler Shri Madhorao Scindia Ji were constructing road on that path but the Shivling keep as  still in path earlier thay thought it is any rock or something and they were continuously   trying to remove that rock but still they were unable to find depth of that rock and so Maharaj was in a great dilemma,and one night Lord Achalnath itself appeared in his dream and told him that the thing he is supposing to be rock is actually his form and he is there to bless devotees. Lord ordered him to build a great temple there and from next day Shivling start worshipping and temple got constructed as Achleshwar Temple in middle of the city.","Lalitpur Colony, Lashkar, Gwalior, Madhya Pradesh 474009","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);




        a = new Adapterworship(covers[1],"Gargaj Ke Hanuman","Bahodapur,Gwalior","10:00 am - 06:00 pm",
                "Gwalior town in the Indian state of Madhya Pradesh has been the penitentiary of Galav Sage in ancient times. In this supreme holy place, the ancient temple of Sankatmokhan Siddha Shri Khedapati ji Hanuman is situated. From here onwards, the arrival of devotees starts from 4 a.m. every night, which runs at an uninterrupted speed.\n" +
                        "The temple is run by Shri Ram Janaki Temple, small house, Sri Siddha Khedapati Hanuman Trust, Gwalior. The text of Ramayana and Sundar Kand is kept in the temple. Devotees are fed by the devotees to the poor. Special electrification and flower arrangement is done on the occasion of Hanuman Jayanti. Shree Khedapati Ji is offered a Chappan Bhoga to God.","Laxmi Ganj, Gwalior, Madhya Pradesh 474008","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[2],"Gupteshwar Temple","Tighra Road,Gwalior","09:00 am- 08:00 pm",
                "he Gupteshwar temple is a centre of great spirituality among the people. The temple is located inside the Forest .There is a large rush during the month of Shravan in temple known as the month of Lord Shiva  and Abhishek programs carry out during whole of the year.The temple is located on a large hill on the road leading to Tighra.Along with Shivling there is a temple of Maa and Lord Ram-Sita. The place has a huge auspiciousness associated with Lord Shiva.","Tighra Road, Gwalior, Madhya Pradesh 475330","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[3],"Gurudwara Data Bandi","Gwalior Fort,Gwalior","24 hours",
                "Gurudwara Data Bandi Chhod is a memorial constructed in the memory of Guru Hargobind Sahib, the 6th Sikh Guru. History states that Guru Hargobind Sahib was imprisoned in the premises by Jehangir for over two years. During the time of release of the guru, he also wanted 52 Hindu kings, who were his fellow prisoners, to be released.Built inside the Gwalior Fort, the Gurudwara was constructed in 1970. Made up of marble and colourful stained glass exteriors, the Gurudwara is one of the significant Sikh pilgrimage sites and is visited by many tourists each year. Jehangir gave instructions that whoever holds the robe of Guru would be freed. This incident earned the Guru the title of Data Bandi Chhod.","Gwalior Fort,Gwalior","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[4],"Dargah Khawaja","Near Gwalior Fort","06:00 am- 10:00 pm",
                "Dargah Khwaja Kanoon Sahib was built in the memory of Khwaja Kanoon Sahib Nagauri. He was a resident of Marwad and arrived in Gwalior during 1481. His full name was Saiyed Saiyeeduddin Kanoon Rehmat Ullah Aleh chishtiya, which is carved on the dome of the Dargah.  To serve the parents, to respect the elders and to obey the Pious and the En lightened were the cherished principles of his life.\n" +
                        "Khwaja Ismail blessed Khanoon Sahib with all that heavenly wisdom and insight which he himself had imbibed from his father and preceptor. He instructed Khanoon Sahib to first go to Aimer and then to settle at Gwalior to spread out the message of God and the gospel of truth and righteousness.","Near Gwalior Fort","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[5],"Shitla Mata Mandir","Shivaji Nagar,Gwalior","10:00 am - 08:00 pm",
                "Sheetla Mata temple is a temple dedicated to the Mata Sheetla Devi","shivaji Nagar,Gwalior","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);

        a = new Adapterworship(covers[6],"Sun Temple","Near BIMR,Gwalior","8:00 am-5:00 pm",
                "Surya Mandir, also known as Sun Temple, is the replica of the famous Sun Temple of Konark in Orissa. Dedicated to the Sun god, the temple is situated near the residency at Morar, and is one of the pilgrimage places in the region.The temple was constructed by G.D. Birla, the famous industrialist of India in 1988. Surya Mandir is constructed using red sand stone and white marble.The exterior of the temple is decorated with red sand stone while the interiors present a perfect white marble work. The exteriors of the temple are also decorated with numerous stone carved images depicting various Hindu gods.","Morar,Gwalior  Mp.P","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);

        a = new Adapterworship(covers[7],"St.John Cathedral","Phalka Bazar,Gwalior","10:00 am -10:00 pm",
                "It is famous church place  in Gwalior"," Phalka Bazar, Lashkar, Gwalior, Madhya Pradesh 474015, India ","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);



        a = new Adapterworship(covers[8],"Shanishchara Temple","Aiti Barahwali,Gwalior","10:00 am -10:00 pm",
                "The Shanichara Temple made  of stone at Aeti is rather special, though it doesn’t appear so from the outside. It houses the original black idol of Shani brought from Lanka (presently Sri Lanka).Legend has it that Shanideva was held prisoner by the demon-king Ravana (king of Lanka), in the Hindu epic Ramayana. The dusty village of Aeti came into being only after the temple was established. Earlier it was just a barren hilltop dotted with a few trees ."," Aiti Barahwali, Madhya Pradesh, Gwalior 476444","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);



     /*   a = new Adapterworship(covers[13],"  Vikram Temple"," Gwalior (M.P.)","09:00 am -06:00 pm",
                "The great king of Tomar dynasty Mansingh succeeded by his son Vikramaditya (1516-1523 A.D.) who ruled Gwalior infront the Karan Mahal and behind plan and 212 feet its one side. Palace has a open varanda with twelve doors, which was used as assembly hall. There is a fligat of steps to go upper storey."," Gwalior fort, Gwalior, Madhya Pradesh, 474001","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);
*/




    }
}