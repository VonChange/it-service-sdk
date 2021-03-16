package com.yonghui.it.service.sms.model;

public class ItReqSmsVoiceNotify {
     private String[] phoneNumbers;
     private String content;
     private String customId;


     public ItReqSmsVoiceNotify(String[] phoneNumbers, String content){
         this.phoneNumbers=phoneNumbers;
         this.content=content;
     }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }



    public String getContent() {
        return content;
    }



    public String getCustomId() {
        return customId;
    }

    public ItReqSmsVoiceNotify setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
}
