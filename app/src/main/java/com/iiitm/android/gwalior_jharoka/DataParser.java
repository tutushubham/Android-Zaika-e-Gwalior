package com.iiitm.android.gwalior_jharoka;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataParser {

    private HashMap<String ,String > getPlace(JSONObject googlePlaceJson) throws JSONException {
        HashMap<String,String> googlePlaceMap=new HashMap<>();
        String placeName="-NA-";
        String  vicinity="-NA-";
        String latitude="";
        String longitude="";
        String reference="";

        if(!googlePlaceJson.isNull("name"))
        {
            placeName=googlePlaceJson.getString("name");
        }
        if(!googlePlaceJson.isNull("vicinity")){
            vicinity=googlePlaceJson.getString("vicinity");
        }
        latitude=googlePlaceJson.getJSONObject("geometry").getJSONObject("location").getString("lat");
        longitude=googlePlaceJson.getJSONObject("geometry").getJSONObject("location").getString("lng");
        reference=googlePlaceJson.getString("reference");
        googlePlaceMap.put("place_name",placeName);
        googlePlaceMap.put("vicinity",vicinity);

        googlePlaceMap.put("lat",latitude);

        googlePlaceMap.put("lng",longitude);

        googlePlaceMap.put("reference",reference);

        return googlePlaceMap;

    }
    private List<HashMap<String,String >> getPlaces(JSONArray jsonArray) throws JSONException {
        int count=jsonArray.length();
        List<HashMap<String ,String >>placesList=new ArrayList<>();
        HashMap<String ,String>placeMap= null;
        for(int i=0;i<count;i++){
            placeMap=getPlace((JSONObject)jsonArray.get(i));
            placesList.add(placeMap);

        }
        return placesList;
    }
    public List<HashMap<String ,String>>parse(String jsonData) throws JSONException {
        JSONArray jsonArray=null;
        JSONObject jsonObject;
        jsonObject=new JSONObject(jsonData);
        jsonArray=jsonObject.getJSONArray("results");
        return getPlaces(jsonArray);
    }

}
