package com.yonghui.it.service.lbpm.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class ReqDrafterBase {
    @SDKProperty(value="流程实例标识(必填)", example="16a6c4ae981825abf011bbb4a05b7131", required=true)
    private String processId;

    public ReqDrafterBase(String processId) {
        this.processId = processId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }
}
