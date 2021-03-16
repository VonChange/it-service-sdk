package com.yonghui.it.service.sign.sdk.service.impl;

import com.yonghui.it.service.file.ItReqImage;
import com.yonghui.it.service.sign.sdk.exception.SignException;
import com.yonghui.it.service.sign.sdk.service.HttpCommonService;
import com.yonghui.it.service.sign.sdk.util.BeanMapUtil;
import com.yonghui.it.service.sign.sdk.util.HttpRequest;
import com.yonghui.it.service.sign.sdk.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

public class HttpRequestServiceImpl implements HttpCommonService {
    private static final Logger log = LoggerFactory.getLogger(HttpRequestServiceImpl.class);

    @Override
    public ResponseVo request(String url, String body, Map<String, String> header, MethodRequest methodRequest) throws SignException {
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(false);
        responseVo.setType(0);
        HttpRequest request = null;
        log.info("request utl {}",url);
        if(methodRequest.equals(MethodRequest.GET)){
            request = HttpRequest
                    .get(url);
        }
        if(methodRequest.equals(MethodRequest.POST)){
            request = HttpRequest
                    .post(url);
        }
        if(null==request){
            responseVo.setError(true);
            responseVo.setErrMsg("不支持的请求方法");
            return responseVo;
        }
        //request.trustAllCerts().trustAllHosts().connectTimeout(60000).readTimeout(60000);

        for (Map.Entry<String,String> entry: header.entrySet()) {
            request.header(entry.getKey(),entry.getValue());
        }
        if(!StringUtil.isBlank(body)){
            log.info("request body x {}",body);
            request.send(body.getBytes());
        }
        String contentType = request.contentType();
        log.debug("contentType {}",contentType);
        if(request.code()!=200){
            responseVo.setError(true);
            responseVo.setErrMsg("请求出错 返回"+request.code());
            String responseBody = request.body();
            log.error("请求出错 返回 {} response {}",request.code(),responseBody);
            return responseVo;
        }
        if(StringUtil.isBlank(contentType)){
            responseVo.setError(true);
            responseVo.setErrMsg("请求出错 contentType为空");
            return responseVo;
        }
        if(contentType.startsWith("application/json")){
            String responseBody = request.body();
            log.info("response: {}",responseBody);
            responseVo.setBodyResponse(responseBody);
            responseVo.setType(0);
            return responseVo;
        }
        responseVo.setBodyBytes(request.bytes());
        responseVo.setType(1);
        return responseVo;
    }
    @Override
    public ResponseVo uploadFile(String url, Map<String, String> header, byte[] fileData, String orgFileName) {
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(true);
        responseVo.setType(0);
        HttpRequest httpRequest =  HttpRequest.post(url);
        for (Map.Entry<String,String> entry: header.entrySet()) {
            httpRequest.header(entry.getKey(),entry.getValue());
        }
        httpRequest.contentType("multipart/form-data")
                .part("file",orgFileName,null,new ByteArrayInputStream(fileData)).send("");
        if(httpRequest.code()==200){
            responseVo.setError(false);
            responseVo.setBodyResponse(httpRequest.body());
            return responseVo;
        }
        responseVo.setBodyResponse(httpRequest.body());
        return responseVo;
    }
    @Override
    public ResponseVo postFile(String url, String apiKey, byte[] fileData, String orgFileName) {
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(true);
        responseVo.setType(0);
        HttpRequest httpRequest =  HttpRequest.post(url)
                .header("Api-Key",apiKey).contentType("multipart/form-data")
                .part("file",orgFileName,null,new ByteArrayInputStream(fileData)).send("");
        if(httpRequest.code()==200){
            responseVo.setError(false);
            responseVo.setBodyResponse(httpRequest.body());
            return responseVo;
        }
        responseVo.setBodyResponse(httpRequest.body());
        return responseVo;
    }

    @Override
    public ResponseVo uploadImage(String url, String apiKey, ItReqImage image) {
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(true);
        responseVo.setType(0);
        Map<String,String> map = BeanMapUtil.BeanToMapString(image);
        Map<String,String> mapNew= new HashMap<>();
        for (Map.Entry<String,String> entry: map.entrySet()) {
            if(entry.getKey().equals("file")||entry.getKey().equals("fileName")||entry.getKey().equals("logo")||entry.getKey().equals("logoName")){
                continue;
            }
            if(null==entry.getValue()){
                continue;
            }
            mapNew.put(entry.getKey(),entry.getValue());
        }
        HttpRequest httpRequest =  HttpRequest.post(url)

                .header("Api-Key",apiKey).contentType("multipart/form-data")
                .part("file",image.getFileName(),null,new ByteArrayInputStream(image.getFile()));
        if(null!=image.getLogo()){
            httpRequest.part("logo",image.getLogoName(),null,new ByteArrayInputStream(image.getLogo()));
        }
        for (Map.Entry<String,String> entry: mapNew.entrySet()) {
            httpRequest.part(entry.getKey(),entry.getValue());
        }

        httpRequest.send("");
        if(httpRequest.code()==200){
            responseVo.setError(false);
            responseVo.setBodyResponse(httpRequest.body());
            return responseVo;
        }
        responseVo.setBodyResponse(httpRequest.body());
        return responseVo;
    }

}
