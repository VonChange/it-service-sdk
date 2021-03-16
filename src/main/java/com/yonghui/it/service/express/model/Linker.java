package com.yonghui.it.service.express.model;

/**
 * 发送接受方
 */

public class Linker {
    private String company;
    private String name;
    private String tel;
    private String mobile;
    private String postCode;
    private String provinceName;
    private String cityName;
    private String expAreaName;
    private String address;

    public Linker( String name, String tel, String mobile, String provinceName, String cityName, String expAreaName, String address) {
        this.name = name;
        this.tel = tel;
        this.mobile = mobile;
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.expAreaName = expAreaName;
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public Linker setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getName() {
        return name;
    }



    public String getTel() {
        return tel;
    }


    public String getMobile() {
        return mobile;
    }


    public String getPostCode() {
        return postCode;
    }

    public Linker setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public String getProvinceName() {
        return provinceName;
    }



    public String getCityName() {
        return cityName;
    }



    public String getExpAreaName() {
        return expAreaName;
    }



    public String getAddress() {
        return address;
    }

}
