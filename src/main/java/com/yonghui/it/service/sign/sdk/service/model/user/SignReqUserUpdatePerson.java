package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignReqUserUpdatePerson {
    /**
     * 需要更新的账户ID
     */
    private String account;
    /**
     * 用户名称 必须和证件上登记的姓名一致
     */
    private String name;
    /**
     * 用户类型 1表示个人
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
     * 用户类型 1表示个人
     */
    private Integer applyCert;
    private CredentialPerson credential;

    public SignReqUserUpdatePerson(String account,String name){
        this.account= account;
        this.name=name;
        this.userType=1;
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

    public SignReqUserUpdatePerson setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    /**
     * 签署方手机号
     * @param mobile
     * @return
     */
    public SignReqUserUpdatePerson setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Integer getApplyCert() {
        return applyCert;
    }

    public SignReqUserUpdatePerson setApplyCert(Integer applyCert) {
        this.applyCert = applyCert;
        return this;
    }

    public CredentialPerson getCredential() {
        return credential;
    }

    public SignReqUserUpdatePerson setCredential(CredentialPerson credential) {
        this.credential = credential;
        return this;
    }
}
