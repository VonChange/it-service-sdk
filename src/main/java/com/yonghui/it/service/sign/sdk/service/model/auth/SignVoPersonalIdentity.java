package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignVoPersonalIdentity {
    private String personalIdentity3Key;
    private Integer result;
    private EnumAuthResultStatus enumAuthResultStatus;
    private String msg;
    public String getPersonalIdentity3Key() {
        return personalIdentity3Key;
    }

    public void setPersonalIdentity3Key(String personalIdentity3Key) {
        this.personalIdentity3Key = personalIdentity3Key;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
        this.enumAuthResultStatus=EnumAuthResultStatus.getValue(result);
    }

    public EnumAuthResultStatus getEnumAuthResultStatus() {
        return enumAuthResultStatus;
    }

    public void setEnumAuthResultStatus(EnumAuthResultStatus enumAuthResultStatus) {
        this.enumAuthResultStatus = enumAuthResultStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
