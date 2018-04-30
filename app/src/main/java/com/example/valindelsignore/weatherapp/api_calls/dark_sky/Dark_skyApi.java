package com.example.valindelsignore.weatherapp.api_calls.dark_sky;

import com.example.valindelsignore.weatherapp.api_calls.google.GoogleAdress;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Dark_skyApi {
    @GET("json")
    Call<Weather> getWeather(@Path("api_key") String apiKey, @Path("lattitude")double lattitude, @Path("longtitude") double  longtitude);



}
