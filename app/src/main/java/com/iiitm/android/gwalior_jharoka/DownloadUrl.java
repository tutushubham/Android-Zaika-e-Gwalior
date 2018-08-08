package com.iiitm.android.gwalior_jharoka;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadUrl {

    public String readUrl(String myUrl) throws IOException {
        String data="";
        InputStream inputStream=null;
       HttpURLConnection urlConnection=null;
        URL url=new URL(myUrl);
        urlConnection=(HttpURLConnection)url.openConnection();
        urlConnection.connect();

        inputStream=urlConnection.getInputStream();
        BufferedReader br=new BufferedReader((new InputStreamReader(inputStream)));
        StringBuffer sb=new StringBuffer();
        String line="";
        while((line=br.readLine())!=null)
        {
            sb.append(line);
        }
        data=sb.toString();
        br.close();
        return data;

    }
}
