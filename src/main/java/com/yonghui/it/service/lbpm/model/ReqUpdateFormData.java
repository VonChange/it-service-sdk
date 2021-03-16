package com.yonghui.it.service.lbpm.model;

import java.util.List;

public class ReqUpdateFormData {
    private String processId;
    private List<ReqFormData> formData;

    public ReqUpdateFormData(String processId, List<ReqFormData> formData) {
        this.processId = processId;
        this.formData = formData;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public List<ReqFormData> getFormData() {
        return formData;
    }

    public void setFormData(List<ReqFormData> formData) {
        this.formData = formData;
    }
}