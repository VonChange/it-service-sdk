package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.util.*;

import java.util.Date;

public class SignReqContractUpload {
    /**
     * 签署者账号
     */
    private String account;
    /**
     * default: pdf
     * 文件类型 仅支持PDF
     */
    private String ftype;
    /**
     * 文件名 文件名必须带上后缀名，例如“XXXX.pdf”
     */
    private String fname;
    /**
     * 文件数据，base64编码
     */
    private String fdata;
    /**
     * 合同标题 客户可以将自己的业务合同编号、或合同标题放此处
     */
    private String title;
    /**
     * 合同能够签署的截止时间
     * 合同必须在指定的截止时间之前完成签署，一旦过期则此合同将无法被签署。
     * 格式为秒级的unix时间戳，如希望“2017/12/30 10:20:52”到期，则设置为“1514600512”
     */
    private String expireTime;
    /**
     * 合同描述
     */
    private String description;
    /**
     * 热存周期
     * 此参数是合同文件在热存储中保留的时间长度，单位为秒。
     * 保存在热存储中的合同数据，自合同结束时间算起，
     * 超过此此参数设定时长的合同文件，会转移到冷存储中。
     * 计算示例：如保存365天，则值为360024365=31536000。
     * 参数可为空，为空时默认值为1年（31536000）。取值范围为3600（1小时）~157680000（5年）
     */
    private String hotStoragePeriod;
    public SignReqContractUpload(String account,String title,String fname,byte[] fileData, Date expireTime){
        this.account=account;
        this.ftype = "pdf";
        this.fname=fname;
        this.title=title;
        this.fdata= Base64Util.toBase64(fileData);
        this.expireTime= ConvertUtil.toString(DateUtil.getUnixTime(expireTime));
    }

    public SignReqContractUpload setDescription(String description) {
        this.description = description;
        return this;
    }

    public SignReqContractUpload setHotStoragePeriod(String hotStoragePeriod) {
        this.hotStoragePeriod = hotStoragePeriod;
        return  this;
    }

    public String getAccount() {
        return account;
    }

    public String getFtype() {
        return ftype;
    }


    public String getFname() {
        return fname;
    }

    public String getFdata() {
        return fdata;
    }

    public String getTitle() {
        return title;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public String getDescription() {
        return description;
    }

    public String getHotStoragePeriod() {
        return hotStoragePeriod;
    }
}
