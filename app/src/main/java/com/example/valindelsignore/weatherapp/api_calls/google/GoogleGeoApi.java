package com.example.valindelsignore.weatherapp.api_calls.google;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by valindelsignore on 4/24/18.
 */

public interface GoogleGeoApi {
@GET("json")
Call<GoogleAdress> getAdress(@Query("adress")String adress, @Query("api_key")String apiKey);


    



}
