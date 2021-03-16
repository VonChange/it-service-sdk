package com.yonghui.it.service.sign.sdk.domain;

import com.yonghui.it.service.sign.sdk.util.JsonUtil;
import com.yonghui.it.service.sign.sdk.util.StringUtil;

public class YhResponse<T> {
    private static final int okCode=200000;

    private Integer code;
    private T result;
    private String message;
    private String messageCn;

    public  boolean isOk(){
        if(null!=this.code&&okCode==this.code){
            return true;
        }
        return false;
    }
    public static <T> YhResponse<T> error(String msg) {
        YhResponse<T> response = new YhResponse<T>();
        response.setCode(400000);
        response.setMessage(msg);
        return response;
    }
    public static <T> YhResponse<T> error(Integer code,String msg) {
        YhResponse<T> response = new YhResponse<>();
        response.setCode(code);
        response.setMessage(msg);
        return response;
    }
    public static <T> YhResponse<T> success(T data) {
        YhResponse<T> response = new YhResponse<T>();
        response.setCode(200000);
        response.setResult(data);
        return response;
    }
    public void setResult(T result) {
        this.result = result;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        if(!isOk()&&!StringUtil.isBlank(this.message)&&this.message.startsWith("json:")){
           SsqResponse ssqResponse=  JsonUtil.fromJson(this.message.substring(5),SsqResponse.class);
           return  ssqResponse.getErrno();
        }
        return code;
    }

    public T getResult() {
        return result;
    }

    public String getMessage() {
        //!isOk()&&
        if(!StringUtil.isBlank(this.message)&&this.message.startsWith("json:")){
            SsqResponse ssqResponse=  JsonUtil.fromJson(this.message.substring(5),SsqResponse.class);
            return  ssqResponse.getErrmsg();
        }
        return message;
    }
    public String getMessageCn() {
        //!isOk()&&
        if(!StringUtil.isBlank(this.message)&&this.message.startsWith("json:")){
            SsqResponse ssqResponse=  JsonUtil.fromJson(this.message.substring(5),SsqResponse.class);
            return  ssqResponse.getMessage();
        }
        return message;
    }
}
