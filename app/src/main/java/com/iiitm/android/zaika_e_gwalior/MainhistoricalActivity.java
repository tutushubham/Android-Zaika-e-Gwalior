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
                R.drawable.gujrimus,
                R.drawable.tombgauss, R.drawable.karan, R.drawable.jahagir, R.drawable.jauhar, R.drawable.moti,
                R.drawable.bhimsinghrana,  R.drawable.hamam,
                R.drawable.vikram1, R.drawable.jhansikirani, R.drawable.jhilmil,R.drawable.pichor,
                R.drawable.kila_behatt,R.drawable.atchatu,
                R.drawable.mitawli, R.drawable.padavli, R.drawable.bateshwer,
                R.drawable.dhume,R.drawable.behattt,
                R.drawable.rasslela,
                R.drawable.lathedi_gate
        };


        Adapterhistorical a = new Adapterhistorical(covers[0], "Gwalior Fort", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "Situated on a sandstone hill, it has been the administrative headquarters of the Tomars and witness to the rule of several dynasties. During the Revolt of 1857, it was under the control of Tantia Tope and Rani Lakshmibai for a brief period. Folklore says that it was built by King Suraj Sen on recommendation of sage Gwalipa. It offers panoramic view of the valley below. Way uphill, one can see statues of Jain Theerthankaras carved into rock faces. Son-et-Lumiere at the Man Mandir Palace gives you a glimpse into its glorious past. The fort’s façade glows with colours and offers a scintillating experience.", "Gwalior fort, Gwalior, Madhya Pradesh, 474001, India", "8th century by Maharaja Mansingh", "Child-40 Rs/Person,Adult-75 Rs/Person, Foreigner-250 Rs/Person", "75140407777");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[1], "Jai Vilas Palace", "Lashkar,Gwalior", "10:00 am - 4:45 pm",
                "Jaivilas Palace was constructed by Maharaja Jayaji Rao Scindia in 1874 at a cost of Rs. 1 crore. It is a fine example of European architecture, designed and built by Sir Michael Filose. A combination of architectural styles, the first storey is Tuscan, the second Italian-Doric and the third Corinthian. The area of the Jai Vilas palace is 12,40,771 square feet and it is particularly famous for its large Durbar Hall. The interior of the Durbar Hall is decorated with gilt and gold furnishings and adorned with a huge carpet and gigantic chandeliers. It is 100 feet long, 50 feet wide and 41 feet in height. ", "Jai Vilas Palace,Gwalior 474001", "In  year 1874 by Maharaja Jayajirao Scindia,", "60 Rs/Person", "9301107666");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[2], "Gopachal Parvat", "Lashkar,Gwalior", "10:00 am - 07:00 pm",
                "The other place to visit in the Gwalior disitrict is the gopachal parvat. This is very beautifully adorned place in the Gwalior. Gopachal Parvat also known as “Yek Paththar ki Bawri” is a nice place to visit in the Gwalior There are number of towering imposing statues of Jain Tirthankaras. They are 26 in number. These constructions are credited to Tomar rulers, particularly Veeram Dev, Doongar Singh and Keerti Singh in duration of 1398 and 1536. These statues convey message of non-violence to the world and preach Hindus to shun making sacrifices in their worshipping. These gigantic statues of Jain Teerthankaras preach everyone to shun from following the superstitious beliefs and unnecessary complex rituals. ", " Lashkar, Gwalior, Madhya Pradesh 474002", "built during the reign of Tomar Kings — Viramdev, Dungar Singh and Kirti Singh", "Child-40 Rs/Person,Adult-75 Rs/Person, Foreigner-250 Rs/Person", "0751 243 3400");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[3], "Mansingh Palace", "Gwalior,M.p.", "10:00 am - 06:00 pm",
                "Gwalior , one of the important historical destinations of the country has excuisite palaces and Man Singh Palace, Gwalior is one of them to really watch out for. It is housed within the Gwalior fort . The fort spreads out over an area of 3kms.The Gwalior fort encloses six palaces,numerous water tanks and three temples.The Fort has been witness to many ups and downs and has gone from one ruler to another. Initially ruled by the Tomars it passed to the Mughals, then the Marathas, the British and at last the Scindhias", "Near Archaeological Museum Fort Campus,Gwalior 474001", "Built by Tomar ruler Man Singh between 1486 and 1516", "100 Rs/Person", "18002337777");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[4], "Shahastra Bahu Temple", "Gwalior Fort", "05:00 am- 09:00 pm",
                "Sahastra Bahu or Saas Bahu Temple is within the Gwalior Fort complex .it is a twin temple a larger one dedicated to  Lord Vishnu Lord with Thousand arms (Sahastra Bahu).it is the most impressive structure 32*32 meters,built for the King Mahipal’s wife who was a devotee of Lord Vishnu , a smaller one dedicated to Lord Sun built for her daughter-in-Law who was a devotee of Lord Shiva Collectively called the Mother-in-Law( Saas ) and Daughter-in- Law (Bahu) Temple.", "Fort Campus Near Post Office,Gwalior 474001", "Built in 1092 by King Mahipal of the Kachhapaghata dynasty", "50 Rs/Person", "9781576646");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[5], "Suraj Kund ", "Gwalior Fort,Gwalior", "08:00 am - 06:00 pm",
                "Suraj Kund is a tank located in the Gwalior Fort. The kund was constructed in the 15th century though its history dates back to as early as 425 AD. Legend states that during this period a king named Suraj Sen went into the forest for hunting and was missing.The king asked for water from the sage Gwalipa, who lived in the forest. The sage asked him to climb a hill for water. The water of the tank cured his leprosy and as a token of gratitude to the sage, he constructed the Suraj tank and a temple.  The local people still believe that the water in the tank has medicinal power. Beautiful surroundings and historical significance of the tank attract many devotees as well tourists every year.", "Gwalior Fort Campus,Gwalior 474001", "Built in 15th century in the memory of prince named Suraj Sen", "Child-40 Rs/Person,Adult-75 Rs/Person, Foreigner-250 Rs/Person", "7514040777");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[6], "Scindia Museum", "Lashkar,Gwalior", "10:00 am- 05:00 pm",
                "The Scindia Museum is part of the Jai Vilas Palace, built by Maharaja Jayajirao in 1874 using prisoners from the Gwalior fort. The convicts were then rewarded with the 12-year job of weaving the hall carpet, which is one of the largest in Asia. The palace has 400 rooms from which exclusively 40 rooms are transformed into Jiwaji Rao Scindia Museum", "Jaivilas Palace, Lashkar, Gwalior, Madhya Pradesh, 474009", " Built by Maharaja Jayajirao in 1874 using prisoners from the Gwalior fort", "100 Rs/Person", "7512372390");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[7], "Gujari Mahal Museum", "Lohamandi,Gwalior", "10:00 am- 05:00 pm",
                "Gujari Mahal is one of the palaces in Gwalior which has now been transformed into a museum. The palace was constructed during the 15th century by Raja Man Singh for his wife Mrignayani, a Gujar princess.It was built on demand of the queen that she needed a separate palace for herself with regular water supply. For fulfilling the same, the structure was constructed near the Rai River.The palace was converted into a museum in 1922 and is known by the name of Central Archaeological Museum", "Lohamandi, Gwalior, Madhya Pradesh 474008", "It was build During Mansingh Rule. ", "10 per person  \n" + "50 for Camera", "08985869526");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[8], "Muhammad Ghaus Tomb", "Tansen Nagar,Gwalior", "09:00 am- 06:00 pm",
                "To the east of the town stands the mausoleum of Muhammad Ghaus. It is built in the form of a square with hexagonal towers at its corners surmounted by small domes. The body of the building is enclosed on all sides by carved stone lattices of elaborate and delicate design the whole being crowned by a large dome which was once inlaid with blue glazed tiles. Shaikh Mohammad ghaus, whose body lies within, was a well-known Muslim saint of the sixteenth century. ", "Tansen Rd, Tansen Nagar, Gwalior, Madhya Pradesh 474002", "It was assisted by Babur when he conquered the fort of Gwalior in 1526.", "Not Available", "7512234557");
        adapterhistoricalList.add(a);



        a = new Adapterhistorical(covers[9], "Karan Mahal", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "Tomar Rajput occupied Gwalior in 1194 A.D. and ruled by viramdeva, Uddharan deva, Viramdeva, Ganpatideva, Dugrendra Singh and Kirti Singh. Karna palace was built during the period (1480-1486 A.D.) of Kirti Singh. The two stored palace was built on square plan and one side measured 200 feet. The palace is the best spaliman of Hindu architecture. It has complete arrangement of women bath named Hannam at the ground floor of palace. These are a flight of steps to go second floor and roofs. There is large assembly hall inside the palace.  ", "Gwalior fort, Gwalior, Madhya Pradesh, 474001", "By Kriti singh during the period of 1480-1486A.D. ", "Not Available", "075140407777");
        adapterhistoricalList.add(a);


        a = new Adapterhistorical(covers[10], "Jahangiri-Sahjahan Mahal", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "The palace located in front Karn Mahal, having Jahangir Mahal and Shahjahan Mahal inside. A remarkable high walled building used as a prison by the later Mugals.The nine dark cells on the way to Jahangiri Mahal & it is said that It was known as Sher Mandir due to it construction by Shershah and later renovated by Mugal rules Jahangir and Shahjahan.A palace infront Jahangiri Mahal measured 320×170 feet in Mughal architecture was built by Shahjahan. It has attractive decoration of Mughal style.  ", "Gwalior fort, Gwalior, Madhya Pradesh, 474001", "Constructed by Shershah and later Mugal rules Jahangir and Shahjahan.", "Not Available", "075140407777");
        adapterhistoricalList.add(a);



        a = new Adapterhistorical(covers[11], "Jauhar Kund", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "Beside places and temple, several water tanks were built inside Gwalior fort. There are Suraj Kund, Man Sarovar Tal, Gangola Tal, Ek Khabhatal, Ranital, Cherital and Jauhar Kund which were the main sourse of water for people living inside fort. Rajput women committed socide in this tank at the time of Iltutmiss’s attack in 1232 A.D ", "Gwalior fort, Gwalior, Madhya Pradesh, 474001", "It was assisted by Babur when he conquered the fort of Gwalior in 1526.", "Not Available", "075140407777");
        adapterhistoricalList.add(a);



        a = new Adapterhistorical(covers[12], "Moti Mahal", "Lashkar,Gwalior", "09:00 am- 06:00 pm",
                "Moti Mahal was built by Maharaja Jayaji Rav Sciendia or Gwalior stati in 1827 A.D. The large palace Moti Mahal is controled under office of the commissioner Gwalior division except assembly hall of control India, meeting hall. Ragmala rooms which are protected by deptt. Of  M.P. state Archaeology. There are beautiful Ragmala paintings showing a ceremony of  Dashaara festival, there are attractive paintings of Radha-Krishna on the walls of meeting hall.  ", "Moti Mahal Rd, Lashkar, Gwalior, Madhya Pradesh 474007", " Built by Maharaja Jayaji Rav Sciendia in 1827 A.D.", "Not Available", "07512424125");
        adapterhistoricalList.add(a);



        a = new Adapterhistorical(covers[13], "Hamam Khana Bastion ", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "This monument is located in the bastion of rampart nearby west  entrance of Gwalior fort. Facing east this Hamam Khana has 3 floors. The lower floor has two basements. The entire Hamam Khana (Bath-hall) has six rooms which are attached throughout with each other. A big bath tub made of iron is placed in the middle room to keep water hot by burning wood. All the rooms have beantsful arches dewrted with intricate designe on plaster. Arched & decorative engraving on the plaster in all rooms.  ", "Gwalior fort, Gwalior, Madhya Pradesh, 474001", "By Tomar King Karan Singh in 15th century A.D.", "Not Available", "75140407777");
        adapterhistoricalList.add(a);



        a = new Adapterhistorical(covers[14], "Bhimsingh Rana Cenotaph", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                " Bhimsingh Rana was Jaat king of gohad. He was ruled Gwalior fort during 1754-1756 A.D. He was died in war against Maratha. This cenotaph built was Jat ruler near Joharkund in Gwalior fort. Bhimshing Rana cenotaph built by 4 feet high plate form & size is square. This cenotaph is 3 story & Sikhar is built top of cenotaph.", "Gwalior fort, Gwalior, Madhya Pradesh, 474001", "Built by Jat ruler near Joharkund in Gwalior fort", "Not Available", "075140407777");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[15], "Vikram Temple or Palace", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "The great king of Tomar dynasty Mansingh succeeded by his son Vikramaditya (1516-1523 A.D.) who ruled Gwalior infront the Karan Mahal and behind plan and 212 feet its one side. Palace has a open varanda with twelve doors, which was used as assembly hall. There is a fligat of steps to go upper storey.", "Gwalior fort, Gwalior, Madhya Pradesh, 474001", "Built by Vikramaditya, son of Man Singh Tomar (1516-1523 A.D.)", "Not Available", "075140407777");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[16], "Rani Laxmi Bai Cenotaph",  "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "Maharani laxmi bai was born in Bithour near kanpur. She was married with gangadhar rao king of Jhansi. She become the ruler of jhansi after death of gangadhar raos. She was famous from maharani laxmi bai rani of jhansi to death. The first independent was 1957 she was fight against British army & died in the bank of subarn rekha river. This century of built by memorial of maharani laxmi bai.", "Gwalior fort, Gwalior, Madhya Pradesh, 474001", "Built in memorial of maharani laxmi bai.","Not Available", "075140407777");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[17], "Jhilmileshwar Temple",  "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "This place is called Tanay Pandey alias Tansen means a home. Legend that used Tansen Silence pops Shiva temple located under the banyan tree here. The present temple was tilted to one side due to the subsequent period, the landslide that is clear,This small temple was built in the later period at the site of the ancient Shiva temple. Nearby L0-llvin century AD. Artifacts such as a Mukhi Shiva Linga, maatrakaa Board, Nandi, Lord Vishnu statue bays, Uma Maheshwar, Shiva statue bays etc. exists. That set up a facing lingam at the site of the Shiva temple, the temple will Tansen worship and practice in the 15th century AD","Dabra Gwalior(M.P.) 474001","This small temple has been built in ancient times at the site of the Shiva temple.", "Not Available", "075140407777");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[18], "Fort of Pichor", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "Proof of history of the past is started to meet us from the medieval period. The old name of Pichor was \"Champa Nagari\" which was destroyed in the year 1313 AD in the war between Tomar and Kshatriya Rajput kings. In 1675 AD, the kingdom of Bundela was ruled by Rajvir Vrishabhdev Singh of this region. At present, the northern and western part of the fort was also constructed by Rajveer Bundela. The Bundelas ruled this area for a long time, later Jat kings took over the area.The Jats had constructed many forts and fortresses, in the fort of Pichor, the Jats also built the castle and Baudi, which used to continue till Jat 1847. In 1847, this fort was taken by the British and Mahajadi Sindhiya by the mountain lion Jat. The soldiers of Mountain Singh joined the army of Sindhiya. In 1852 AD, this region was under the influence of Sardar Sardar Dinkar Rao, and they made it a tehsil that remained till independence.","Dabra ,Gwalior(M.P.) 474001", " Jats Mahal and Bawdi constructed at Pichor's fortress ","Not Available", "75140407777");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[19], "Gadhi Behat", "Gwalior(M.p.)", "09:00 am- 06:00 pm",
                "This citadel is situated in the middle of the great village. A deep trench was constructed around the time of the construction of Garhi, within which the square was created. The trench is still safe. In a square period, turquoise is built on a fixed interval, with the structure of the chambers beneath. Near these rooms, the cave is made to reach the top of the wall. There are two entrances to East and South in Garhi.To go crafted within the buttress is entering the path of the swastika shape. Crafted the square is the structure of re Burjo on each corner. These Jat rulers Burjo laid Guns Lgai a cannon which is located on the turret of the northwest corner of today. In crafted northern side Dvimnjila were residential buildings which have fractal. Only the walls are protected by current crafted in. Yard are off-chime grown in.Construction of the fortress was built in the 18th century AD by the Jat ruler Ctrsinh the GOHAD that Jat was made are very at its headquarters GOHAD the position. Crafted historical and archaeological important terms. Therefore, it is proposed to be taken under the aegis of the Department." ,"Gram Bhat District, Gwalior(M.P.) 474001", "\n"+"\n"+" Was made deep trench around the building was crafted within the built square buttress.","Not Available", "075140407777");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[20],"Chaturbhuj Temple","Kila Gate Road,Gwalior","07:00 am-07:00 pm",
                "The Chaturbhuj temple is dedicated to Lord Vishnu  and is located on the eastern road to the Gwalior fort. It was believed to be built by the grandson of Nagarabhatta in the year 875 AD during the period of Pratiharas. Many Sanskrit inscriptions are engraved on this Monolithic temple.  Among the inscription is the first recorded representation of zero where it is written as a dot."," Kila Gate Road, Raj Mandi, Lohamandi, Gwalior, Madhya Pradesh 474008","\n"+"\n"+"It was believed that in the year 875 AD, the grandson of Nagarvatra was to be built during the prataharas.","Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[21],"Mitawali Temple","Mitaoli,Gwalior","06:00 am -07:00 pm",
                "Nurtured by the Chambal River, the hill atop which the Mitawali temple sits is lush green with trees, and only a quarter of the circular temple is visible from the ground below. the temple has a main shrine circular in shape which houses a large shivling encircled by an outer circumambulatory path that opens into the central courtyard. The circumambulatory path has pillars which open into sixty four niches or sixty four mini temples, each housing a shivling now, but which originally housed statues of Yoginis, giving the temple its name, Chaunsath Yogini Temple"," Mitaoli, Madhya Pradesh 476444","This temple was built by the Kachchhapaghata king Devapala "," Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[22],"Padavali Temple","Mitaoli,Gwalior","09:30 am -05:30 pm",
                "A few kilometres from Bateshwar are the gigantic bastions of a fortress called the Garhi Padawali, guarded by a pair of marble lion and lioness. The lions gracefully guard a steep flight of steps to the temple where once the rulers of the fort worshipped. The mukhamandap of the temple dedicated to Lord Shiv is embellished with intricate carvings but sadly the mandap or the sanctum sanctorum has deceased to a heap of rumble. The cornucopia of carvings elaborately make the walls of the mukhamandap look larger than life itself. Every inch of the pillars and the lintels speak out in stone and not even a fraction of the minutest unit of length has been left unchiselled","  Near Mitaoali Padawali Banmore, Morena, Madhya Pradesh"," This temple was built by Pratihara dynasty of the 10th century A.D.","Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[23],"Bateshwar Temple","Mitaoli,Gwalior","09:30 am -05:30 pm",
                "Bateshwar is not home to only a solitary temple but the temples here form a giant jigsaw puzzle with its pieces scattered over twenty five acres of a hill slope. More than two hundred temples are packed together in Bateshwar, some in ruins, some given a new life by the Archaeological Survey of India. Dedicated to Shiv and Vishnu, who considered themselves to be Suryavanshis or descendants of Lord Lakshman! And the interesting part is that the temples can be distinguished by their different architecture pertaining to their different time periods, some with flat roofs while the other with curvilinear shikhars. Many of the temples have a sanctum sanctorum with shivlings.","  Near Mitaoali Padawali Banmore, Morena, Madhya Pradesh","It was built by Pratihar Dynasty."," Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[24],"  Dhumeshwar Temple"," Dhumeshwar,M.P","05:00 am - 09:00 pm",
                "Dhumeswar mahadev temple is locate in near village south of 6km distance of karyabati village in dabra bitarbar road. This temple was built by bundela rulear vearshing in during 17th century A.D. This shiv temple contracted is big plate form shiv linga is estblished in the seuntum. this temple is the fine exampal of the early bundeela & rajput style. This temple is the good example of buildings constraction work & very importance of historical & Archaeological veiw."," Dhumeshwar, Madhya Pradesh 475220","This temple was built by bundela rulear vearshing in during 17th century A.D.","Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[25],"Fort Behat"," Behat, M.P","05:00 am - 07:00 pm",
                "This fort is locate in a high hill coke in south of village behat main gate of fort was south facing but present fort in not original form. bastan & other part was constructed in 16th  century A.D. residential sctuter built all around in fort presenty all destroyed jat ruler of gohad was built the head quarter to behat in 18th century A.D. & reneued. The fort a court or darwar hall is built by jat king chatrsingh in fort. The court or darwar hall sctuture is rectangular. The use of portion as darbar hall court & deewan-e-aam."," Behat Road,Gwalior Madhya Pradesh"," The fort or darwar hall is built by jat king chatrsingh"," Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[26],"Rasleela Ghar","Barai ,Gwalior","05:00 am - 07:00 pm",
                "This monument is locate in Barai village in Gwalior. Shivpuri highway in 30 km distance of Gwalior city. This magnificent manument is built by maharaja mansingh tomar our ruling period during 1486-1516 A.D. This monument is early form of morden open amfi theyeter pillar based thyeter in the mid and stiar is built all around the theyeter. rooms was built by two side of maingate. This monument is built by rubble stone & lime mortar & peerless suctctre. this monument is importance of historical & Archaeological veiw. The rasleela ghar had a roof on all side four an audience."," Barai, Gwalior, Madhya Pradesh","This monument is built by rubble stone & lime mortar & peerless suctctre","Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new Adapterhistorical(covers[27], "Ladhedi Gate","Gwalior (M.P.)", "09:00 am -06:00 pm",
                "Ladheri or Ladhedi Gate was built by Ayodhya’s administrator Ladakhan. " +
                        "Later, Man Singh Tomar built a Sarai in 15-16th century A.D. for the stay of Muslim rulers. Jaunpur’s ruler Husainshah Shanki stayed here. \n" +
                        "A mosque also existed here. Now only gate survive.","Gwalior(Madhya Pradesh)","Ladhedi Gate was built by Ayodhya’s administrator Ladakhan.", "Not Applicable", "Not Available");

        adapterhistoricalList.add(a);
    }
}