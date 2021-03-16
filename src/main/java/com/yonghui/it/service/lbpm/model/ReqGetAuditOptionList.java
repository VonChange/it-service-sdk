package com.yonghui.it.service.lbpm.model;

public class ReqGetAuditOptionList {
    private String processId;
    private String handler;
    private Integer pageSize;
    private Integer pageNo;

    public ReqGetAuditOptionList(String processId) {
        this.processId = processId;
    }

    public String getProcessId() {
        return processId;
    }

    public ReqGetAuditOptionList setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    public String getHandler() {
        return handler;
    }

    public ReqGetAuditOptionList setHandler(String handler) {
        this.handler = handler;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ReqGetAuditOptionList setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ReqGetAuditOptionList setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
}
