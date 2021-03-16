package com.yonghui.it.service.lbpm.model;

import java.util.List;

public class ResponseOperation {
    private String activityType;
    private String taskId;
    private String nodeId;
    private String expectedName;
    private String taskFrom;
    private List<OperationItem> operations;

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getExpectedName() {
        return expectedName;
    }

    public void setExpectedName(String expectedName) {
        this.expectedName = expectedName;
    }

    public String getTaskFrom() {
        return taskFrom;
    }

    public void setTaskFrom(String taskFrom) {
        this.taskFrom = taskFrom;
    }

    public List<OperationItem> getOperations() {
        return operations;
    }

    public void setOperations(List<OperationItem> operations) {
        this.operations = operations;
    }
}