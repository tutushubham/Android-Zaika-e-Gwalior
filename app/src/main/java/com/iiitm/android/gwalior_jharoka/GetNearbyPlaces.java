package com.iiitm.android.gwalior_jharoka;

import android.os.AsyncTask;
import android.os.Handler;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetNearbyPlaces extends AsyncTask <Object,String ,String>{

    String goolePlacesData;
    GoogleMap mMap;
    String url;

    @Override
    protected String doInBackground(Object... objects) {
        mMap=(GoogleMap)objects[0];
        url=(String)objects[1];
        DownloadUrl downloadUrl=new DownloadUrl();
        try{
            goolePlacesData=downloadUrl.readUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return goolePlacesData;
    }

    @Override
    protected void onPostExecute(String s) {
        List<HashMap<String ,String>>nearbyPlacesList=null;
        DataParser parser=new DataParser();
        try {
            nearbyPlacesList=parser.parse(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        showNearbyPlaces(nearbyPlacesList);

    }

    private  void showNearbyPlaces(List<HashMap<String ,String >> nearbyPLacesList){
        for(int i=0;i<nearbyPLacesList.size();i++){
            MarkerOptions markerOptions=new MarkerOptions();
            HashMap<String ,String>googlePlace=nearbyPLacesList.get(i);

            String placeNmae=googlePlace.get("place_name");
            String vicinity=googlePlace.get("vicinity");
            double lat=Double.parseDouble(googlePlace.get("lat"));
            double lng=Double.parseDouble(googlePlace.get("lng"));
            LatLng latlng=new LatLng(lat,lng);
            markerOptions.position(latlng);
            markerOptions.title(placeNmae+"|"+vicinity);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mMap.addMarker(markerOptions);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latlng));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(10));


        }
    }

}
