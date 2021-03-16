package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignVoPersonalIdentity2 {
    private String msg;
    private Integer result;
    private EnumAuthResultStatus enumAuthResultStatus;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
}
