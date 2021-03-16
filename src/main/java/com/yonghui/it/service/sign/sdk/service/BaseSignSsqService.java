package com.yonghui.it.service.sign.sdk.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.sign.sdk.domain.SsqResponse;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sign.sdk.exception.SignException;
import com.yonghui.it.service.sign.sdk.service.impl.*;
import com.yonghui.it.service.sign.sdk.service.model.Auth;
import com.yonghui.it.service.sign.sdk.service.model.AuthReq;
import com.yonghui.it.service.sign.sdk.service.model.SignEnv;
import com.yonghui.it.service.sign.sdk.util.BeanMapUtil;
import com.yonghui.it.service.sign.sdk.util.DateUtil;
import com.yonghui.it.service.sign.sdk.util.JsonUtil;
import com.yonghui.it.service.sign.sdk.util.StringUtil;
import com.yonghui.it.service.sign.sdk.util.map.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class BaseSignSsqService {
    private static final Logger log = LoggerFactory.getLogger(BaseSignSsqService.class);
    private final static String CHARSETTING = "UTF-8";
    private static  final String AUTH = "auth";
    private static Map<String, Auth> cache = new ConcurrentHashMap<>();


    protected abstract RestTemplate getRestTemplate();
    protected  abstract String getSecretId();
    protected  abstract Integer getSessionMinuteTime();
    protected  abstract String getSecretKey();


    /**
     * 是否 外网可以访问 即使用外网地址
     * @return
     */
    protected  abstract Boolean isPublicAccess();

    private  static HttpCommonService HttRequstService =
            //new HttpJoddServiceImpl();
            new HttpRequestServiceImpl();

    private static volatile HttpCommonService httpRestTemplateService= null;


    public  HttpCommonService instanceRestTemplate(){
        if (null == httpRestTemplateService) {
            synchronized (HttpRestTemplateServiceImpl.class) {
                if (null == httpRestTemplateService) {
                    httpRestTemplateService = new HttpRestTemplateServiceImpl() {
                        @Override
                        protected RestTemplate initRestTemplate() {
                            return  getRestTemplate();
                        }
                    };
                }
            }
        }
        return httpRestTemplateService;
    }
    private HttpCommonService getHttpCommonService(){
        if(null==getRestTemplate()){
            return  HttRequstService;
        }
        return instanceRestTemplate();
    }

    protected abstract SignEnv getSignEnv();
    public  <X> YhResponse<byte[]> getBytes(String action, X param) throws SignException{
        String url= buildFullUrl(action);
        url=url+buildParam(BeanMapUtil.BeanToMapString(param),false);
        ResponseVo responseVo =getHttpCommonService().request(url,null,intHeaderInfo(),
                MethodRequest.GET);
        return toYhResponseByteSsq(responseVo);
    }
    <T> YhResponse<T> toYhResponse(ResponseVo responseVo,TypeReference<YhResponse<T>> type){
        if(responseVo.getError()){
            return YhResponse.error(responseVo.getErrMsg());
        }
        if(responseVo.getType()==0){
            return JsonUtil.fromJson(responseVo.getBodyResponse(), type);
        }
        return YhResponse.error("请求失败 998");
    }
    private YhResponse<byte[]> toYhResponseByte(ResponseVo responseVo){
        if(responseVo.getError()){
            return YhResponse.error(responseVo.getErrMsg());
        }
        if(responseVo.getType()==0){
            YhResponse<byte[]> yhResponse = JsonUtil.fromJson(responseVo.getBodyResponse(),
                    new TypeReference<YhResponse<byte[]>>() {
                    });
            return yhResponse;
        }
        return YhResponse.success(responseVo.getBodyBytes());
    }
    private YhResponse<byte[]> toYhResponseByteSsq(ResponseVo responseVo){
        if(responseVo.getError()){
            return YhResponse.error(responseVo.getErrMsg());
        }

        if(responseVo.getType()==0){
            if(StringUtil.isBlank(responseVo.getBodyResponse())){
                return YhResponse.error("无数据");
            }
            SsqResponse ssqResponse = JsonUtil.fromJson(responseVo.getBodyResponse(), SsqResponse.class);
            return YhResponse.error(ssqResponse.getErrno(),ssqResponse.getErrmsg());
        }
        return YhResponse.success(responseVo.getBodyBytes());
    }
    public  <X> YhResponse<byte[]> postBytes(String action, X param) throws SignException{
        String url= buildFullUrl(action);
        ResponseVo responseVo =getHttpCommonService().request(url,JsonUtil.toJson(param)
                ,intHeaderInfo(), MethodRequest.POST);
        return toYhResponseByte(responseVo);
    }

    public  <T,X> YhResponse<T> post(TypeReference<YhResponse<T>> type, String action, X body) throws SignException{
        String url= buildFullUrl(action);
        ResponseVo responseVo =getHttpCommonService().request(url,JsonUtil.toJson(body)
                ,intHeaderInfo(), MethodRequest.POST);
        return toYhResponse(responseVo,type);
    }
    public  <T,X> YhResponse<T> get(TypeReference<YhResponse<T>> type, String action, X param) throws SignException{
        String url= buildFullUrl(action);
        if(null!=param){
            url=url+buildParam(BeanMapUtil.BeanToMapString(param),false);
        }
        ResponseVo responseVo =getHttpCommonService().request(url,null
                ,intHeaderInfo(),MethodRequest.GET);
        return toYhResponse(responseVo,type);
    }



    private String buildFullUrl(String action) {
        String url= getItServiceUrl();
        return  url+buildParam(new HashMap<String,String>().set("Service","ssq").set("Action",action),true);
    }

    private static String buildParam(Map<String, String> requestParams,boolean begin) {
        StringBuilder retStr = new StringBuilder();
        for(String key: requestParams.keySet()) {
            String value = requestParams.get(key);
            if(StringUtil.isBlank(value)){
                continue;
            }
            if (retStr.length()==0) {
                retStr.append(begin?'?':'&');
            } else {
                retStr.append('&');
            }
            try {
                retStr.append(key).append("=").append(URLEncoder.encode(value,CHARSETTING));
            } catch (UnsupportedEncodingException e) {
                log.error("UnsupportedEncodingException ",e);
            }
        }
        return retStr.toString();
    }
    private Map<String,String> intHeaderInfo() throws SignException {
        Map<String,String> map = new HashMap<>();
        Auth auth = getSession();
        log.debug("auth {}", JsonUtil.toJson(auth));
        map.put("uid",auth.getUid());
        map.put("skey",auth.getSkey());
        map.put("Content-Type","application/json");
        return map;
    }
    private Map<String,String> intHeaderInfoJson() throws SignException {
        Map<String,String> map = new HashMap<>();;
        map.put("Content-Type","application/json");
        return map;
    }

    private synchronized Auth  getSession() throws SignException {
        Auth auth=cache.get(AUTH);
        if(inCache(auth)){
            return auth;
        }
        Auth authNew = new Auth();
        String url= getItServiceUrl();
        AuthReq authReq= new AuthReq();
        String secretId=getSecretId();
        if(secretId.equals("0XEUTgRCGQWhyzIdlkcYu1QVuhatA6Ba")){
            log.error("\n正式环境测试账号 不得使用过");
            System.err.println("\n正式环境测试账号 不得使用过");
        }
        authReq.setSecretId(secretId);
        authReq.setSecretKey(getSecretKey());
        log.info("auth {}",url+"auth/secret/user");
        ResponseVo response =
                getHttpCommonService().request(url+"auth/secret/user",JsonUtil.toJson(authReq),
                        intHeaderInfoJson(), MethodRequest.POST);
        if(null==response||response.getError()){
            throw  new SignException("获取skey失败");
        }
        YhResponse<Auth> authYhResponse = JsonUtil.fromJson(response.getBodyResponse(), new TypeReference<YhResponse<Auth>>() {
        });
        if(!authYhResponse.isOk()||null==authYhResponse.getResult()){
            throw  new SignException(authYhResponse.getCode().toString(),authYhResponse.getMessage());

        }
        authNew.setUid(authYhResponse.getResult().getUid());
        authNew.setSkey(authYhResponse.getResult().getSkey());
        authNew.setPutTime(new Date());
        cache.put(AUTH,authNew);
        return authNew;
    }

    private String getItServiceUrl() {
        Boolean isPublicAccess=  isPublicAccess();
        if(null==isPublicAccess){
            isPublicAccess=false;
        }
        SignEnv signEnv = getSignEnv();
        if(null==signEnv){
            return "";
        }
        if(signEnv.equals(SignEnv.prod)){
            if(isPublicAccess){
                return "";
            }
            return "";
        }
        if(signEnv.equals(SignEnv.test)){
            if(isPublicAccess){
                return "";
            }
            return "";
        }
        if(signEnv.equals(SignEnv.dev)){
            log.error("不得使用这个开发环境参数！这个我作为服务提供方的开发环境  请使用过 test或prod环境");
            System.err.println("不得使用这个开发环境参数！这个我作为服务提供方的开发环境  请使用过 test或prod环境");
            if(isPublicAccess){
                return "";
            }
            return "";
        }
        return "";
    }

    private boolean inCache(Auth auth) {
        if(null==auth){
            return false;
        }
        if(DateUtil.addMinutes(auth.getPutTime(),getSessionMinuteTime()).before(new Date())){
            return  false;
        }
        return  true;
    }
}
