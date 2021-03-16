package com.yonghui.it.service.map.model;


public class ItReqGeocoder {
    /**
     * 纬度
     */
    private Double lat;
    /**
     * 经度
     */
    private Double lng;

    public ItReqGeocoder(Double lng, Double lat){
        this.lng=lng;
        this.lat=lat;
    }

    public Double getLat() {
        return lat;
    }


    public Double getLng() {
        return lng;
    }


}