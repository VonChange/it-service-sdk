package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignReqUserAutoCreateSign {
    /**
     * 签署者ID
     */
    private String account;
    /**
     * 签章名
     */
    private String text;
    public SignReqUserAutoCreateSign(String account){
        this.account=account;
    }
    public String getAccount() {
        return account;
    }

    public String getText() {
        return text;
    }

    public SignReqUserAutoCreateSign setText(String text) {
        this.text = text;
        return this;
    }
}
