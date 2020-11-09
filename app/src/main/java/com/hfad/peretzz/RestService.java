package com.hfad.peretzz;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RestService {
    @GET("https://peretz-group.ru/api/v2/products?category=93&key=47be9031474183ea92958d5e255d888e47bdad44afd5d7b7201d0eb572be5278")
    public Call<Post> getPost();
}
