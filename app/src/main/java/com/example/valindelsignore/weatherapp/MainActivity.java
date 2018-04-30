package com.example.valindelsignore.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.valindelsignore.weatherapp.api_calls.google.GoogleGeoApi;
import com.google.gson.annotations.SerializedName;

import butterknife.ButterKnife;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private GoogleGeoApi mGoogleGeoApi;
    private String mGoogleBaseUrl;
    private String mFoogleApiKey;
    private Retrofit mGoogleRetrofit;
    private DarkSkyApi mDarkSkyApi;
    private String mDarkSytBaseUrl;
    private String mDarkSkyApiKey;
    private Retrofit mDarkSkyRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
