package com.yonghui.it.service.sign.sdk.service.model.callback;

public class SignReqCallbackInfo {
    /**
     * 事件 类型
     */
    private String action;
    /**
     * 消息ID
     */
    private String messageId;
    public SignReqCallbackInfo(String action,String messageId){
        this.action=action;
        this.messageId=messageId;
    }

    public String getAction() {
        return action;
    }

    public String getMessageId() {
        return messageId;
    }
}
