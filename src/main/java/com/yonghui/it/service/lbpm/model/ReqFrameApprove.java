package com.yonghui.it.service.lbpm.model;

public class ReqFrameApprove {
    private String processId;
    private String handler;
    private String approveData;

    public ReqFrameApprove(String processId, String handler, String approveData) {
        this.processId = processId;
        this.handler = handler;
        this.approveData = approveData;
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

    public String getApproveData() {
        return approveData;
    }

    public void setApproveData(String approveData) {
        this.approveData = approveData;
    }
}
