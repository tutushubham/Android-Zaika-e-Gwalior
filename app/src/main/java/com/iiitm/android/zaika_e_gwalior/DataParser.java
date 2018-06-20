package com.iiitm.android.zaika_e_gwalior;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

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

}
