package com.yonghui.it.service.lbpm.model;


import java.util.List;


public class AuditOption {
    private String fdId;
    private String factNodeId;
    private String factNodeName;
    private String actionName;
    private String actionInfo;
    private String auditNote;
    private String createTime;
    private String nodeId;
    private String workItemId;
    private String handler;
    private String handlerName;
    private List<Attachment> attachments;

    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public String getFactNodeId() {
        return factNodeId;
    }

    public void setFactNodeId(String factNodeId) {
        this.factNodeId = factNodeId;
    }

    public String getFactNodeName() {
        return factNodeName;
    }

    public void setFactNodeName(String factNodeName) {
        this.factNodeName = factNodeName;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(String actionInfo) {
        this.actionInfo = actionInfo;
    }

    public String getAuditNote() {
        return auditNote;
    }

    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}
