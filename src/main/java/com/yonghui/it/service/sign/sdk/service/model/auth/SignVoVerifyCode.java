package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignVoVerifyCode {
    /**
     * 1 表示验证通过，“0”表示验证不通过
     */
    private Integer result;
    private String msg;
    private EnumAuthResultStatus enumAuthResultStatus;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
        this.enumAuthResultStatus=EnumAuthResultStatus.getValue(result);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public EnumAuthResultStatus getEnumAuthResultStatus() {
        return enumAuthResultStatus;
    }

    public void setEnumAuthResultStatus(EnumAuthResultStatus enumAuthResultStatus) {
        this.enumAuthResultStatus = enumAuthResultStatus;
    }
}
