package com.yonghui.it.service.map.model;

public class VoGeocoderAddress {

    private String title;

    private AdressInfoBase addressInfo;
    private Location location;
    private AddressComponents addressComponents;
    private Integer deviation;
    private Integer reliability;
    private Integer level;
    private Double similarity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AdressInfoBase getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AdressInfoBase addressInfo) {
        this.addressInfo = addressInfo;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public AddressComponents getAddressComponents() {
        return addressComponents;
    }
    
    public void setAddressComponents(AddressComponents addressComponents) {
        this.addressComponents = addressComponents;
    }

    public Integer getDeviation() {
        return deviation;
    }

    public void setDeviation(Integer deviation) {
        this.deviation = deviation;
    }

    public Integer getReliability() {
        return reliability;
    }

    public void setReliability(Integer reliability) {
        this.reliability = reliability;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }
}
