package com.yonghui.it.service.sign.sdk.service.model.user;

import com.yonghui.it.service.sign.sdk.util.Base64Util;

public class SignReqUserUploadSign {
    /**
     * 签署方Id
     */
    private String account;
    /**
     * 图片文件内容 图片经Base64编码后的字符串
     */
    private String imageData;
    /**
     * 签名/印章图片名称
     * 传空或default表示更新默认的签名/印章图片。
     * 企业用户如果有多个印章，可以指定印章名称，签署时用指定的印章名称
     */
    private String imageName;
    public SignReqUserUploadSign(String account,byte[] imageData){
        this.imageData= Base64Util.toBase64(imageData);
        this.account=account;
        this.imageName=EnumImageName.defaultImage.getValue();
    }

    public SignReqUserUploadSign setImageName(EnumImageName enumImageName) {
        this.imageName = enumImageName.getValue();
        return this;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    public String getAccount() {
        return account;
    }

    public String getImageData() {
        return imageData;
    }

    public String getImageName() {
        return imageName;
    }


}
