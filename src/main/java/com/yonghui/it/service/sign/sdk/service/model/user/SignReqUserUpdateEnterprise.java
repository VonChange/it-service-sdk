package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignReqUserUpdateEnterprise {
    /**
     * 用户名称 必须和证件上登记的姓名一致
     */
    private String name;
    /**
     * 需要更新的账户ID
     */
    private String account;
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
    public SignReqUserUpdateEnterprise(String account,String name){
        this.account=account;
        this.name=name;
        this.userType=2;
        this.applyCert=1;
    }

    public String getAccount() {
        return account;
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

    public SignReqUserUpdateEnterprise setMail(String mail) {
        this.mail = mail;
        return  this;
    }

    public String getMobile() {
        return mobile;
    }

    public SignReqUserUpdateEnterprise setMobile(String mobile) {
        this.mobile = mobile;
        return  this;
    }

    public Integer getApplyCert() {
        return applyCert;
    }

    public SignReqUserUpdateEnterprise setApplyCert(Integer applyCert) {
        this.applyCert = applyCert;
        return  this;
    }

    public CredentialEnterprise getCredential() {
        return credential;
    }

    public SignReqUserUpdateEnterprise setCredential(CredentialEnterprise credential) {
        this.credential = credential;
        return  this;
    }
}
