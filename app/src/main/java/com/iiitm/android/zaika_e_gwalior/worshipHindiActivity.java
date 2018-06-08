package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivam on 12/19/2017.
 */

public class worshipHindiActivity extends AppCompatActivity {

    public List<Adapterworship> adapterworshipList = new ArrayList<>();
    Context mContext;
    MovieAdapterworship movieAdapterworship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainworship);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("पूजा स्थान");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieAdapterworship = new MovieAdapterworship(adapterworshipList, this);
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
                R.drawable.carthedral,
                R.drawable.vikkkkkk,

        };


        Adapterworship a = new Adapterworship(covers[0],"अचलेश्वर मंदिर", "Gwalior,M.p.", "10:00 am - 06:00 pm",
                "श्री अचलेश्वर मंदिर ग्वालियर में बहुत प्रसिद्ध मंदिर है, जहां लोग भगवान शिव और नंदी की पूजा करने आते हैं। नंदी को आमतौर पर एक बैल के रूप में दर्शाया जाता है जो भगवान शिव के पर्वत के रूप में भी कार्य करता है। यह मंदिर के बारे में शहर के लोगों के बीच एक बहुत ही प्रसिद्ध मिथक है कि एक बार स्किंडिया शासक श्री मधोरे सिंधिया जी उस रास्ते पर सड़क बना रहे थे लेकिन शिवलिंग पहले से ही रास्ते में रहते थे, इसलिए यह किसी भी रॉक या कुछ और सोचा था कि वे लगातार प्रयास कर रहे थे उस चट्टान को हटा दें लेकिन फिर भी वे उस चट्टान की गहराई खोजने में असमर्थ थे और इसलिए महाराज एक बड़ी दुविधा में थे, और एक रात भगवान अचलनाथ खुद अपने सपने में प्रकट हुए और उन्हें बताया कि वह रॉक होने का अनुमान लगा रहा है वह वास्तव में उसका रूप है और वह भक्तों को आशीर्वाद देने के लिए है। भगवान ने उसे एक महान मंदिर बनाने का आदेश दिया और अगले दिन से शिवलिंग की पूजा शुरू हो गई और मंदिर शहर के मध्य में `अचलेश्वर मंदिर के रूप में निर्माण किया गया।", "ललितपुर कॉलोनी, लश्कर,ग्वालियर (म.प्रदेश) 474009", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);

        a = new Adapterworship(covers[1], "गर्गज के हनुमान", "बहोडापुर, ग्वालियर", "10:00 am - 06:00 pm",
                        "मध्य प्रदेश के ग्वालियर शहर में प्राचीन काल में गलाव ऋषि की मृत्यु हो गई है। इस सर्वोच्च पवित्र स्थान में, संकल्पमोखान सिद्ध श्री खेदपति जी हनुमान का प्राचीन मंदिर स्थित है। यहां से, प्रत्येक रात 4 बजे सुबह से भक्तों का आगमन शुरू होता है, जो निरंतर गति से चलता है।\n" +
                        "यह मंदिर श्री राम जानकी मंदिर, छोटे घर, श्री सिद्ध कृदपति हनुमान ट्रस्ट, ग्वालियर द्वारा चलाया जाता है। रामायण और सुंदर कांद का पाठ मंदिर में रखा जाता है। भक्तों को भक्तों को गरीबों को खिलाया जाता है हनुमान जयंती के अवसर पर विशेष विद्युतीकरण और फूल व्यवस्था की जाती है। श्री खेदपति जी को परमेश्वर से छपपन भोग की पेशकश की जाती है।", "लक्ष्मी गंज, ग्वालियर, मध्य प्रदेश 474008", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[2], "गुप्तेश्वर मंदिर", "तिघरा रोड, ग्वालियर", "09:00 am- 08:00 pm",
              "गुप्तेश्वर मंदिर लोगों के बीच महान आध्यात्मिकता का केंद्र है। मंदिर वन के अंदर स्थित है। श्रवण के महीने में भगवान शिव के महीने के रूप में जाना जाता है और अभिषेक के पूरे साल पूरे कार्यक्रम के दौरान जाना जाता है। यह मंदिर सड़क पर एक बड़ी पहाड़ी पर स्थित है शिवलिंग के साथ में माता और भगवान राम-सीता का मंदिर है। इस स्थान पर भगवान शिव से जुड़ी एक बड़ी शुभचिंतता है|", "तिघरा रोड, ग्वालियर, मध्य प्रदेश 475330", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[3], "गुरुद्वारा दाता बंदी", "ग्वालियर किला, ग्वालियर", "24 hours",
               "गुरुद्वारा दाता बंदी छोड एक यादगार गुरु हरगोबिन्द साहिब, 6 वें सिख गुरु की याद में निर्मित है। इतिहास बताता है कि गुरु हरगोबिन्द साहिब को जहांगीर द्वारा परिसर में दो साल से अधिक समय कैद किया गया था। गुरु की रिहाई के समय, वह 52 हिन्दू राजा चाहते थे, जो उनके साथी कैदी थे, जिन्हें रिहा कर दिया गया था। ग्वालियर किले के अंदर निर्मित, गुरुद्वारा का निर्माण 1 9 70 में किया गया था। संगमरमर और रंगीन सना हुआ ग्लास एक्सटीरीयर्स से बने गुरुद्वारा एक महत्वपूर्ण तीर्थस्थल स्थलों में से एक है और प्रत्येक वर्ष कई पर्यटकों द्वारा दौरा किया जाता है। जहांगीर ने निर्देश दिए थे कि जो कोई भी गुरु का वस्त्र रखेगा वह मुक्त हो जाएगा। इस घटना ने गुरु को दाता बंदी छोड का शीर्षक दिया।", "ग्वालियर किला, ग्वालियर", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[4], "दर्गा ख्वाजा", "ग्वालियर किला के पास", "06:00 am- 10:00 pm",
                        "दरगाह ख्वाजा कनून साहिब, ख्वाजा कनून साहिब नागौरी की स्मृति में बनाया गया था। वह मारवाड़ के निवासी थे और 1481 के दौरान ग्वालियर पहुंचे थे। उनका पूरा नाम सैयद सय्यदुद्दीन कान रहमत उल्ला अलेह चिश्ती था, जो दरगाह के गुंबद पर बना हुआ है। माता-पिता की सेवा करने के लिए, बुजुर्गों का सम्मान करना और पवित्र और आज्ञाकारी पालन करना उनके जीवन के पोषित सिद्धांत थे।\n" +
                        "ख्वाजा इस्माइल ने खूनून साहिब को स्वर्गीय बुद्धिमत्ता और अंतर्दृष्टि के साथ सौंप दिया जिसने वह खुद को अपने पिता और गुरु से मिला था। उन्होंने खानून साहिब को पहली बार एमेर में जाने और ग्वालियर में बसने के लिए भगवान का संदेश और सत्य और धर्म की सुसमाचार फैलाने के लिए निर्देश दिया।\n", "Near Gwalior Fort", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[5], "शीतला माता मंदिर", "शिवाजी नगर, ग्वालियर", "10:00 am - 08:00 pm",
                "शीतला माता मंदिर माता शीतला देवी को समर्पित एक मंदिर है", "शिवाजी नगर, ग्वालियर", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);

        a = new Adapterworship(covers[6], "सूर्य मंदिर", "BIMR के पास, ग्वालियर ", "8:00 am-5:00 pm",
                "सूर्य मंदिर उड़ीसा में कोनार्क के प्रसिद्ध सूर्य मंदिर की प्रतिकृति है। सूर्य देव को समर्पित मंदिर, मोरार में निवास के पास स्थित है, और इस क्षेत्र में तीर्थस्थानों में से एक है। मंदिर का निर्माण 1988 में भारत के प्रसिद्ध उद्योगपति जी.डी. बिड़ला द्वारा किया गया था। सूर्य मंदिर लाल रेत का उपयोग कर बनाया गया है। पत्थर और सफेद संगमरमर। मंदिर के बाहर लाल रेत के पत्थर के साथ सजाया जाता है जबकि अंदरूनी एक सफेद संगमरमर का एक आदर्श काम है। मंदिर के बाहरी हिस्सों को भी कई पत्थर की नक्काशीदार छवियों से सजाया गया है जिसमें विभिन्न हिंदू देवताओं का चित्रण किया गया है।", "मोरार, ग्वालियर एमपीP", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);

        a = new Adapterworship(covers[7], "सेंट जोन कैथेड्रल", "फाल्का बाजार, ग्वालियर", "10:00 am -10:00 pm",
                 "यह ग्वालियर में प्रसिद्ध चर्च स्थान है |", " फाल्का बाजार, लश्कर, ग्वालियर, मध्य प्रदेश 474015, India ", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);


        a = new Adapterworship(covers[8], "शनीश्वर मंदिर", "ऐती बारहवली, ग्वालियर", "10:00 am -10:00 pm",
                "ऐती में पत्थर से बना शनीचाड़ा मंदिर विशेष नहीं है, हालांकि यह बाहर से ऐसा नहीं दिखता है। यह श्रीलंका (वर्तमान में श्रीलंका) से लाया शनि की मूल काला मूर्ति रखती है .मानैंक यह है कि बौद्ध रावण (श्रीलंका के राजा) द्वारा हिंदू महाकाव्य रामायण में शनीदेवा को कैदी बना दिया गया था। आती के धुँधले गांव मंदिर की स्थापना के बाद ही अस्तित्व में आया। इससे पहले यह सिर्फ एक बरसात के पहाड़ी पहाड़ी थे जो कुछ पेड़ों के साथ बिंदीदार था।", "ऐती बारहली, मध्य प्रदेश, ग्वालियर476444", "gfsfhsgdj", "gfjhgfjhdegj", "hghjegfgejhr");
        adapterworshipList.add(a);



     /*   a = new Adapterworship(covers[13],"  Vikram Temple"," Gwalior (M.P.)","09:00 am -06:00 pm",
                "The great king of Tomar dynasty Mansingh succeeded by his son Vikramaditya (1516-1523 A.D.) who ruled Gwalior infront the Karan Mahal and behind plan and 212 feet its one side. Palace has a open varanda with twelve doors, which was used as assembly hall. There is a fligat of steps to go upper storey."," Gwalior fort, Gwalior, Madhya Pradesh, 474001","gfsfhsgdj","gfjhgfjhdegj","hghjegfgejhr");
        adapterworshipList.add(a);
*/


    }
}