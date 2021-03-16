package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignVoEnterpriseCredential {
    /**
     * 签署方ID
     */
    private String account;
    /**
     * 工商注册号
     */
    private String regCode;
    /**
     * 税务登记号
     */
    private String taxCode;
    /**
     * 组织机构代码
     */
    private String name;
    /**
     * 法人代表
     */
    private String legalPerson;
    /**
     * 法人代表证件号
     */
    private String legalPersonIdentity;
    /**
     * 法人代表证件类型。默认为“0”, "0"表示身份证
     */
    private String legalPersonIdentityType;
    /**
     * 法人代表手机号
     */
    private String legalPersonMobile;
    /**
     * 联系邮箱
     */
    private String contactMail;
    /**
     * 联系手机
     */
    private String contactMobile;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonIdentity() {
        return legalPersonIdentity;
    }

    public void setLegalPersonIdentity(String legalPersonIdentity) {
        this.legalPersonIdentity = legalPersonIdentity;
    }

    public String getLegalPersonIdentityType() {
        return legalPersonIdentityType;
    }

    public void setLegalPersonIdentityType(String legalPersonIdentityType) {
        this.legalPersonIdentityType = legalPersonIdentityType;
    }

    public String getLegalPersonMobile() {
        return legalPersonMobile;
    }

    public void setLegalPersonMobile(String legalPersonMobile) {
        this.legalPersonMobile = legalPersonMobile;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
