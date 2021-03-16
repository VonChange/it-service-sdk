package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.util.Base64Util;

public class SignReqContractImagePosition {
    /**
     * pdf文件数据 base64后的数据
     */
    private String pdfData;
    /**
     * 模版文本域名
     */
    private String fieldName;
    public SignReqContractImagePosition(byte[] pdfData,String fieldName){
        this.pdfData= Base64Util.toBase64(pdfData);
        this.fieldName=fieldName;
    }
    public String getPdfData() {
        return pdfData;
    }

    public String getFieldName() {
        return fieldName;
    }
}
