package com.yonghui.it.service.sign.sdk.service.model.user;


public class SignVoUserApplyCertStatus {
    /**
     * 状态描述
     */
    private String message;
    private EnumApplyCertStatus enumApplyCertStatus;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EnumApplyCertStatus getStatusEnum() {
        return enumApplyCertStatus;
    }

    public void setStatus(Integer status) {
        this.enumApplyCertStatus = EnumApplyCertStatus.getStatus(status);
    }


}
