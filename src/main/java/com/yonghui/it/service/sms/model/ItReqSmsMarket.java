package com.yonghui.it.service.sms.model;

import java.util.List;

public class ItReqSmsMarket {
     private String sign;
     private List<SmsDetail> smsList;


     public ItReqSmsMarket(List<SmsDetail> smsList){
         this.smsList=smsList;
         this.sign="永辉超市";

     }
    public String getSign() {
        return sign;
    }

    public ItReqSmsMarket setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public List<SmsDetail> getSmsList() {
        return smsList;
    }


}
