package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignReqUserRegPerson {
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
     * 是否申请证书 申请填写为1
     */
    private Integer applyCert;
    private CredentialPerson credential;

    public SignReqUserRegPerson(String name){
        this.name=name;
        this.userType=1;
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

    public SignReqUserRegPerson setMail(String mail) {
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
    public SignReqUserRegPerson setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Integer getApplyCert() {
        return applyCert;
    }

    public SignReqUserRegPerson setApplyCert(Integer applyCert) {
        this.applyCert = applyCert;
        return this;
    }

    public CredentialPerson getCredential() {
        return credential;
    }

    public SignReqUserRegPerson setCredential(CredentialPerson credential) {
        this.credential = credential;
        return this;
    }
}
