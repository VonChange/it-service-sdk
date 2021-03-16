package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.util.DateUtil;

import java.util.Date;

public class SignReqContractPreviewURL {
    /**
     * 合同ID
     */
     private String contractId;
    /**
     * 指定预览的签署者ID
     */
     private String account;
    /**
     * 预览图片清晰度，枚举值：96-低清（默认），120-普清，160-高清，240-超清
     */
     private Integer dpi;
    /**
     * 预览链接的过期时间，unix时间戳。格式为秒级的unix时间戳，
     * 如希望“2017/12/30 10 21 52”到期，则设置为“1514600512”。
     * 超过此时间则无法预览合同，需要获取新的预览合同url。
     * 注：并不是合同的可签署到期时间，只是此预览链接的有效期。
     */
    private Long expireTime;
     public SignReqContractPreviewURL(String contractId,String account){
         this.contractId=contractId;
         this.account=account;
     }


    public SignReqContractPreviewURL setDpi(EnumDpi enumDpi) {
        this.dpi = enumDpi.getValue();
        return this;
    }

    public SignReqContractPreviewURL setExpireTime(Date expireTime) {
        this.expireTime = DateUtil.getUnixTime(expireTime);
        return this;
    }

    public String getContractId() {
        return contractId;
    }

    public String getAccount() {
        return account;
    }

    public Integer getDpi() {
        return dpi;
    }

    public Long getExpireTime() {
        return expireTime;
    }



}
