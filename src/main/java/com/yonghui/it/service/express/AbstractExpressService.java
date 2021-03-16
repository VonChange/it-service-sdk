package com.yonghui.it.service.express;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.model.AuthInfo;
import com.yonghui.it.service.common.service.BaseItService;
import com.yonghui.it.service.express.model.ItReqExpressBill;
import com.yonghui.it.service.express.model.ItReqLogisticTraceSub;
import com.yonghui.it.service.express.model.ItReqQueryLogisticTrace;
import com.yonghui.it.service.express.model.ItVoLogisticTrace;
import com.yonghui.it.service.express.model.ReqCallbackMsg;
import com.yonghui.it.service.express.model.VoExpressBill;
import com.yonghui.it.service.express.model.VoLogisticTraceSub;
import com.yonghui.it.service.express.model.VoTracePush;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractExpressService extends BaseItService {
    private static final Logger log = LoggerFactory.getLogger(AbstractExpressService.class);
    protected   String getServiceName(){
        return "express";
    }

    /**
     * 快递轨迹查询
     * @param itReqQueryLogisticTrace
     * @return
     * @throws ItServiceException
     */
    public YhResponse<ItVoLogisticTrace> queryLogisticTrace(ItReqQueryLogisticTrace itReqQueryLogisticTrace)  {
        try {
            return post(new TypeReference<YhResponse<ItVoLogisticTrace>>() {}, "queryLogisticTrace",itReqQueryLogisticTrace);
        } catch (ItServiceException e) {
            log.error("ItServiceException ",e);
            return YhResponse.error(e.getMsg());
        }
    }
    /**
     * 电子面单
     * @param itReqExpressBill
     * @return
     * @throws ItServiceException
     */
    public YhResponse<VoExpressBill> bill(ItReqExpressBill itReqExpressBill) throws ItServiceException {
        return  post(new TypeReference<YhResponse<VoExpressBill>>() {}, "expressBill",itReqExpressBill);
    }

    /**
     * 轨迹订阅
     * @param itReqLogisticTraceSub
     * @return
     * @throws ItServiceException
     */
    public YhResponse<VoLogisticTraceSub> traceSub(ItReqLogisticTraceSub itReqLogisticTraceSub) throws ItServiceException {
        return post(new TypeReference<YhResponse<VoLogisticTraceSub>>() {}, "traceSub",itReqLogisticTraceSub);
    }

    /**
     * 轨迹订阅回调信息查询
     * @param messageId
     * @return
     * @throws ItServiceException
     */
    public YhResponse<VoTracePush> traceCallback(String  messageId) throws ItServiceException {
        return get(new TypeReference<YhResponse<VoTracePush>>() {}, "traceCallback",new ReqCallbackMsg(messageId));
    }



    /**
     * 快递轨迹查询可分账户
     * @param itReqQueryLogisticTrace
     * @return
     * @throws ItServiceException
     */
    public YhResponse<ItVoLogisticTrace> queryLogisticTrace(AuthInfo authInfo, ItReqQueryLogisticTrace itReqQueryLogisticTrace)  {
        try {
            return post(authInfo,new TypeReference<YhResponse<ItVoLogisticTrace>>() {}, "queryLogisticTrace",itReqQueryLogisticTrace);
        } catch (ItServiceException e) {
            log.error("ItServiceException ",e);
            return YhResponse.error(e.getMsg());
        }
    }



}
