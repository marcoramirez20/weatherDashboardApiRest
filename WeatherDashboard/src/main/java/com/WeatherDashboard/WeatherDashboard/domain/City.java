package com.WeatherDashboard.WeatherDashboard.domain;

public class City {
    public City() {
    }

    private Integer openWeatherMapId;
    private Integer accuWeatherId;
    private String cityName;
    private Double latitude;
    private Double longitude;

    public Integer getOpenWeatherMapId() {
        return openWeatherMapId;
    }

    public void setOpenWeatherMapId(Integer openWeatherMapId) {
        this.openWeatherMapId = openWeatherMapId;
    }

    public Integer getAccuWeatherId() {
        return accuWeatherId;
    }

    public void setAccuWeatherId(Integer accuWeatherId) {
        this.accuWeatherId = accuWeatherId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
