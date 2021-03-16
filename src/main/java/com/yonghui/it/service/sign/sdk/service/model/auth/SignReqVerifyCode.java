package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignReqVerifyCode {
    /**
     * 手机验证码
     */
    private String vcode;
    /**
     * 认证接口返回的验证key
     */
    private String personalIdentity3Key;
    public SignReqVerifyCode(String personalIdentity3Key,String vcode){
        this.vcode=vcode;
        this.personalIdentity3Key=personalIdentity3Key;
    }

    public String getVcode() {
        return vcode;
    }



    public String getPersonalIdentity3Key() {
        return personalIdentity3Key;
    }

}
