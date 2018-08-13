package com.iiitm.android.zaika_e_gwalior;

/**
 * Created by Riya Khandelwal on 12-07-2018.
 */

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.iiitm.android.gwalior_jharoka.DataParser;

import org.json.JSONException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import com.iiitm.android.gwalior_jharoka.DownloadUrl;

public class GetNearestPlace extends AsyncTask<Object, String, String> {

    private String googlePlacesData;
    private GoogleMap mMap;
    String url;
    private double latMy,lngMy;

    @Override
    protected String doInBackground(Object... objects){
        mMap = (GoogleMap)objects[0];
        url = (String)objects[1];
        latMy=(double)objects[2];
        lngMy=(double)objects[3];


        DownloadUrl downloadURL = new DownloadUrl();
        try {
            googlePlacesData = downloadURL.readUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return googlePlacesData;
    }

    @Override
    protected void onPostExecute(String s) {

        List<HashMap<String, String>> nearbyPlaceList;
        DataParser parser = new DataParser();
        nearbyPlaceList = parser.parse(s);
        Log.d("nearestplacesdata", "called parse method");
        showNearestPlace(nearbyPlaceList);

    }
    private void showNearestPlace(List<HashMap<String, String>> nearbyPlaceList)
    {
        double distNearest=1000,dist;
        double latNearest=0,lngNearest=0;
        String placeNameNearest=null,vicinityNearest = null;
        MarkerOptions markerOptions = new MarkerOptions();
        for(int i = 0; i < nearbyPlaceList.size(); i++)
        {

            HashMap<String, String> googlePlace = nearbyPlaceList.get(i);

           String placeName = googlePlace.get("place_name");
           String vicinity = googlePlace.get("vicinity");
            double lat = Double.parseDouble( googlePlace.get("lat"));
            double lng = Double.parseDouble( googlePlace.get("lng"));
            dist=distance(latMy,lngMy,lat,lng);
            if(dist<distNearest){
                distNearest=dist;
                latNearest=lat;
                lngNearest=lng;
                placeNameNearest=placeName;
                vicinityNearest=vicinity;
            }
        }
        LatLng latLng = new LatLng( latNearest, lngNearest);
        markerOptions.position(latLng);
        markerOptions.title(placeNameNearest+ " : "+ vicinityNearest);
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));

        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10));

    }

    private double distance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2))
                + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2))
                * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60; // 60 nautical miles per degree of seperation
        dist = dist * 1852; // 1852 meters per nautical mile
        return (dist);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

}