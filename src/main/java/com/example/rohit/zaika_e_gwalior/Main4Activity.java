package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    public List<Adaptergharana> adaptergharanaList = new ArrayList<>();
    Context mContext;
    Movieadaptergharana movieadaptergharana;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Gwalior Gharana");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        movieadaptergharana = new Movieadaptergharana(adaptergharanaList, this);
        recyclerView.setAdapter(movieadaptergharana);

        preapareMovieData();
    }

    private void preapareMovieData() {


        int[] covers = new int[]{
                R.drawable.history,
                R.drawable.lige,
                R.drawable.tansen,
                R.drawable.ustads,
                R.drawable.style,
                R.drawable.mmmm
        };

        Adaptergharana a = new Adaptergharana(covers[0],"History","During the time of Mughal kings Ustad Naththan Pir Bakhsh and his maternal grandsons were the legendary Haddu, Hassu and Natthu Khan.The main musician in the court at the time was Ustad Bade Mohammad Khan who was famous for his taanbaazi.[citation needed] Both Ustad Bade Mohammad Khan and Ustad Naththan Pir Bakhsh belonged to the same tradition of Shahi Sadarang.Another great khayal singer, also originally from Lucknow, was Ustad Bade Mohammed Khan, who brought the Taan into khayal singing.[citation needed] Haddu Khan and Hassu Khan further enhanced the style of the Gwalior gharana as we recognize it today.[citation needed] Hassu Khan died prematurely. Haddu Khan's sons, Rehmat Ali Khan and Ustad Bade Inayat Hussain Khan (1852–1922) was a widely acclaimed singer who liberated the Gwalior style from the methodical form it followed to the emotional style that he preferred.[citation needed]\n" +
                "\n" + "Later, it was the disciples of the duo Ustad Haddu/Hassu Khan that both preserved as well as propagated the art. For instance, their pupils Vasudeva Buwa Joshi, Ramkrishna Deva and Banne Khansaheb, spread it further. It was Ramkrishna Deva's pupil BalRamkrishna buwa Ichalnikar, who took the Gwaliori Gaeki (singing stylistics) to Maharashtra.");
        adaptergharanaList.add(a);

        a = new Adaptergharana(covers[1],"Legacy","Gwalior is regarded as the land of music. It is said that even a child in Gwalior cries musically. Hindustani Classical Music is distinguished for its lineage and musical styles, known as Gharanas. Regarded as the fountainhead of these Gharanas, Gwalior is the revolutionary and dynamic capital of music. Over time different styles of music have developed here, all of which have found widespread acceptance. It is small wonder that Gwalior was and till date is accepted as the cultural capital of India.\n" + "\n" + "The father of Dhrupad style of music, Raja Mansingh Tomar (1486-1516), founded the Gwalior School of Music, where the foundation of the Gwalior Gharana was laid. Along with the accomplished nayaks (scholar musicians) who adorned his court,\n" + "\n" + "\n" + "Raja Mansingh wrote a musical treatise – Mankautuhal, and established a music school in Gwalior Fort, innovating and popularizing the Dhrupad style by using Brijbhasha, the popular language for the lyrics of the compositions. Thus Raja Mansingh prepared the ground for the grooming of great musicians such as Tansen. It was said, “bhuto na bhavishyati”– “there never was nor will there be” (such great musicians as these).");
        adaptergharanaList.add(a);

        a = new Adaptergharana(covers[2],"Tansen","The name of Tansen is inseparable from Gwalior. Gwalior Gharana received further patronage at the court of the great Mughal emperor Akbar, where Mian Tansen was one of the first vocalists who came from Gwalior. Even after Akbar, the Mughal courts were dominated by the musicians from Gwalior. After the Tomar dynasty, the musicians received great impetus under the patronage of the Scindias who made Gwalior their capital. But by then, the Khayal, rather than Dhrupad, had become the more prominent form of singing associated with the Gwalior Gharana.\n" +
                "Tansen was one of the nine jewels in Akbar's court. He had so much expertise over the ragas that he could painted pictures, brought rains, lighted fire with his singing. Similarly, if he sang an evening raag during daytime, the sunlight would diminish and it would look like its dusk already.\n" +
                "Muhammad Ghaus (or Ghawth) was a 16th c Sufi saint and teacher of the Mughal emperor Humayun as well as Tansen, the famous musician in Akbar’s court. The saint’s large tomb, built in the second half of the 16th c during Akbar’s rule, is the main structure in the garden complex located about a kilometer away from Gwalior Fort’s main eastern approach, and is surrounded by graves and smaller pavilion tombs, including that of Tansen.");
        adaptergharanaList.add(a);

        a = new Adaptergharana(covers[3],"Ustad","Pioneers-\n" +
                "Nathan Pir Bakhsh\n" +
                "Nathu Khan\n" +
                "Haddu Khan\n" +
                "Hassu Khan\n" +
                "Ustad Qurban Hussain Khan\n" +
                "Bade Inayat Hussain Khan\n" +
                "Rehmat Ali Khan\n" +
                "Roshan Abbas Khan\n" +
                "\n" +
                "\n" +
                "Notable musicians-\n" +
                "Krishnarao Shankar Pandit\n" +
                "Pt. Nanubhaiya Telang (1879 - 1948) - Disciple of Bala Saheb Guruji who was the disciple of Ustad Haddu Khan\n" +
                "Raja Bhaiya Poonchwale\n" +
                "Balakrishnabuwa Ichalkaranjikar (1849–1926, brought Gwalior gharana style to Maharashtra)\n" +
                "Vishnu Digambar Paluskar - (1872–1931, disciple of Balakrishnabuwa Ichalkaranjikar, founded Gandharva Mahavidyalaya)\n" +
                "Anant Manohar Joshi - (1881 - Unknown), disciple of Balakrishnabuwa Ichalkaranjikar and Sangeet Natak Akademi Awardee in 1955.\n" +
                "Gururao Deshpande - (1889–1982)\n" +
                "Vinayakrao Patwardhan - (1898-1975, Padma bhushan awardee in 1972)\n" +
                "D. V. Paluskar - (1921-1955, child prodigy from Nasik, disciple of Vinayakrao Patwardhan)\n" +
                "Ustad Rafique Khan\n" +
                "Ustad Mian Bannay Khan Sahab\n" +
                "Ustad Meeran Baksh Khan ");
        adaptergharanaList.add(a);

        a = new Adaptergharana(covers[4],"Styles","A distinguishing feature of the gharana is its simplicity, and one means to this is the selection of well-known ragas so that the listener is saved the effort of trying to identify the raga. While the khyal singer does include \"Raga Vistar\" (melodic expansion) and \"Alankar\" (melodic ornamentation) to enhance the beauty and meaning of the raga, there is no attempt to include the \"Tirobhava\" (using melodic phrases to obscure the identity of the raga) feature in the interest of adding interest or mystery to the listener's experience.\n" +
                "\n" + "The singing itself places Bandish (the composition) at the heart of the presentation because of the gharana's belief that the full melody of the raga and guidance on its singing is provided by the bandish. The asthayi section is sung twice before the antara, to be followed by swar-vistar in medium tempo. This slow rendition of the notes is known as the Behlava, and is sung from Ma in the lower register to Pa in the higher register, following the pattern of the Aroha (ascent) and Avaroha (descent) of the raga. The behlava is divided into the asthayi (from Ma to Sa) and antara (from Ma, Pa, or Dha to Pa of the higher register). The Dugun-Ka-Alap follows in which groups of two or four note combinations are sung in quicker succession but the basic tempo remains the same.");
        adaptergharanaList.add(a);

        a = new Adaptergharana(covers[5],"Man Singh University","The present University, Raja Mansingh Tomar Music & Arts University, Gwalior is a befitting tribute to a generous and music loving ruler Raja Mansingh Tomar (1486-1518) because the king always promoted the ancient Indian Art and during his period there was tremendous progress in Music and Sculpture. Raja Mansingh Tomar comprehended the importance of Music and Arts and holds the credit for developing the art of dance. He provided patronage to sculpture, art of engraving, drawing and painting and the ancient Indian Culture. The present university symbolizes the great effort of Raja Mansingh Tomar for the learning of art and music in India. The great musicians like Tansen and Baiju Bawra had their music education at sangeet Vidhyapeeth Gwalior opened by Raja Mansingh Tomar. Gwalior Gharana is the oldest of gharanas of music. So looking into the historical and cultural heritage of Gwalior, Madhya Pradesh Govt. Started the present University in the Sweet monuments of Raja Mansingh Tomar at Gwalior. This dream was fulfilled on 19th Aug, 2008, when the university started functioning with five Faculties of Music, Dance, Fine Arts, Theatre and Social Science with affiliation to nearly Ninety five institutions of Madhya Pradesh As a teaching cum residential university; the faculties have enriched the cultural heritage with various activities all around. The University aims at the advancement and cultural heritage with various activities all around. The University aims at the advancement and dissemination of learning and knowledge of music and arts and their role in national development.");
        adaptergharanaList.add(a);



    }
}
