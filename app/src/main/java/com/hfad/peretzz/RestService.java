package com.hfad.peretzz;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestService {
    @GET("product")
    Call<Model> productList();
}
