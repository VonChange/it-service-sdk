package com.yonghui.it.service.sign.sdk.service.model.user;

/**
 * 个人用户证件信息对象
 */
public class CredentialPerson {
    /**
     * 用户证件号 必须和证件上登记的号码一致
     */
    private String identity;
    /**
     * 用户证件类型 默认为“0”, 0-居民身份证 1-护照 B-港澳居民往来内地通行证
     * C-台湾居民来往大陆通行证
     * E-户口簿
     * F-临时居民身份证
     */
    private String identityType;
    /**
     * 联系手机
     */
    private String contactMobile;
    /**
     * 联系邮箱
     */
    private String contactMail;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 地址
     */
    private String address;
    public CredentialPerson(String identity){
        this.identity=identity;
    }
    public String getIdentity() {
        return identity;
    }



    public String getIdentityType() {
        return identityType;
    }

    public CredentialPerson setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public CredentialPerson setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }

    public String getContactMail() {
        return contactMail;
    }

    public CredentialPerson setContactMail(String contactMail) {
        this.contactMail = contactMail;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public CredentialPerson setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CredentialPerson setCity(String city) {
        this.city = city;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CredentialPerson setAddress(String address) {
        this.address = address;
        return this;
    }
}
