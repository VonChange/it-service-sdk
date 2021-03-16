package com.yonghui.it.service.sms.model;

public class ItReqSmsVoice {
     private String phoneNumber;
     private String content;
     private String customId;


     public ItReqSmsVoice(String phoneNumber, String content){
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

    public ItReqSmsVoice setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
}
