package com.yonghui.it.service.file;

import com.yonghui.it.service.common.model.ItServiceEnv;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sign.sdk.service.HttpCommonService;
import com.yonghui.it.service.sign.sdk.service.impl.HttpRequestServiceImpl;
import com.yonghui.it.service.sign.sdk.service.impl.HttpRestTemplateServiceImpl;
import com.yonghui.it.service.sign.sdk.service.impl.ResponseVo;
import com.yonghui.it.service.sign.sdk.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public abstract  class AbstractImageService {
    private static final Logger log = LoggerFactory.getLogger(AbstractImageService.class);
    protected abstract RestTemplate getRestTemplate();
    protected abstract  String initApiKey();
    private  static HttpCommonService httpRequestService = new HttpRequestServiceImpl();
    private static volatile HttpCommonService httpRestTemplateService= null;
    private   HttpCommonService instanceRestTemplate(){
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
    private String getUrl(){
        if(ItServiceEnv.prod.equals(getItServiceEnv())){
            return "";
        }
        return "";
    }
    public YhResponse<ItVoFile> uploadImage(ItReqImage image)  {
        ResponseVo responseVo =getHttpCommonService().uploadImage(getUrl()+"/upload", initApiKey(),image);
        if(Boolean.FALSE.equals(responseVo.getError())){
            ItVoFile itVoFile = JsonUtil.fromJson(responseVo.getBodyResponse(),ItVoFile.class);
            itVoFile.setPath(getUrl()+"/image/"+itVoFile.getPath());
            return YhResponse.success(itVoFile);
        }
        if(null==responseVo.getBodyResponse()){
            return YhResponse.error("上传失败");
        }
        ItVoFile itVoFile = JsonUtil.fromJson(responseVo.getBodyResponse(),ItVoFile.class);
        return YhResponse.error(itVoFile.getMsg());
    }
    private byte[] getBytes(File file){
        byte[] buffer = null;
        try {
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            log.error("IOException",e);
        }
        return buffer;
    }
}
