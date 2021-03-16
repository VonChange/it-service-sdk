package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignReqPersonalIdentity {
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
    /**
     * 当前身份证证件信息办理的手机号码
     */
    private String mobile;
    public SignReqPersonalIdentity(String name,String identity,String mobile){
        this.name=name;
        this.identity=identity;
        this.identityType=0;
        this.mobile= mobile;
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

    public String getMobile() {
        return mobile;
    }
}
