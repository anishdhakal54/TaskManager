package com.example.taskmanager.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class URL {

    public static String base_url="http://10.2.2:3000/";
    public static String token="";

    public static Retrofit getInstance(){
        Retrofit retrofit=new Retrofit.Builder().baseUrl(base_url).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;

    }
}
