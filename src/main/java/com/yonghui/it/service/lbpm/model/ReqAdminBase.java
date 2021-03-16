package com.yonghui.it.service.lbpm.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class ReqAdminBase {
    @SDKProperty(value="流程实例标识(必填)",example="16a6c4ae981825abf011bbb4a05b7131",required=true)
    private String processId;
    @SDKProperty(value="处理意见",example="同意",required=true)
    private String auditNote;

    public ReqAdminBase(String processId, String auditNote) {
        this.processId = processId;
        this.auditNote = auditNote;
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
}
