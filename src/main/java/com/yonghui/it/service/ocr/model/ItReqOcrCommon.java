package com.yonghui.it.service.ocr.model;

import com.yonghui.it.service.annotion.SDKProperty;
import com.yonghui.it.service.sign.sdk.util.Base64Util;

public class ItReqOcrCommon {
    @SDKProperty(value = "图片的 Url 地址。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。\n" +
            "建议图片存储于腾讯云，可保障更高的下载速度和稳定性。",optional = true)
    private String imageUrl;
    @SDKProperty(value = "图片的 Base64 值。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。\n" +
            "图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。",optional = true)
    private String imageBase64;

    public String getImageUrl() {
        return imageUrl;
    }

    public ItReqOcrCommon setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public ItReqOcrCommon setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public ItReqOcrCommon setImageData(byte[] imageBase64) {
        this.imageBase64 = Base64Util.toBase64(imageBase64);
        return this;
    }



}
