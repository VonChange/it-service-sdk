package com.yonghui.it.service.sign.sdk.service.model.contract;

public class SignReqContract {
    /**
     * 合同ID
     */
    private String contractId;
    public SignReqContract(String contractId) {
        this.contractId = contractId;
    }
    public String getContractId() {
        return contractId;
    }


}
