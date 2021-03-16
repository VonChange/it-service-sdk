package com.yonghui.it.service.map.model;


public class ReqGeocoderAddress {
    private String address;
    private String region;
    public ReqGeocoderAddress(String address){
        this.address=address;
    }
    public String getAddress() {
        return address;
    }


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
