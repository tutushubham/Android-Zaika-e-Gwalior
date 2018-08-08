package com.iiitm.android.zaika_e_gwalior;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener{


    private GoogleMap mMap;
    public List<Adaptertoilets> adaptertoiletsList = new ArrayList<>();
    MovieAdaptertoilets movieAdaptertoilets;
    private GoogleApiClient client;
    private LocationRequest locationRequest;
    private Location lastlocation;
    private Marker currentLocationmMarker;
    private Button mNearby;
    private Button mNearest;
    int select;
    public static final int REQUEST_LOCATION_CODE = 99;
    int PROXIMITY_RADIUS = 50000;
    double latitude,longitude;
    @Override
    public void onLocationChanged(Location location) {

        latitude = location.getLatitude();
        longitude = location.getLongitude();
        lastlocation = location;
        if(currentLocationmMarker != null)
        {
            currentLocationmMarker.remove();

        }
        Log.d("lat = ",""+latitude);
        LatLng latLng = new LatLng(location.getLatitude() , location.getLongitude());
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("Current Location");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        currentLocationmMarker = mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.zoomBy(10));

        if(client != null)
        {
            LocationServices.FusedLocationApi.removeLocationUpdates(client,this);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            checkLocationPermission();

        }
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mNearby=(Button)findViewById(R.id.button4);
        mNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object dataTransfer[] = new Object[2];
                    GetNearbyPlaces getNearbyPlacesData = new GetNearbyPlaces();


                    mMap.clear();
                    String toilets = "public%20toilet";
                    String url = getUrl(latitude, longitude, toilets);
                    dataTransfer[0] = mMap;
                    dataTransfer[1] = url;

                    getNearbyPlacesData.execute(dataTransfer);
                    Toast.makeText(MapsActivity.this, "Showing Nearby Toilets", Toast.LENGTH_SHORT).show();

            }
        });
        RecyclerView recyclerView = findViewById(R.id.map_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieAdaptertoilets = new MovieAdaptertoilets(adaptertoiletsList, this);
        recyclerView.setAdapter(movieAdaptertoilets);
        select = getIntent().getExtras().getInt("lang");
        if(select==0) {
            prepareMovieData();
        }
        if(select==1){
            prepareMovieDataHindi();
        }

        mNearest=(Button)findViewById(R.id.button5);
        mNearest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object dataTransfer[] = new Object[4];
                GetNearestPlace getNearbyPlacesData = new GetNearestPlace();


                mMap.clear();
                String toilets = "public%20toilet";
                String url = getUrl(latitude, longitude, toilets);
                dataTransfer[0] = mMap;
                dataTransfer[1] = url;
                dataTransfer[2]=latitude;
                dataTransfer[3]=longitude;

                getNearbyPlacesData.execute(dataTransfer);
            }
        });
    }

    private void prepareMovieDataHindi() {
        Adaptertoilets a = new Adaptertoilets("सुलभ जन सुविधा केंद्र", "सार्वजनिक बाथरूम", "24 Hours", " विक्टोरिया मार्केट, चौपाती के पास, फूल बाग आरडी, फूल बाग, लश्कर, ग्वालियर, मध्य प्रदेश 474007");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर", "सार्वजनिक बाथरूम", "7:30AM–9:00PM", "बोट क्लब के पास, फूल बाग, ग्वालियर, मध्य प्रदेश 474007");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर", "सार्वजनिक बाथरूम", "24 Hours", "खुला संतर, सरदार बाजार, मोरार, ग्वालियर, मध्य प्रदेश 47400");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", " लक्ष्मी गंज, ग्वालियर, मध्य प्रदेश 474001");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "आरवीएस कृषि विश्वविद्यालय कैम्पस, थातीपुर, ग्वालियर, मध्य प्रदेश 474011");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("सुलभ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "राष्ट्रीय राजमार्ग 92, मोरार, ग्वालियर, मध्य प्रदेश 474004");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "ग्वालियर, जयेंद्रगंज, शिंदे की छ्वानी, ग्वालियर, मध्य प्रदेश 474009");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("स्वच्छ सार्वजनिक शौचालय", "सार्वजनिक बाथरूम", "24 Hours", " ललितपुर कॉलोनी, लश्कर, ग्वालियर, मध्य प्रदेश 474009");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सरकारी शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "नौगाजा आरडी के पास, शिंदे की छ्वानी, ग्वालियर, मध्य प्रदेश 474001");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("स्वच्छ सार्वजनिक शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "महाराणा प्रताप नगर, लश्कर, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("स्वच्छ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "पारधी मोहल्ला, शेख की बागिया, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("जैव शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "लश्कर, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सामुदायिक शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "घासमंंडी, मिर्जापुर, घाटमपुर, ग्वालियर, मध्य प्रदेश ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर", "सार्वजनिक बाथरूम", "24 Hours", "माधव औषधालय, अस्पताल रोड, लश्कर, ग्वालियर,");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सार्वजनिक मूत्रालय", "सार्वजनिक बाथरूम", "24 Hours", "सराफा बाजार, बाडा, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("सुलभ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "काम्पू, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "जवाहर कॉलोनी, वार्ड नं 46, ग्वालियर, मध्य प्रदेश ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सिटी शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "मयूर नगर, थातीपुर, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("सुलभ शौचालय ", "सार्वजनिक बाथरूम", "24 Hours", "जिंशी नाला नंबर: 1, अनटपुल, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("सुलभ शौचालय परिसर", "सार्वजनिक बाथरूम", "24 Hours", "ललितपुर कॉलोनी, लश्कर, ग्वालियर, मध्य प्रदेश");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("सुलभ शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "सिटी सेंटर, तुलसी विहार कॉलोनी, ग्वालियर, मध्य प्रदेश 474002 ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("नगर निगम शौचालय", "सार्वजनिक बाथरूम", "24 Hours", "महलगांव, ग्वालियर, मध्य प्रदेश 474002 ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("सुलभ शौचालय परिसर", "सार्वजनिक बाथरूम", "24 Hours", "जे। ए। अस्पताल परिसर, लश्कर, ग्वालियर, मध्य प्रदेश 474009 ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("सुलभ शौचालय परिसर", "सार्वजनिक बाथरूम", "24 Hours", "सिंधी कॉलोनी रोड, ग्वालियर, मध्य प्रदेश 474001");
        adaptertoiletsList.add(a);

    }

    private void prepareMovieData() {


        Adaptertoilets a = new Adaptertoilets("Sulabh Jan Suvidha Kendra","Public Bathroom","24 Hours"," Victoria Market, Near Choupati, Phool Bagh Rd, Phool Bagh, Lashkar, Gwalior, Madhya Pradesh 474007");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya Complex","Public Bathroom","7:30AM–9:00PM","Near Boat Club, Phool Bagh, Gwalior, Madhya Pradesh 474007");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sauchalay Complex","Public Bathroom","24 Hours","Khulaa Santar, Sardar Bazar, Morar, Gwalior, Madhya Pradesh 47400");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sauchalay","Public Bathroom","24 Hours"," Laxmi Ganj, Gwalior, Madhya Pradesh 474001");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya","Public Bathroom","24 Hours"," RVS Agriculture University Campus, Thatipur, Gwalior, Madhya Pradesh 474011");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("Sulabh Shauchalaya","Public Bathroom","24 Hours","National Highway 92, Morar, Gwalior, Madhya Pradesh 474004");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya","Public Bathroom","24 Hours"," Gwalior, Jayendraganj, Shinde Ki Chhawani, Gwalior, Madhya Pradesh 474009");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Swacch Public Toilet","Public Bathroom","24 Hours"," Lalitpur Colony, Lashkar, Gwalior, Madhya Pradesh 474009");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Government Toilet","Public Bathroom","24 Hours","  Near Naugaja Rd, Shinde Ki Chhawani, Gwalior, Madhya Pradesh 474001");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Swacch Public Toilet","Public Bathroom","24 Hours"," Maharana Pratap Nagar, Lashkar, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Toilets","Public Bathroom","24 Hours"," Pardhi Mohalla, Shekh Ki Bagiya, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Bio Toilet","Public Bathroom","24 Hours"," Lashkar, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Samudayik Shauchalay","Public Bathroom","24 Hours"," Ghasmandi, Mirjapur, Ghatampur, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shuchalay Complex","Public Bathroom","24 Hours"," Madhav Dispensary, Hospital Rd, Lashkar, Gwalior, ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Public Urinal","Public Bathroom","24 Hours"," Sarafa Bazar, Bada, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("Sulabh Sauchalaya","Public Bathroom","24 Hours"," Kampoo, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Complex","Public Bathroom","24 Hours","Jawahar Colony, Ward No. 46, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("City Sochalaya","Public Bathroom","24 Hours"," Mayur Nagar, Thatipur, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);



        a = new Adaptertoilets("Sulabh Shauchalay","Public Bathroom","24 Hours"," Jinsi Nala No: 1, Untpul, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Sulabh Shauchalay Complex","Public Bathroom","24 Hours"," Lalitpur Colony, Lashkar, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Sulabh Sauchalay","Public Bathroom","24 Hours"," City Center, Tulsi Vihar Colony, Gwalior, Madhya Pradesh 474002 ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Nagar Nigam Sauchalaya","Public Bathroom","24 Hours"," Mahalgaon, Gwalior, Madhya Pradesh 474002 ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Sulabh Shauchalaya Complex","Public Bathroom","24 Hours"," J. A. Hospital Campus, Lashkar, Gwalior, Madhya Pradesh 474009 ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sochalay Complex","Public Bathroom","24 Hours"," Sindi Colony Rd, Gwalior, Madhya Pradesh 474001");
        adaptertoiletsList.add(a);
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode)
        {
            case REQUEST_LOCATION_CODE:
                if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) !=  PackageManager.PERMISSION_GRANTED)
                    {
                        if(client == null)
                        {
                            bulidGoogleApiClient();
                        }
                        mMap.setMyLocationEnabled(true);
                    }
                }
                else
                {
                    Toast.makeText(this,"Permission Denied" , Toast.LENGTH_LONG).show();
                }
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            bulidGoogleApiClient();
            mMap.setMyLocationEnabled(true);
        }
    }


    protected synchronized void bulidGoogleApiClient() {
        client = new GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
        client.connect();

    }



