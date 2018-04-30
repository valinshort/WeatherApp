package com.example.valindelsignore.weatherapp.api_calls.google;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GoogleAdress {

    @SerializedName("results")


    private List<Results> mresultList;

    public List<Results> getMresultList() {
        return mresultList;
    }


    class Results {

        @SerializedName("formatted address")
        private String formattedAddress;

        public String getFormattedAddress() {
            return formattedAddress;
        }

        @SerializedName("geometry")
        private Geometry geometry;
    }

    class Geometry


    {

        @SerializedName("location")
        private GoogleLocation googleLocation;

        public GoogleLocation getGoogleLocation() {
            return googleLocation;
        }

        class GoogleLocation {

            @SerializedName("lat")
            private Double lat;
            public Double getLat;

            @SerializedName("lng")
            private Double lng;
            public Double getLng;

        }
    }


}
