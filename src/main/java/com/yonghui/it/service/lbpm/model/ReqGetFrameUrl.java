package com.yonghui.it.service.lbpm.model;

public class ReqGetFrameUrl {
    private String processId;
    private String userCode;
    private LbpmUrlType type;
    private String version;

    public ReqGetFrameUrl(String processId) {
        this.processId = processId;
    }

    public String getProcessId() {
        return processId;
    }

    public ReqGetFrameUrl setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    public String getUserCode() {
        return userCode;
    }

    public ReqGetFrameUrl setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }

    public LbpmUrlType getType() {
        return type;
    }

    public ReqGetFrameUrl setType(LbpmUrlType type) {
        this.type = type;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ReqGetFrameUrl setVersion(String version) {
        this.version = version;
        return this;
    }
}