//    public void onClick(View v)
//    {Object dataTransfer[] = new Object[2];
//        GetNearbyPlaces getNearbyPlacesData = new GetNearbyPlaces();
//
//
//            mMap.clear();
//            String toilets = "toilets";
//            String url = getUrl(latitude, longitude, toilets);
//            dataTransfer[0] = mMap;
//            dataTransfer[1] = url;
//
//            getNearbyPlacesData.execute(dataTransfer);
//            Toast.makeText(MapsActivity.this, "Showing Nearby Toilets", Toast.LENGTH_SHORT).show();
//
//
//    }


    private String getUrl(double latitude , double longitude , String nearbyPlace)
    {

        StringBuilder googlePlaceUrl = new StringBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
        googlePlaceUrl.append("location="+latitude+","+longitude);
        googlePlaceUrl.append("&radius="+PROXIMITY_RADIUS);
        googlePlaceUrl.append("&type="+nearbyPlace);
        googlePlaceUrl.append("&sensor=true");
        googlePlaceUrl.append("&key="+"AIzaSyCmNNqKM2waolVzOKpHgdRS4xKlBChqzEU");

        Log.d("MapsActivity", "url = "+googlePlaceUrl.toString());

        return googlePlaceUrl.toString();
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

        locationRequest = new LocationRequest();
        locationRequest.setInterval(100);
        locationRequest.setFastestInterval(1000);
        locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);


        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION ) == PackageManager.PERMISSION_GRANTED)
        {
            LocationServices.FusedLocationApi.requestLocationUpdates(client, locationRequest, this);
        }
    }


    public boolean checkLocationPermission()
    {
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)  != PackageManager.PERMISSION_GRANTED )
        {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION))
            {
                ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.ACCESS_FINE_LOCATION },REQUEST_LOCATION_CODE);
            }
            else
            {
                ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.ACCESS_FINE_LOCATION },REQUEST_LOCATION_CODE);
            }
            return false;

        }
        else
            return true;
    }


    @Override
    public void onConnectionSuspended(int i) {
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }
}
