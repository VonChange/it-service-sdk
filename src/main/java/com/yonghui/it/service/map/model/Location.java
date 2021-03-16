package com.yonghui.it.service.map.model;

public class Location {
    private Double  lat;
    private Double lng;
    public Location(){}

    public Location(Double lng, Double lat){
        this.lng=lng;
        this.lat=lat;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
