package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignVoUserUploadSign {
    /**
     * 签署者ID
     */
    private String account;
    /**
     * 签章名
     */
    private String imageName;

    public String getAccount() {
        return account;
    }

    public SignVoUserUploadSign setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getImageName() {
        return imageName;
    }

    public SignVoUserUploadSign setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
}
