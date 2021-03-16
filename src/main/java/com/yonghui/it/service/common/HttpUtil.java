package com.yonghui.it.service.common;

import com.yonghui.it.service.sign.sdk.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class HttpUtil {
    private final static String CHARSETTING = "UTF-8";
    private static final Logger log = LoggerFactory.getLogger(HttpUtil.class);
    public static String buildParam(Map<String, String> requestParams, boolean begin) {
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
}
