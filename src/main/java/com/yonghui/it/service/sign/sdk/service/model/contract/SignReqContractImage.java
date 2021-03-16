package com.yonghui.it.service.sign.sdk.service.model.contract;

public class SignReqContractImage {
    /**
     * 合同ID
     */
    private String contractId;
    /**
     * 图片页数 默认1
     */
    private Integer pageNum;
    /**
     * 图片质量 默认100
     */
    private Integer quailty;
    public SignReqContractImage(String contractId) {
        this.contractId = contractId;
    }
    public String getContractId() {
        return contractId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public SignReqContractImage setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getQuailty() {
        return quailty;
    }

    public SignReqContractImage setQuailty(Integer quailty) {
        this.quailty = quailty;
        return this;
    }
}
