package com.yonghui.it.service.sign.sdk.service.impl;

import com.yonghui.it.service.file.ItReqImage;
import com.yonghui.it.service.sign.sdk.exception.SignException;
import com.yonghui.it.service.sign.sdk.service.HttpCommonService;
import com.yonghui.it.service.sign.sdk.util.BeanMapUtil;
import com.yonghui.it.service.sign.sdk.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class HttpRestTemplateServiceImpl implements HttpCommonService {
    private static final Logger log = LoggerFactory.getLogger(HttpRestTemplateServiceImpl.class);
    protected abstract RestTemplate initRestTemplate();

    public ResponseVo request(String url, String body, Map<String,String> header,
                              MethodRequest methodRequest) throws SignException {
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(false);
        responseVo.setType(0);
        log.info("request url {}",url);
        URI uri = genURI(url);
        if(!StringUtil.isBlank(body)){
            log.info("request body {}",body);
        }
        HttpEntity<String> httpEntity= intHeaderInfo(body, header);

        ResponseEntity<byte[]> responseEntity = initRestTemplate().exchange(uri,
                getHttpMethod(methodRequest.name()),
                httpEntity, byte[].class);

        if(!responseEntity.getStatusCode().equals(HttpStatus.OK)){
            responseVo.setError(true);
            responseVo.setErrMsg("请求出错 返回"+responseEntity.getStatusCode().value());
            log.error("请求出错 返回 {} response {}",responseEntity.getStatusCode(),responseEntity.getBody());
            return responseVo;
        }
        HttpHeaders httpHeaders=  responseEntity.getHeaders();
        List<String> contentTypeList= httpHeaders.get("Content-Type");
        if(null==contentTypeList||contentTypeList.size()==0){
            responseVo.setError(true);
            responseVo.setErrMsg("请求出错 contentType为空");
            return responseVo;
        }
        String contentType=contentTypeList.get(0);
        log.debug("contentType {}",contentType);
        if(contentType.startsWith("application/json")){
            String bodyStr=StringUtil.toString(responseEntity.getBody());
            log.info("response: {}",bodyStr);
            responseVo.setBodyResponse(bodyStr);
            responseVo.setType(0);
            return responseVo;
        }
        responseVo.setBodyBytes(responseEntity.getBody());
        responseVo.setType(1);
        return responseVo;
    }
    private static final Map<String, HttpMethod> mappings = new HashMap<>(16);
    static {
        for (HttpMethod httpMethod : HttpMethod.values()) {
            mappings.put(httpMethod.name(), httpMethod);
        }
    }
    private HttpMethod getHttpMethod(String method){
        return  mappings.get(method);

    }
    private HttpEntity<String> intHeaderInfo(String body,Map<String,String> header) throws SignException {
        HttpHeaders headers=new HttpHeaders();
        for (Map.Entry<String,String> entry: header.entrySet()) {
            headers.add(entry.getKey(),entry.getValue());
        }
        if(!StringUtil.isEmpty(body)){
            return  new HttpEntity<>(body,headers);
        }
        return new HttpEntity<>(headers);
    }
    private   URI genURI(String url) throws SignException {
        try {
            return new URI(url);
        } catch (URISyntaxException e) {
            log.error("url 异常",e);
            throw new SignException("解析url异常");
        }
    }
    @Override
    public ResponseVo uploadFile(String url, Map<String, String> header, byte[] fileData,final String orgFileName)  {
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(true);
        responseVo.setType(0);
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("multipart/form-data");
        org.springframework.core.io.Resource resource = new ByteArrayResource(fileData){
            @Override
            public String getFilename() {
                return orgFileName;
            }
        };
        headers.setContentType(type);
        for (Map.Entry<String,String> entry: header.entrySet()) {
            headers.add(entry.getKey(),entry.getValue());
        }
        MultiValueMap<String, Object> form = new LinkedMultiValueMap<>();
        form.add("file", resource);
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(form, headers);

        ResponseEntity<String> responseEntity = initRestTemplate().exchange(url, HttpMethod.POST,
                httpEntity, String.class);
        if(responseEntity.getStatusCode().equals(HttpStatus.OK)){
            responseVo.setError(false);
            responseVo.setBodyResponse(responseEntity.getBody());
            return responseVo;
        }
        return responseVo;
    }
    @Override
    public ResponseVo postFile(String url, String apiKey, byte[] fileData, final String orgFileName)  {
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(true);
        responseVo.setType(0);

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("multipart/form-data");
        org.springframework.core.io.Resource resource = new ByteArrayResource(fileData){
            @Override
            public String getFilename() {
                return orgFileName;
            }
        };
        headers.setContentType(type);
        headers.add("Api-Key",apiKey);
        MultiValueMap<String, Object> form = new LinkedMultiValueMap<>();
        form.add("file", resource);
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(form, headers);

        ResponseEntity<String> responseEntity = initRestTemplate().exchange(url, HttpMethod.POST,
                httpEntity, String.class);
        if(responseEntity.getStatusCode().equals(HttpStatus.OK)){
            responseVo.setError(false);
            responseVo.setBodyResponse(responseEntity.getBody());
            return responseVo;
        }
        return responseVo;
    }
    @Override
    public ResponseVo uploadImage(String url, String apiKey,final ItReqImage image){
        ResponseVo responseVo= new ResponseVo();
        responseVo.setError(true);
        responseVo.setType(0);

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("multipart/form-data");
        org.springframework.core.io.Resource resource = new ByteArrayResource(image.getFile()){
            @Override
            public String getFilename() {
                return image.getFileName();
            }
        };


        headers.setContentType(type);
        headers.add("Api-Key",apiKey);
        MultiValueMap<String, Object> form = new LinkedMultiValueMap<>();
        form.add("file", resource);
        if(null!=image.getLogo()){
            org.springframework.core.io.Resource resourceLogo = new ByteArrayResource(image.getLogo()){
                @Override
                public String getFilename() {
                    return image.getLogoName();
                }
            };
            form.add("logo", resourceLogo);
        }
        Map<String,String> map = BeanMapUtil.BeanToMapString(image);
        for (Map.Entry<String,String> entry: map.entrySet()) {
            if(entry.getKey().equals("file")||entry.getKey().equals("fileName")||entry.getKey().equals("logo")||entry.getKey().equals("logoName")){
                continue;
            }
            if(null!=entry.getValue()){
                form.add(entry.getKey(),entry.getValue());
            }
        }
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(form, headers);

        ResponseEntity<String> responseEntity = initRestTemplate().exchange(url, HttpMethod.POST,
                httpEntity, String.class);
        if(responseEntity.getStatusCode().equals(HttpStatus.OK)){
            responseVo.setError(false);
            responseVo.setBodyResponse(responseEntity.getBody());
            return responseVo;
        }
        return responseVo;
    }
}
