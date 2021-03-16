package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignVoEnterpriseIdentity {
    /**
     * 1 表示验证通过，“0”表示验证不通过
     */
    private Integer result;
    private EnumAuthResultStatus enumAuthResultStatus;
    private String msg;

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
