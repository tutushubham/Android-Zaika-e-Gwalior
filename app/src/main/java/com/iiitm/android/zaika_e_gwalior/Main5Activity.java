package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {
    public List<Adaptermedical> adaptermedicalList = new ArrayList<>();
     Context mContext;
    MovieAdaptermedical movieAdaptermedical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Medical");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
         recyclerView.setLayoutManager(layoutManager);
        mContext=this;
        movieAdaptermedical = new MovieAdaptermedical(adaptermedicalList,this);
        recyclerView.setAdapter(movieAdaptermedical);
        prepareMovieData();
    }

    private void prepareMovieData() {
        int[] covers = new int[]{
                R.drawable.apoloh,
                R.drawable.pariwarh,
                R.drawable.navjeevanh,
                R.drawable.kalyanmemorialh,
                R.drawable.shaharah,
                R.drawable.apex,
                R.drawable.bimr,
                R.drawable.charitbal,R.drawable.jaya,R.drawable.rkm,R.drawable.gcivilh,R.drawable.kamalraja,

        };


        Adaptermedical a = new Adaptermedical(covers[0],"Apolo Spectra","Lashkar,Gwalior","24 Hours",
                "Apollo hospital offers superlative care in wide range of surgical specialties including General & Laparoscopic Surgery, Orthopaedic & Spine, Gynaecology, Ophthalmology, to name a few. In addition, the hospital provides comprehensive medical care in specialties like Nephrology, Neurology, Gastroenterology, Cardiology, Dental, Dermatology, Plastic & Cosmetic Surgery.","Lashkar, Gwalior, Madhya Pradesh 474002","07512454600","gfjhgfjhdegj");
        adaptermedicalList.add(a);

        a = new Adaptermedical(covers[1],"Pariwar Hospital","Lashkar,Gwalior","24 Hours",
                "In Gwalior, Parivar Hospital is a recognized name in patient care. It was incepted in the year 2008. They are one of the well-known Hospitals in Lashkar. Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities ICU ,CCU,TRAUMA UNIT, ECHOCARDIOLOGY SECTION,SURGICAL ICU,DIALYSIS UNITOPHTHALMOGY SECTION etc.","Lashkar, Gwalior, Madhya Pradesh 474001","07514047000","gfjhgfjhdegj");
        adaptermedicalList.add(a);

        a = new Adaptermedical(covers[2],"Navjeevan Hospital","Moti Mahal Road ,Gwalior","24 hour",
                " in Gwalior, Navjeevan Hospital is a recognized name in patient care. It was incepted in the year 2007. They are one of the well-known Private Hospitals in Moti Mahal Road. Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcaresuch as ICU with central oxygen supply & Multipara monitor ,Ultra modern operation theatres for surgical procedure , ICU with central oxygen supply & Multipara monitor , Ultra modern operation theatres for surgical procedure, Dialysis unit ,Medical Store,24 hours emergency facility,24 h ours Ambulance Service,Cashless and Mediclaim Insurance services ,Physiotherapy etc.","Moti Mahal Road, Gwalior, Madhya Pradesh 474002","07514024081","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[3],"Kalyan Hospital","Lashkar,Gwalior","24 Hour",
                "Kalyan Memorial & KDJ Hospital is an upcomming hospital in gwalior. The hospital has a state of the art 100 bedded super specialty facility providing complete range of latest machines. It has a fully equipped Ortho and Trauma Unit, an emergency department and I.C.C for different facilities assisted  with round the clock post graduate doctors on duty supported Ventilator, Defibrillator, Multiparamonnitors and other Critical care equipment.","Lashkar,Gwalior-474001, Hospital road","07514006700","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[4],"Shahara Hospital","Vasant Vihar,Gwalior","24 Hours",
                "In Gwalior, Sahara Hospital is a recognized name in patient care. It was incepted in the year 2000. They are one of the well-known Hospitals in . Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities,","Vasant Vihar, Gwalior, Madhya Pradesh 474007","09926800870","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[5],"Apex Hospital","Tagore Nagar,Gwalior","24 Hours",
                "In Gwalior,Apex Hospital is a recognized name in patient care. It is one of the well-known Private Hospitals in City Centre. Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities such as Dengue Fever Treatment ,Vaccination/Immunization ,Viral Fever Treatment,Diseases in Pregnancy ,General Pediatrics and etc."," Tagore Nagar, Anupam Nagar, Saraswati Nagar, Gwalior, Madhya Pradesh 474011","07512340910","gfjhgfjhdegj");
        adaptermedicalList.add(a);

        a = new Adaptermedical(covers[6],"BIMR Hospital","Morar,Gwalior","08:00 A.M- 06:00 P.M",
                "BIMR hospital provide many facilities such as Pharmacy,I.C.C.U., Neo-Natal Intermediate Ward with AHU, Post Operative Surgical Ward with AHU, Medical Intermediate Ward with AHU, Neuro I.C.U. and Neuro Surgery Center, Blood Bank, C.T. Scan, X-Ray (300 M.A.) with Digital Technology, Mobile X-Ray, Ultrasonography, NABL Accredited Laboratory services and etc.","Morar,Gwalior,Madhya Pradesh 474005","07512405617","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[7],"Anandpur Charitable ","Purani Chhawani,Gwalior","24 Hours",
                "Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities, they are one of the upcoming names in the healthcare industry. Located in , this hospital is easily accessible by various means of transport. A team of well-trained medical staff, non-medical staff and experienced clinical technicians work round-the-clock to offer various services . Their professional services make them a sought after Charitable Hospitals in Gwalior. A team of doctors on board, including specialists are equipped with the knowledge and expertise for handling various types of medical cases.","NH 3, Purani Chhawani, Gwalior West, Madhya Pradesh 474010","07512401200","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[8],"Jaya Arogya Hospital","Kampoo,Gwalior","24 Hours",
                "At present the bed strength of Hospital is about 1200 beds. Hospital is equipped with the all the modern equipments.  It provide may facilities such as Neurosurgery,Spiral CT Scan and MR Imaging system,Chest Pain Treatment , Clinical Cardiology ,Heart Conditions,Skin Disease Treatment,Specialty Diagnostics in Tuberculosis ,Neurological Conditions ,Eye Checkup General ,Eye Surgery ,Bone Trauma ,Fracture Treatment and etc.","J A Hospital Campus,Kampoo Gwalior - 474001"," 07512403200","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[9],"R.K.Memorial Hospital","Kherapati Road,Gwalior","24 Hours",
                "R K Memorial Heart Hospital and Medical Care Centre, Gwalior is among well-known hospital for valuable treatment.This hospital in Gwalior offers a lot of facilities for patient’s treatment like ambulance, ICU/general beds, Pharmacy, Canteen, etc.Along with above facilities, hospital is specialised for Cardiology.R K Memorial Heart Hospital and Medical Care Centre has specialist doctors practicing under different specializations."," Ravi Nagar,Behind Gda Ofiice,Kherapati Road.,Gwalior, Madhya Pradesh","07512630329","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[10],"Government Hospital  ","Tansen Nagar,Gwalior","24 Hours",
                "In Gwalior,Goverment  Civil Hospital is a recognized name in patient care. They are one of the well-known Hospitals . Backed with a vision to offer the best in patient care and equipped with technologically advanced healthcare facilities, they are one of the upcoming names in the healthcare industry. Located in , this hospital is easily accessible by various means of transport. A team of well-trained medical staff, non-medical staff and experienced clinical technicians work round-the-clock to offer various services . Their professional services make them a sought after Hospitals in Gwalior. A team of doctors on board, including specialists are equipped with the knowledge and expertise for handling various types of medical cases.","Unnamed Road, Tansen Nagar, Gwalior, Madhya Pradesh 474002","Not available","gfjhgfjhdegj");
        adaptermedicalList.add(a);


        a = new Adaptermedical(covers[11],"Kamala Raje Hospital","Lashkar,Gwalior","24 Hours",
                "There is formation of new neonatology wing (nursery) and also the pediatric ICU with latest gazette. It has Gynaecology and obstetric wards, Children wards, Children ICU, children surgical ward, female Orthopaedics ward, female surgical and burn ward and female ENT ward.At present the hospital is about 450 bedded and has a pediatric ICU under the Pediatric Department, A Burn ward for female Burn patients under Dept. of Surgery and a sonology section in Dept. of Obstetrics and Gynaecology."," J. A. Hospital Campus, Lashkar, Gwalior, Madhya Pradesh 474009","09425360494","gfjhgfjhdegj");
        adaptermedicalList.add(a);




    }
}
