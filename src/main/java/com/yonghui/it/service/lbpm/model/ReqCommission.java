package com.yonghui.it.service.lbpm.model;

import java.util.List;

public class ReqCommission extends ReqApproveBase{
    private List<String> toOtherHandlerIds;

    public ReqCommission(String processId, String handler, String auditNote, List<String> toOtherHandlerIds) {
        super(processId, handler, auditNote);
        this.toOtherHandlerIds = toOtherHandlerIds;
    }

    public List<String> getToOtherHandlerIds() {
        return toOtherHandlerIds;
    }

    public void setToOtherHandlerIds(List<String> toOtherHandlerIds) {
        this.toOtherHandlerIds = toOtherHandlerIds;
    }
}