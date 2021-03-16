package com.yonghui.it.service.lbpm.model;

import com.yonghui.it.service.annotion.SDKModel;
import com.yonghui.it.service.annotion.SDKProperty;

@SDKModel("创建模板")
public class ReqCreateProcess {
    @SDKProperty( value = "模版ID",required = true)
    private String templateId;
    @SDKProperty(value = "申请人",required = true)
    private String applicant;
    @SDKProperty(value = "流程实例标题",example="新供应商录入_云超生鲜加工",required=true)
    private String title;//必填| 业务单号
    @SDKProperty(value = "业务单号",example="Yh0001",required=true)
    private String  businessId;//必填| 业务单号

    public ReqCreateProcess(String templateId, String applicant, String title, String businessId) {
        this.templateId = templateId;
        this.applicant = applicant;
        this.title = title;
        this.businessId = businessId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
