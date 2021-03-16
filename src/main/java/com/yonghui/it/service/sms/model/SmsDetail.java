package com.yonghui.it.service.sms.model;

public class SmsDetail {
    private String phoneNumber;
    private String content;
    private String customId;
    public SmsDetail(String phoneNumber,String content){
        this.phoneNumber=phoneNumber;
        this.content=content;

    }
    public String getPhoneNumber() {
        return phoneNumber;
    }



    public String getContent() {
        return content;
    }


    public String getCustomId() {
        return customId;
    }

    public SmsDetail setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
}
