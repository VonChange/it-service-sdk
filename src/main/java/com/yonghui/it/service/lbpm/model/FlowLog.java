package com.yonghui.it.service.lbpm.model;

public class FlowLog {
    private String factNodeId;
    private String factNodeName;
    private String actionName;
    private String actionInfo;
    private String createTime;
    private String nodeId;
    private String workItemId;
    private String expecter;
    private Long costTime;
    private String authorizer;
    private String authorizeType;
    private String authorizeTypeName;
    private String handler;
    private String handlerName;
    private String notifyType;

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

    public String getExpecter() {
        return expecter;
    }

    public void setExpecter(String expecter) {
        this.expecter = expecter;
    }

    public Long getCostTime() {
        return costTime;
    }

    public void setCostTime(Long costTime) {
        this.costTime = costTime;
    }

    public String getAuthorizer() {
        return authorizer;
    }

    public void setAuthorizer(String authorizer) {
        this.authorizer = authorizer;
    }

    public String getAuthorizeType() {
        return authorizeType;
    }

    public void setAuthorizeType(String authorizeType) {
        this.authorizeType = authorizeType;
    }

    public String getAuthorizeTypeName() {
        return authorizeTypeName;
    }

    public void setAuthorizeTypeName(String authorizeTypeName) {
        this.authorizeTypeName = authorizeTypeName;
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

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }
}