package com.hfad.peretzz;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RestService {
    @GET("array.json")
    public Call<Post> getPost();
}
