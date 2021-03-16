package com.yonghui.it.service.map.model;

public class ItVoGeocoder {
    private String address;

    private String nationCode;
    private String adcode;
    private String cityCode;
    private String name;
    private String nation;
    private String province;
    private String city;
    private String district;
    private FormattedAddresses formattedAddresses;

    public FormattedAddresses getFormattedAddresses() {
        return formattedAddresses;
    }

    public void setFormattedAddresses(FormattedAddresses formattedAddresses) {
        this.formattedAddresses = formattedAddresses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
