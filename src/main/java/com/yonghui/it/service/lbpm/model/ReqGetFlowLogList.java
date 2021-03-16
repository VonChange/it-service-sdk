package com.yonghui.it.service.lbpm.model;

public class ReqGetFlowLogList {

    private String processId;
    private Integer pageSize;
    private Integer pageNo;

    public ReqGetFlowLogList(String processId) {
        this.processId = processId;
    }

    public String getProcessId() {
        return processId;
    }

    public ReqGetFlowLogList setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ReqGetFlowLogList setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ReqGetFlowLogList setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
}
