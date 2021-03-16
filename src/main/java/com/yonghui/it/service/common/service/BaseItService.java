package com.yonghui.it.service.common.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.HttpUtil;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.model.AuthInfo;
import com.yonghui.it.service.common.model.ItServiceEnv;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sign.sdk.service.HttpCommonService;
import com.yonghui.it.service.sign.sdk.service.impl.HttpRequestServiceImpl;
import com.yonghui.it.service.sign.sdk.service.impl.HttpRestTemplateServiceImpl;
import com.yonghui.it.service.sign.sdk.service.impl.MethodRequest;
import com.yonghui.it.service.sign.sdk.service.impl.ResponseVo;
import com.yonghui.it.service.sign.sdk.service.model.Auth;
import com.yonghui.it.service.sign.sdk.service.model.AuthReq;
import com.yonghui.it.service.sign.sdk.util.BeanMapUtil;
import com.yonghui.it.service.sign.sdk.util.DateUtil;
import com.yonghui.it.service.sign.sdk.util.JsonUtil;
import com.yonghui.it.service.sign.sdk.util.map.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class BaseItService {
    private static final Logger log = LoggerFactory.getLogger(BaseItService.class);

    private static Map<String, Auth> cache = new ConcurrentHashMap<>();


    protected  RestTemplate getRestTemplate(){
        return  null;
    }
    protected  abstract String getSecretId();
    protected  abstract Integer getSessionMinuteTime();
    protected  abstract String getSecretKey();
    protected  abstract String getServiceName();

    /**
     * 是否 外网可以访问 即使用外网地址
     *
     */
    protected  abstract Boolean isPublicAccess();

    private  static HttpCommonService httpRequestService = new HttpRequestServiceImpl();

    private static volatile HttpCommonService httpRestTemplateService= null;


    public  HttpCommonService instanceRestTemplate(){
        if (null == httpRestTemplateService) {
            synchronized (HttpRestTemplateServiceImpl.class) {
                if (null == httpRestTemplateService) {
                    httpRestTemplateService = new HttpRestTemplateServiceImpl() {
                        @Override
                        protected RestTemplate initRestTemplate() {
                            return getRestTemplate();
                        }
                    };
                }
            }
        }
        return httpRestTemplateService;
    }
    private HttpCommonService getHttpCommonService(){
        if(null==getRestTemplate()){
            return  httpRequestService;
        }
        return instanceRestTemplate();
    }

    protected abstract ItServiceEnv getItServiceEnv();

    public  <X> YhResponse<byte[]> getBytes(AuthInfo authInfo,String action, X param) throws ItServiceException {
        String url= buildFullUrl(action);
        url=url+HttpUtil.buildParam(BeanMapUtil.BeanToMapString(param),false);
        ResponseVo responseVo =getHttpCommonService().request(url,null,intHeaderInfo(authInfo),
                MethodRequest.GET);
        return toYhResponseByte(responseVo);
    }

    public  <X> YhResponse<byte[]> getBytes(String action, X param) throws ItServiceException {
        return getBytes(action, param);
    }

    <T> YhResponse<T> toYhResponse(ResponseVo responseVo, TypeReference<YhResponse<T>> type){
        if(responseVo.getError()){
            return YhResponse.error(responseVo.getErrMsg());
        }
        if(responseVo.getType()==0){
            if(responseVo.getBodyResponse().startsWith("{\"code\":200000,")){
                return JsonUtil.fromJson(responseVo.getBodyResponse(), type);
            }
            //异类 比如短信 非200000 和 200000的result 类型不一样！！！
            YhResponse<Object> response= JsonUtil.fromJson(responseVo.getBodyResponse(), new TypeReference<YhResponse<Object>>() {
            });
            if(!response.isOk()){
                return YhResponse.error(response.getCode(),response.getMessage());
            }
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


    public  <X> YhResponse<byte[]> postBytes(AuthInfo authInfo,String action, X param) throws ItServiceException{
        String url= buildFullUrl(action);
        ResponseVo responseVo =getHttpCommonService().request(url,JsonUtil.toJson(param)
                ,intHeaderInfo(authInfo), MethodRequest.POST);
        return toYhResponseByte(responseVo);
    }
    public  <X> YhResponse<byte[]> postBytes(String action, X param) throws ItServiceException{
        return postBytes(null,action,param);
    }

    public  <T,X> YhResponse<T> post(AuthInfo authInfo,TypeReference<YhResponse<T>> type, String action, X body) throws ItServiceException{
        String url= buildFullUrl(action);
        ResponseVo responseVo =getHttpCommonService().request(url,JsonUtil.toJson(body)
                ,intHeaderInfo(authInfo), MethodRequest.POST);
        return toYhResponse(responseVo,type);
    }
    public  <T,X> YhResponse<T> post(TypeReference<YhResponse<T>> type, String action, X body) throws ItServiceException{
        return post(null,type,action,body);
    }
    public  <T,X> YhResponse<T> post(TypeReference<YhResponse<T>> type, String action,Map<String,String> param, X body) throws ItServiceException{
        String url= buildFullUrl(action,param);
        ResponseVo responseVo =getHttpCommonService().request(url,JsonUtil.toJson(body)
                ,intHeaderInfo(null), MethodRequest.POST);
        return toYhResponse(responseVo,type);
    }
    public  <T> YhResponse<T> uploadFile(AuthInfo authInfo,TypeReference<YhResponse<T>> type, String action, byte[] fileData, String orgFileName) throws ItServiceException{
        String url= buildFullUrl(action);
        ResponseVo responseVo =getHttpCommonService().uploadFile(url,intHeaderInfo(authInfo), fileData, orgFileName);
        return toYhResponse(responseVo,type);
    }
    public  <T> YhResponse<T> uploadFile(TypeReference<YhResponse<T>> type, String action, byte[] fileData, String orgFileName) throws ItServiceException{
        return uploadFile(null,type,action,fileData,orgFileName);
    }



    public  <T,X> YhResponse<T> get(AuthInfo authInfo,TypeReference<YhResponse<T>> type, String action, X param) throws ItServiceException{
        String url= buildFullUrl(action);
        if(null!=param){
            Map<String,String> paramMap;
            if(param instanceof Map){
                paramMap= (Map<String, String>) param;
            }else{
                paramMap=BeanMapUtil.BeanToMapString(param);
            }
            url=url+ HttpUtil.buildParam(paramMap,false);
        }
        ResponseVo responseVo =getHttpCommonService().request(url,null
                ,intHeaderInfo(authInfo),MethodRequest.GET);
        return toYhResponse(responseVo,type);
    }
    public  <T,X> YhResponse<T> get(TypeReference<YhResponse<T>> type, String action, X param) throws ItServiceException{
        return get(null,type,action,param);
    }


    private String buildFullUrl(String action,Map<String,String> param) {
        String url= getItServiceUrl();
        String serviceName = getServiceName();
        Map<String,String> paramMap=new HashMap<String,String>().set("Service",serviceName).set("Action",action);
        paramMap.putAll(param);
        return  url+HttpUtil.buildParam(paramMap,true);
    }
    private String buildFullUrl(String action) {
        String url= getItServiceUrl();
        String serviceName = getServiceName();
        return  url+HttpUtil.buildParam(new HashMap<String,String>().set("Service",serviceName).set("Action",action),true);
    }


    private Map<String,String> intHeaderInfo(AuthInfo authInfo) throws ItServiceException {
        Map<String,String> map = new HashMap<>();
        Auth auth = getSession(authInfo);
        log.debug("auth {}", JsonUtil.toJson(auth));
        map.put("uid",auth.getUid());
        map.put("skey",auth.getSkey());
        map.put("Content-Type","application/json");
        return map;
    }
    private Map<String,String> intFormHeaderInfo(AuthInfo authInfo) throws ItServiceException {
        Map<String,String> map = new HashMap<>();
        Auth auth = getSession(authInfo);
        log.debug("auth {}", JsonUtil.toJson(auth));
        map.put("uid",auth.getUid());
        map.put("skey",auth.getSkey());
        map.put("Content-Type","multipart/form-data");
        return map;
    }
    private Map<String,String> intHeaderInfoJson() throws ItServiceException {
        Map<String,String> map = new HashMap<>();;
        map.put("Content-Type","application/json");
        return map;
    }

    private synchronized Auth getNewAuth(String id,String key,String cacheId) throws ItServiceException {
        // 其他线程拿到锁后再判断 不会再次调用
        Auth auth=cache.get(cacheId);
        if(inCache(auth)){
            return auth;
        }

        Auth authNew = new Auth();
        String url= getItServiceUrl();
        AuthReq authReq= new AuthReq();
        authReq.setSecretId(id);
        authReq.setSecretKey(key);
        log.info("auth {} {}",url,"auth/secret/user");
        ResponseVo response =
                getHttpCommonService().request(url+"auth/secret/user",JsonUtil.toJson(authReq),
                        intHeaderInfoJson(), MethodRequest.POST);
        if(null==response||response.getError()){
            throw  new ItServiceException("获取skey失败");
        }
        YhResponse<Auth> authYhResponse = JsonUtil.fromJson(response.getBodyResponse(), new TypeReference<YhResponse<Auth>>() {
        });
        if(!authYhResponse.isOk()||null==authYhResponse.getResult()){
            throw  new ItServiceException(authYhResponse.getMessage());
        }
        authNew.setUid(authYhResponse.getResult().getUid());
        authNew.setSkey(authYhResponse.getResult().getSkey());
        authNew.setPutTime(new Date());
        cache.put(cacheId,authNew);
        return authNew;
    }
    private  Auth  getSession(AuthInfo authInfo) throws ItServiceException {
        String id=null;
        String key=null;
        if(null==authInfo){
            id=getSecretId();
            key=getSecretKey();
        }
        if(null!=authInfo){
            id=authInfo.getSecretId();
            key=authInfo.getSecretKey();
        }
        String cacheId= getItServiceEnv().getEnv()+"-"+id;
        Auth auth=cache.get(cacheId);
        if(inCache(auth)){
            return auth;
        }
        return getNewAuth(id,key,cacheId);
    }

    private String getItServiceUrl() {
        Boolean isPublicAccess=  isPublicAccess();
        if(null==isPublicAccess){
            isPublicAccess=false;
        }
        ItServiceEnv itServiceEnv = getItServiceEnv();
        if(null==itServiceEnv){
            return "";
        }
        if(itServiceEnv.equals(ItServiceEnv.prod)){
            if(isPublicAccess){
                return "";
            }
            return "";
        }
        if(itServiceEnv.equals(ItServiceEnv.test)){
            if(isPublicAccess){
                return "";
            }
            return "";
        }
        if(itServiceEnv.equals(ItServiceEnv.dev)){
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
