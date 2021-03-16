package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.util.Base64Util;

import java.util.Map;


public class SignReqContractTemplate {
    /**
     * pdf数据 base64后文件数据
     */
    private String pdfData;
    /**
     * 文本域名为key 值为数据 如果是图片文本域名为ImageQ结尾
     */
    private Map<String, Object> data;

    /**
     * pdf模版构造函数
     * @param pdfData pdf数据 base64后文件数据
     * @param data 文本域名为key 值为数据 如果是图片文本域名为ImageQ结尾
     */
    public SignReqContractTemplate(byte[] pdfData,Map<String, Object> data){
        this.data=data;
        this.pdfData= Base64Util.toBase64(pdfData);
    }
    public String getPdfData() {
        return pdfData;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
