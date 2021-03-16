package com.yonghui.it.service.lbpm.model;

public class ReqRefuse extends ReqApproveBase{
    //驳回目标的节点编号(来源:接口 2.11 GetOperationParam 返回值中操作参数 refuseNodeList
    //的 id)
    private String jumpToNodeId;
    //驳回通过后是否直接返回本节点
    private Boolean refusePassedToThisNode;

    public ReqRefuse(String processId, String handler, String auditNote, String jumpToNodeId, Boolean refusePassedToThisNode) {
        super(processId, handler, auditNote);
        this.jumpToNodeId = jumpToNodeId;
        this.refusePassedToThisNode = refusePassedToThisNode;
    }

    public String getJumpToNodeId() {
        return jumpToNodeId;
    }

    public void setJumpToNodeId(String jumpToNodeId) {
        this.jumpToNodeId = jumpToNodeId;
    }

    public Boolean getRefusePassedToThisNode() {
        return refusePassedToThisNode;
    }

    public void setRefusePassedToThisNode(Boolean refusePassedToThisNode) {
        this.refusePassedToThisNode = refusePassedToThisNode;
    }
}