package com.yonghui.it.service.sign.sdk.service.model.callback;


import com.yonghui.it.service.sign.sdk.service.model.user.EnumApplyCertStatus;

public class SignVoCallbackCertApply {
    /**
     * 证书类型
     */
    private String certType;
    /**
     * 证书编号
     */
    private String cert;
    private String message;
    private String account;
    /**
     * 异步申请队列的序号
     */
    private String taskId;
    private Integer status;
    private EnumApplyCertStatus enumApplyCertStatus;

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        this.enumApplyCertStatus=EnumApplyCertStatus.getStatus(status);
    }

    public EnumApplyCertStatus getEnumApplyCertStatus() {
        return enumApplyCertStatus;
    }
}
