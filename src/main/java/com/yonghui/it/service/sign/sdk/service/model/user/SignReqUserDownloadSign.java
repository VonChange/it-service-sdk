package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignReqUserDownloadSign {
    /**
     * 签署者ID
     */
    private String account;
    /**
     * 签名/印章图片名称
     * 空字符串和default都表示默认的签名/印章图片。
     * 企业用户如需下载自定义印章则此处填写上传时指定的印章名称
     */
    private String imageName;
    public SignReqUserDownloadSign(String account){
        this.account=account;
        imageName=EnumImageName.defaultImage.getValue();
    }

    public SignReqUserDownloadSign setImageName(EnumImageName enumImageName) {
        this.imageName = enumImageName.getValue();
        return this;
    }
    public String getAccount() {
        return account;
    }

    public String getImageName() {
        return imageName;
    }
}
