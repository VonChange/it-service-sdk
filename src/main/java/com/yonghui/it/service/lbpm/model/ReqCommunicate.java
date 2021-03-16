package com.yonghui.it.service.lbpm.model;

import com.yonghui.it.service.annotion.SDKProperty;

import java.util.List;

public class ReqCommunicate extends ReqApproveBase{
    @SDKProperty("被沟通人")
    private List<String> toOtherHandlerIds;
    @SDKProperty("是否允许多级沟通 空 默认true")
    private Boolean isMutiCommunicate;
    @SDKProperty("限制子级\n" +
            "沟通范围(只能限定沟通人员和岗位)，为空则不限定范围")
    private  List<String> communicateScopeHandlerIds;
    @SDKProperty("是否隐藏沟通意见 空 默认false")
    private  Boolean isHiddenNote;

    public ReqCommunicate(String processId, String handler, String auditNote, List<String> toOtherHandlerIds) {
        super(processId, handler, auditNote);
        this.toOtherHandlerIds = toOtherHandlerIds;
    }

    public List<String> getToOtherHandlerIds() {
        return toOtherHandlerIds;
    }

    public ReqCommunicate setToOtherHandlerIds(List<String> toOtherHandlerIds) {
        this.toOtherHandlerIds = toOtherHandlerIds;
        return this;
    }

    public Boolean getMutiCommunicate() {
        return isMutiCommunicate;
    }

    public ReqCommunicate setMutiCommunicate(Boolean mutiCommunicate) {
        isMutiCommunicate = mutiCommunicate;
        return this;
    }

    public List<String> getCommunicateScopeHandlerIds() {
        return communicateScopeHandlerIds;
    }

    public ReqCommunicate setCommunicateScopeHandlerIds(List<String> communicateScopeHandlerIds) {
        this.communicateScopeHandlerIds = communicateScopeHandlerIds;
        return this;
    }

    public Boolean getHiddenNote() {
        return isHiddenNote;
    }

    public ReqCommunicate setHiddenNote(Boolean hiddenNote) {
        isHiddenNote = hiddenNote;
        return this;
    }
}