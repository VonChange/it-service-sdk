package com.yonghui.it.service.sign.sdk.service.model.user;

/**
 * 用户账户请求
 */
public class SignReqUser {
    /**
     * 某个签署方ID
     */
    private String account;

    /**
     * 用户账户请求体
     * @param account 某个签署方ID
     */
    public SignReqUser(String account){
        this.account = account;
    }
    public String getAccount() {
        return account;
    }

}
