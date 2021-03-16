package com.yonghui.it.service.sign.sdk.service.model.user;

/**
 * 用户证件信息对象
 * 企业证件信息对象，json格式
 * 三证合一的统一社会信用代码这样传：
 * regcode = “统一社会信用代码” orgcode = “统一社会信用代码” taxcode = “统一社会信用代码”
 * 老三证这样传：
 * regcode = “工商注册号” orgcode = “组织机构代码证” taxcode = “税务登记证”
 * 个体户这样传： regcode = “工商注册号” orgcode = “” taxcode = “”
 */
public class CredentialEnterprise {
    /**
     * 工商注册号
     */
    private String regCode;
    /**
     *组织机构代码 企业用户设置regCode和orgCode必须输入一个
     */
    private String orgCode;
    /**
     * 税务登记证号
     */
    private String taxCode;
    /**
     * 法人代表或经办人姓名
     */
    private String legalPerson;
    /**
     * 法人代表或经办人证件号
     */
    private String legalPersonIdentity;
    /**
     * 法人代表或经办人证件类型
     * 法人代表证件类型或经办人证件类型，与“legalPersonIdentity”要匹配，默认为“0”。
     * 0-居民身份证
     * 1-护照
     * B-港澳居民往来内地通行证
     * C-台湾居民来往大陆通行证
     * E-户口簿
     * F-临时居民身份证
     */
    private Integer legalPersonIdentityType;
    /**
     * 法人代表或经办人手机号
     */
    private String legalPersonMobile;
    /**
     * 联系邮箱
     */
    private String contactMail;
    /**
     * 联系手机必填，为CA年检抽查时联系使用
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
    public CredentialEnterprise(String regCode,String orgCode,String taxCode
            ,String legalPerson,String legalPersonIdentity,String contactMobile){
        this.regCode=regCode;
        this.orgCode=orgCode;
        this.taxCode=taxCode;
        this.legalPerson=legalPerson;
        this.contactMobile=contactMobile;
        this.legalPersonIdentity = legalPersonIdentity;
        this.legalPersonIdentityType=0;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getLegalPersonIdentity() {
        return legalPersonIdentity;
    }

    public String getOrgCode() {
        return orgCode;
    }



    public String getTaxCode() {
        return taxCode;
    }



    public String getLegalPerson() {
        return legalPerson;
    }



    public Integer getLegalPersonIdentityType() {
        return legalPersonIdentityType;
    }

    public CredentialEnterprise setLegalPersonIdentityType(Integer legalPersonIdentityType) {
        this.legalPersonIdentityType = legalPersonIdentityType;
        return this;
    }

    public String getLegalPersonMobile() {
        return legalPersonMobile;
    }

    public CredentialEnterprise setLegalPersonMobile(String legalPersonMobile) {
        this.legalPersonMobile = legalPersonMobile;
        return  this;
    }

    public String getContactMail() {
        return contactMail;
    }

    public CredentialEnterprise setContactMail(String contactMail) {
        this.contactMail = contactMail;
        return  this;
    }

    public String getContactMobile() {
        return contactMobile;
    }


    public String getProvince() {
        return province;
    }

    public CredentialEnterprise setProvince(String province) {
        this.province = province;
        return  this;
    }

    public String getCity() {
        return city;
    }

    public CredentialEnterprise setCity(String city) {
        this.city = city;
        return  this;
    }

    public String getAddress() {
        return address;
    }

    public CredentialEnterprise setAddress(String address) {
        this.address = address;
        return  this;
    }
}
