package com.yonghui.it.service.sign.sdk.service;

import com.yonghui.it.service.file.ItReqImage;
import com.yonghui.it.service.sign.sdk.exception.SignException;
import com.yonghui.it.service.sign.sdk.service.impl.MethodRequest;
import com.yonghui.it.service.sign.sdk.service.impl.ResponseVo;

import java.util.Map;

public interface HttpCommonService {
    ResponseVo request(String url, String body, Map<String,String> header,
                       MethodRequest methodRequest) throws SignException;

    ResponseVo uploadFile(String url, Map<String, String> header, byte[] fileData, String orgFileName);

    ResponseVo postFile(String url, String apiKey, byte[] fileData, String orgFileName);
    ResponseVo uploadImage(String url, String apiKey, ItReqImage image);
}
