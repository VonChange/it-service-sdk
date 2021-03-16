package com.yonghui.it.service.lbpm.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class ReqFormData {
    @SDKProperty(value="表单字段编码",example="is_rollback_cpn_leader",required=true)
    public String fieldId;
    @SDKProperty(value="表单字段值",example="1",required=true)
    public String fieldValue;

    public ReqFormData(String fieldId, String fieldValue) {
        this.fieldId = fieldId;
        this.fieldValue = fieldValue;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}