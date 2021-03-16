package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.util.ConvertUtil;
import com.yonghui.it.service.sign.sdk.util.DateUtil;

import java.util.Date;

public class SignReqDelayExpireTime {
    private String[] contractIds;
    private String expireTime;

    public SignReqDelayExpireTime(String[] contractIds, Date expireTime) {
        this.contractIds = contractIds;
        this.expireTime = ConvertUtil.toString(DateUtil.getUnixTime(expireTime));
    }

    public SignReqDelayExpireTime setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String[] getContractIds() {
        return contractIds;
    }

    public String getExpireTime() {
        return expireTime;
    }
}
