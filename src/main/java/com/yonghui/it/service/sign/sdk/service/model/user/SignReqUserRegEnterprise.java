package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignReqUserRegEnterprise {
    /**
     * 用户名称 必须和证件上登记的姓名一致
     */
    private String name;
    /**
     * 用户类型 2表示企业
     */
    private Integer userType;
    /**
     * 用户邮箱
     */
    private String mail;
    /**
     * 用户手机号
     */
    private String mobile;
    /**
     * 是否申请证书 申请填写为1
     */
    private Integer applyCert;
    private CredentialEnterprise credential;
    public SignReqUserRegEnterprise(String name){
        this.name=name;
        this.userType=2;
        this.applyCert=1;
    }


    public String getName() {
        return name;
    }

    public Integer getUserType() {
        return userType;
    }

    public String getMail() {
        return mail;
    }

    public SignReqUserRegEnterprise setMail(String mail) {
        this.mail = mail;
        return  this;
    }

    public String getMobile() {
        return mobile;
    }

    public SignReqUserRegEnterprise setMobile(String mobile) {
        this.mobile = mobile;
        return  this;
    }

    public Integer getApplyCert() {
        return applyCert;
    }

    public SignReqUserRegEnterprise setApplyCert(Integer applyCert) {
        this.applyCert = applyCert;
        return  this;
    }

    public CredentialEnterprise getCredential() {
        return credential;
    }

    public SignReqUserRegEnterprise setCredential(CredentialEnterprise credential) {
        this.credential = credential;
        return  this;
    }
}
