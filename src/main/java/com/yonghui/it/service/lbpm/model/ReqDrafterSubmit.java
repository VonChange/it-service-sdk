package com.yonghui.it.service.lbpm.model;

import com.yonghui.it.service.annotion.SDKProperty;

import java.util.List;

public class ReqDrafterSubmit extends ReqDrafterBase {

    @SDKProperty(value="运行时表单数据")
    private List<ReqFormData> formData;

    public ReqDrafterSubmit(String processId) {
        super(processId);
    }

    public List<ReqFormData> getFormData() {
        return formData;
    }

    public ReqDrafterSubmit setFormData(List<ReqFormData> formData) {
        this.formData = formData;
        return this;
    }
}
