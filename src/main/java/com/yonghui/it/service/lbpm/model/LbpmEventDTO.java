package com.yonghui.it.service.lbpm.model;


import com.yonghui.it.service.annotion.SDKProperty;

import java.util.List;

public class LbpmEventDTO {
    private String processId;
    private String nodeFactId;
    private String nodeType;
    private String nodeName;
    private String docStatus;
    private EnumProcessStatus docStatusEnum;
    private String type;
    private String operationType;
    private String eventName;
    private String eventSimpleName;
    private String templateId;
    @SDKProperty(value="业务ID")
    private String businessId;
    private String applicant;
    private String sysId;
    private String modelId;
    private String formInstanceId;
    private String handlerCode;
    private String handlerName;
    @SDKProperty(value="当前处理人")
    private List<ApproverDTO> handlers;
    private String handlerSelectType;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getNodeFactId() {
        return nodeFactId;
    }

    public void setNodeFactId(String nodeFactId) {
        this.nodeFactId = nodeFactId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
        this.docStatusEnum = EnumProcessStatus.getByValue(docStatus);
    }

    public EnumProcessStatus getDocStatusEnum() {
        return docStatusEnum;
    }

    public void setDocStatusEnum(EnumProcessStatus docStatusEnum) {
        this.docStatusEnum = docStatusEnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventSimpleName() {
        return eventSimpleName;
    }

    public void setEventSimpleName(String eventSimpleName) {
        this.eventSimpleName = eventSimpleName;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getFormInstanceId() {
        return formInstanceId;
    }

    public void setFormInstanceId(String formInstanceId) {
        this.formInstanceId = formInstanceId;
    }

    public List<ApproverDTO> getHandlers() {
        return handlers;
    }

    public void setHandlers(List<ApproverDTO> handlers) {
        this.handlers = handlers;
    }

    public String getHandlerSelectType() {
        return handlerSelectType;
    }

    public void setHandlerSelectType(String handlerSelectType) {
        this.handlerSelectType = handlerSelectType;
    }

    public String getHandlerCode() {
        return handlerCode;
    }

    public void setHandlerCode(String handlerCode) {
        this.handlerCode = handlerCode;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
}
