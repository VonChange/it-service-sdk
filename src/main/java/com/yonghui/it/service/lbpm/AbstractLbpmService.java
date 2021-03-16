package com.yonghui.it.service.lbpm;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.service.BaseItService;
import com.yonghui.it.service.lbpm.model.AuditOption;
import com.yonghui.it.service.lbpm.model.FlowLog;
import com.yonghui.it.service.lbpm.model.LbpmPage;
import com.yonghui.it.service.lbpm.model.ReqAdminBase;
import com.yonghui.it.service.lbpm.model.ReqApproveBase;
import com.yonghui.it.service.lbpm.model.ReqCancelCommunicate;
import com.yonghui.it.service.lbpm.model.ReqCommission;
import com.yonghui.it.service.lbpm.model.ReqCommunicate;
import com.yonghui.it.service.lbpm.model.ReqCreateProcess;
import com.yonghui.it.service.lbpm.model.ReqDrafterBase;
import com.yonghui.it.service.lbpm.model.ReqDrafterSubmit;
import com.yonghui.it.service.lbpm.model.ReqFrameApprove;
import com.yonghui.it.service.lbpm.model.ReqGetAuditOptionList;
import com.yonghui.it.service.lbpm.model.ReqGetFlowLogList;
import com.yonghui.it.service.lbpm.model.ReqGetFrameUrl;
import com.yonghui.it.service.lbpm.model.ReqRefuse;
import com.yonghui.it.service.lbpm.model.ReqUpdateFormData;
import com.yonghui.it.service.lbpm.model.ResponseCreateProcess;
import com.yonghui.it.service.lbpm.model.ResponseHandler;
import com.yonghui.it.service.lbpm.model.ResponseNode;
import com.yonghui.it.service.lbpm.model.ResponseNodeInfo;
import com.yonghui.it.service.lbpm.model.ResponseOperation;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sign.sdk.util.map.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract  class AbstractLbpmService extends BaseItService {
    private static final Logger log = LoggerFactory.getLogger(AbstractLbpmService.class);
    protected   String getServiceName(){
        return "lbpm";
    }

    /**
     * 创建流程
     * @param reqCreateProcess
     * @return
     * @throws ItServiceException
     */
    public YhResponse<ResponseCreateProcess> createProcess(ReqCreateProcess reqCreateProcess) throws ItServiceException {
        return post(new TypeReference<YhResponse<ResponseCreateProcess>>() {}, "createProcess",reqCreateProcess);
    }

    /**
     * 起草人起草
     * @param reqDrafterSubmit
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> drafterSubmit(ReqDrafterSubmit reqDrafterSubmit) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "drafterSubmit",reqDrafterSubmit);
    }
    /**
     * 起草人撤回
     * @param reqDrafterBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> drafterReturn(ReqDrafterBase reqDrafterBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "drafterReturn",reqDrafterBase);
    }


    /**
     * 起草人废弃
     * @param reqDrafterBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> drafterAbandon(ReqDrafterBase reqDrafterBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "drafterAbandon",reqDrafterBase);
    }

    /**
     * 起草人催办
     * @param reqDrafterBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> drafterPress(ReqDrafterBase reqDrafterBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "drafterPress",reqDrafterBase);
    }


    /**
     * 处理人通过
     * @param reqApproveBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> handlerPass(ReqApproveBase reqApproveBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "handlerPass",reqApproveBase);
    }


    public YhResponse<String> handlerAbandon(ReqApproveBase reqApproveBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "handlerAbandon",reqApproveBase);
    }


    /**
     * 处理人驳回
     * @param reqRefuse
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> handlerRefuse(ReqRefuse reqRefuse) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "handlerRefuse",reqRefuse);
    }

    /**
     * 处理人转办
     * @param reqCommission
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> handlerCommission(ReqCommission reqCommission) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "handlerCommission",reqCommission);
    }

    /**
     * 特权人废弃-废弃操作
     * @param reqAdminBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> adminAbandon(ReqAdminBase reqAdminBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "adminAbandon",reqAdminBase);
    }

    /**
     * 已处理人 – 撤回审批操作
     * @param reqApproveBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> historyHandlerBack(ReqApproveBase reqApproveBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "historyHandlerAddOpinion",reqApproveBase);
    }
    /**
     * 已处理人 – 追加意见操作
     * @param reqApproveBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> historyHandlerAddOpinion(ReqApproveBase reqApproveBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "historyHandlerAddOpinion",reqApproveBase);
    }


    /**
     * 处理人沟通
     * @param reqCommunicate
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> handlerCommunicate(ReqCommunicate reqCommunicate) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "handlerCommunicate",reqCommunicate);
    }

    /**
     * 处理人取消沟通
     * @param reqCancelCommunicate
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> handlerCancelCommunicate(ReqCancelCommunicate reqCancelCommunicate) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "handlerCancelCommunicate",reqCancelCommunicate);
    }

    /**
     * 处理人回复沟通
     * @param reqApproveBase
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> handlerReturnCommunicate(ReqApproveBase reqApproveBase) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "handlerReturnCommunicate",reqApproveBase);
    }


    /**
     * 特权人重试
     * @param processId
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> adminRetry(String  processId) throws ItServiceException {

        return get(new TypeReference<YhResponse<String>>() {}, "handlerCommunicate",new HashMap<String,String>()
                .set("processId",processId));
    }


    /**
     * 获取当前用户的操作集
     * @param processId
     * @param handler
     * @return
     * @throws ItServiceException
     */
    public YhResponse<List<ResponseOperation>> getOperationList(String processId,String handler) throws ItServiceException {
        return get(new TypeReference<YhResponse<List<ResponseOperation>>>() {}, "getOperationList",new HashMap<String,String>()
                .set("processId",processId).set("handler",handler));
    }

    /**
     * 获取当前节点信息
     * @param processId
     * @return
     * @throws ItServiceException
     */
    public YhResponse<List<ResponseNodeInfo>> getCurrentNodesInfo(String processId) throws ItServiceException {
        return get(new TypeReference<YhResponse<List<ResponseNodeInfo>>>() {}, "getCurrentNodesInfo",new HashMap<String,String>()
                .set("processId",processId));
    }

    /**
     * 获取当前处理人列表
     * @param processId
     * @return
     * @throws ItServiceException
     */
    public YhResponse<List<ResponseHandler>> getApproverList(String processId) throws ItServiceException {
        return get(new TypeReference<YhResponse<List<ResponseHandler>>>() {}, "getApproverList",new HashMap<String,String>()
                .set("processId",processId));
    }

    /**
     * 获取审批记录
     * @param reqGetAuditOptionList
     * @return
     * @throws ItServiceException
     */
    public YhResponse<LbpmPage<AuditOption>> getAuditOptionList(ReqGetAuditOptionList reqGetAuditOptionList) throws ItServiceException {
        return get(new TypeReference<YhResponse<LbpmPage<AuditOption>>>() {}, "getAuditOptionList",reqGetAuditOptionList);
    }


    /**
     * 获取流程记录
     * @param reqGetFlowLogList
     * @return
     * @throws ItServiceException
     */
    public YhResponse<LbpmPage<FlowLog>> getFlowLogList(ReqGetFlowLogList reqGetFlowLogList) throws ItServiceException {
        return get(new TypeReference<YhResponse<LbpmPage<FlowLog>>>() {}, "getFlowLogList",reqGetFlowLogList);
    }

    /**
     * 获取可驳回节点列表
     * @param processId
     * @param handler
     * @return
     * @throws ItServiceException
     */
    public YhResponse<List<ResponseNode>> refuseNodeList(String processId,String handler) throws ItServiceException {
        return get(new TypeReference<YhResponse<List<ResponseNode>>>() {}, "refuseNodeList",new HashMap<String,String>()
                .set("processId",processId).set("handler",handler));
    }

    /**
     * 获取当前嵌入式页面url
     * @param reqGetFrameUrl
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> getFrameUrl(ReqGetFrameUrl reqGetFrameUrl) throws ItServiceException {
        return get(new TypeReference<YhResponse<String>>() {}, "getFrameUrl",reqGetFrameUrl);
    }


    /**
     * 嵌入式页面审批提交
     * @param reqFrameApprove
     * @return
     * @throws ItServiceException
     */
    public YhResponse<String> frameApprove(ReqFrameApprove reqFrameApprove) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "frameApprove",reqFrameApprove);
    }

    public YhResponse<String> updateFormValue(ReqUpdateFormData reqUpdateFormData) throws ItServiceException {
        return post(new TypeReference<YhResponse<String>>() {}, "updateFormValue",reqUpdateFormData);
    }
}
