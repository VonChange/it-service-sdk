package com.yonghui.it.service.sign.sdk.service.impl;

public class ResponseVo {
    private String errMsg;
    private Boolean error;
    private String bodyResponse;
    private byte[] bodyBytes;
    private Integer type;


    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getBodyResponse() {
        return bodyResponse;
    }

    public void setBodyResponse(String bodyResponse) {
        this.bodyResponse = bodyResponse;
    }

    public byte[] getBodyBytes() {
        return bodyBytes;
    }

    public void setBodyBytes(byte[] bodyBytes) {
        this.bodyBytes = bodyBytes;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
