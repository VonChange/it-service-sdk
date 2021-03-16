package com.yonghui.it.service.lbpm.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class ReqApproveBase {
    @SDKProperty(value="流程实例标识(必填)",example="16a6c4ae981825abf011bbb4a05b7131",required=true)
    private String processId;
    @SDKProperty(value="处理意见",example="同意",required=true)
    private String auditNote;
    private String handler;
    private Boolean notifyOnFinish;

    public ReqApproveBase(String processId,String handler,String auditNote) {
        this.processId = processId;
        this.auditNote = auditNote;
        this.handler = handler;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getAuditNote() {
        return auditNote;
    }

    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Boolean getNotifyOnFinish() {
        return notifyOnFinish;
    }

    public void setNotifyOnFinish(Boolean notifyOnFinish) {
        this.notifyOnFinish = notifyOnFinish;
    }
}