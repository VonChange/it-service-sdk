package com.yonghui.it.service.lbpm.model;

public class ReqHandlerInfo {
    private String processId;
    private String handler;

    public ReqHandlerInfo(String processId, String handler) {
        this.processId = processId;
        this.handler = handler;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }
}
