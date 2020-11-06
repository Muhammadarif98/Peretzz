package com.hfad.peretzz;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService INSTANCE = null;
    private RestService service;

    public static NetworkService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NetworkService();
        }
        return INSTANCE;
    }

    public void build() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://peretz-group.ru/api/v2/products?category=93&key=47be9031474183ea92958d5e255d888e47bdad44afd5d7b7201d0eb572be5278")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(RestService.class);
    }

    public RestService getService() {
        return service;
    }
}
