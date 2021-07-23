package com.irwan.irwanta;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {
    private static Retrofit retrofit;
    private static String BASE_URL = "http://10.20.45.132:5000/";

    public static Retrofit getRetrofit() {

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

//        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
//                    addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();
//        }

        return retrofit;

    }
}
