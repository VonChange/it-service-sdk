package com.yonghui.it.service.express.model;

public class ReqCallbackMsg {
    private String messageId;

    public ReqCallbackMsg(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageId() {
        return messageId;
    }
}
