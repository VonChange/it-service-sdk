package com.yonghui.it.service.lbpm.model;


import java.util.Map;

public class OperationItem {
    private String operationType;
    private String operationName;
    private String operationHandlerType;
    private Map<String,Object> params;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationHandlerType() {
        return operationHandlerType;
    }

    public void setOperationHandlerType(String operationHandlerType) {
        this.operationHandlerType = operationHandlerType;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}