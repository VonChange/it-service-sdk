package com.yonghui.it.service.sms.model;

public class ItReqSmsIndustrial {
     private String sign;
     private String phoneNumber;
     private String content;
     private String customId;


     public ItReqSmsIndustrial(String phoneNumber,String content){
         this.phoneNumber=phoneNumber;
         this.content=content;
         this.sign="永辉超市";
     }
    public String getSign() {
        return sign;
    }

    public ItReqSmsIndustrial setSign(String sign) {
        this.sign = sign;
        return this;
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

    public ItReqSmsIndustrial setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
}
