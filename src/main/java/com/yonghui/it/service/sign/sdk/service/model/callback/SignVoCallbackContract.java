package com.yonghui.it.service.sign.sdk.service.model.callback;


public class SignVoCallbackContract {
    /**
     * 合同ID
     */
    private String contractId;
    /**
     * 签署方ID
     */
    private String account;
    /**
     * （1：正在进行中；2：已完成；3：已拒绝并取消；）
     */
    private Integer signerStatus;
    private EnumSignerCallbackStatus enumSignerCallbackStatus;
    /**
     * 签署成功为success，签署失败为相应的错误信息
     */
    private String errMsg;
    /**
     * 业务流水号，如果在send接口中提交了则会返回，没提交则不返回
     */
    private String sid;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getSignerStatus() {
        return signerStatus;
    }

    public void setSignerStatus(Integer signerStatus) {
        this.signerStatus = signerStatus;
        this.enumSignerCallbackStatus=EnumSignerCallbackStatus.getValue(signerStatus);
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public EnumSignerCallbackStatus getEnumSignerCallbackStatus() {
        return enumSignerCallbackStatus;
    }
}
