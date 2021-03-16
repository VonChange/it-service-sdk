package com.yonghui.it.service.lbpm.model;

public class WorkItemDTO {
    private String taskId;
    private String activityType;
    private String startDate;
    private String expecterName;
    private String expecter;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpecterName() {
        return expecterName;
    }

    public void setExpecterName(String expecterName) {
        this.expecterName = expecterName;
    }

    public String getExpecter() {
        return expecter;
    }

    public void setExpecter(String expecter) {
        this.expecter = expecter;
    }
}