package com.hfad.peretzz;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RestService {
    @GET("/post/{id}")
    public Call<Post> getPostWithId(@Path("id") int id);
}
