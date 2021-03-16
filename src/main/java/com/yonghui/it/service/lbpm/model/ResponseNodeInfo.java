package com.yonghui.it.service.lbpm.model;

import java.util.List;
import java.util.Map;

public class ResponseNodeInfo {
    private String taskId;
    private String nodeId;
    private String nodeName;
    private String activity;
    private String startDate;
    private String handlers;
    private String handlerNames;
    private String processType;
    private String desc;
    private List<ResponseNode> destinations;
    private Map<String,Object> extAttributes;
    private List<WorkItemDTO> workitems;

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

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getHandlers() {
        return handlers;
    }

    public void setHandlers(String handlers) {
        this.handlers = handlers;
    }

    public String getHandlerNames() {
        return handlerNames;
    }

    public void setHandlerNames(String handlerNames) {
        this.handlerNames = handlerNames;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<ResponseNode> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<ResponseNode> destinations) {
        this.destinations = destinations;
    }

    public Map<String, Object> getExtAttributes() {
        return extAttributes;
    }

    public void setExtAttributes(Map<String, Object> extAttributes) {
        this.extAttributes = extAttributes;
    }

    public List<WorkItemDTO> getWorkitems() {
        return workitems;
    }

    public void setWorkitems(List<WorkItemDTO> workitems) {
        this.workitems = workitems;
    }
}