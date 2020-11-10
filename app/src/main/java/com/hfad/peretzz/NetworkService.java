package com.hfad.peretzz;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService INSTANCE = null;
    private RestService service;
    private Retrofit retrofit;
   // String Base_URL =


    private NetworkService() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://peretz-group.ru/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

       // service = retrofit.create(RestService.class);
    }


    public static NetworkService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NetworkService();
        }
        return INSTANCE;
    }



    public RestService getJsonApi() {
        return retrofit.create(RestService.class);
    }
}
