package com.yonghui.it.service.ocr.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class ItReqOcrIDCard extends ItReqOcrCommon{
    @SDKProperty(value = "FRONT：身份证有照片的一面（人像面），\n" +
            "BACK：身份证有国徽的一面（国徽面），\n" +
            "该参数如果不填，将为您自动判断身份证正反面。",optional=true)
    private String cardSide;

    private String config;

    public String getCardSide() {
        return cardSide;
    }

    public ItReqOcrIDCard setCardSide(String cardSide) {
        this.cardSide = cardSide;
        return this;
    }

    public ItReqOcrIDCard setCardSiteEnum(EnumCardSide enumCardSide){
        this.cardSide=enumCardSide.getValue();
        return this;
    }

    public String getConfig() {
        return config;
    }

    public ItReqOcrIDCard setConfig(String config) {
        this.config = config;
        return this;
    }
    public ItReqOcrIDCard setImageBase64(String imageBase64) {
        super.setImageBase64(imageBase64);
        return this;
    }
    public ItReqOcrIDCard setImageData(byte[] imageData) {
        super.setImageData(imageData);
        return this;
    }

    public ItReqOcrIDCard setImageUrl(String imageUrl) {
        super.setImageUrl(imageUrl);
        return this;
    }


}
