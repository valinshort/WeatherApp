package com.example.valindelsignore.weatherapp.api_calls.dark_sky;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather implements Parcelable {


    @SerializedName("latitude")
    private double latitude;

    @SerializedName("longtitude")
    private double longtitude;

    @SerializedName("currently")
    private CurrentProperties mCurrentProperties;

    @SerializedName("daily")
    private DailyProperties mDailyProperties;


    protected Weather(Parcel in) {
        latitude = in.readDouble();
        longtitude = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(latitude);
        dest.writeDouble(longtitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public CurrentProperties getmCurrentProperties() {
        return mCurrentProperties;
    }

    public DailyProperties getmDailyProperties() {
        return mDailyProperties;
    }

    public static final Creator<Weather> CREATOR = new Creator<Weather>() {
        @Override
        public Weather createFromParcel(Parcel in) {
            return new Weather(in);
        }

        @Override
        public Weather[] newArray(int size) {
            return new Weather[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

}

class CurrentProperties {
    @SerializedName("summary")
    private String summary;

    @SerializedName("icon")
    private String icon;

    @SerializedName("tempature")
    private double tempature;

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public double getTempature() {
        return tempature;
    }
}

class DailyProperties {

    @SerializedName("data")
    private List<DailyData> mDailyDataList() {
        return mDailyDatList;
    }

    class DailyData {
        @SerializedName("tempatureMin")
        private double tempatureMin;
@SerializedName("tempatureHigh")
        private double getTempaturehigh;

@SerializedName("PrecipProbability")
        private double precipProbability;

        public double getTempatureMin() {
            return tempatureMin;
        }

        public double getGetTempaturehigh() {
            return getTempaturehigh;
        }

        public double getPrecipProbability() {
            return precipProbability;
        }
    }

}