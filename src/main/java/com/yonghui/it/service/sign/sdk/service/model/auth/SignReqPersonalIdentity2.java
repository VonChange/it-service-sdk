package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignReqPersonalIdentity2 {
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String identity;
    /**
     * 暂时不支持非身份证类型的 默认0
     */
    private Integer identityType;
    public SignReqPersonalIdentity2(String name, String identity){
        this.name=name;
        this.identity=identity;
        this.identityType=0;
    }


    public String getName() {
        return name;
    }

    public String getIdentity() {
        return identity;
    }

    public Integer getIdentityType() {
        return identityType;
    }

}
