package com.yonghui.it.service.lbpm.model;

import java.util.List;

public class ReqCancelCommunicate extends ReqApproveBase{
    private List<String> cancelHandlerIds;

    public ReqCancelCommunicate(String processId, String handler, String auditNote, List<String> cancelHandlerIds) {
        super(processId, handler, auditNote);
        this.cancelHandlerIds = cancelHandlerIds;
    }

    public List<String> getCancelHandlerIds() {
        return cancelHandlerIds;
    }

    public void setCancelHandlerIds(List<String> cancelHandlerIds) {
        this.cancelHandlerIds = cancelHandlerIds;
    }
}