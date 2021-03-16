package com.yonghui.it.service.sms;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.model.AuthInfo;
import com.yonghui.it.service.common.service.BaseItService;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sms.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractSmsService extends BaseItService {

        private static final Logger log = LoggerFactory.getLogger(AbstractSmsService.class);
        protected   String getServiceName(){
              return "sms";
        }


    /**
     * 行业短信接口
     * @param itReqSmsIndustrial
     * @return
     * @throws ItServiceException
     */
        public YhResponse<ItVoSmsIndustrial> industrial(ItReqSmsIndustrial itReqSmsIndustrial) throws ItServiceException {

              return post(new TypeReference<YhResponse<ItVoSmsIndustrial>>() {}, "industrial",itReqSmsIndustrial);
        }

    public YhResponse<ItVoSmsIndustrial> industrial(AuthInfo authInfo,ItReqSmsIndustrial itReqSmsIndustrial) throws ItServiceException {

        return post(authInfo,new TypeReference<YhResponse<ItVoSmsIndustrial>>() {}, "industrial",itReqSmsIndustrial);
    }

    /**
     * 营销短信接口
     * @param itReqSmsMarket
     * @return
     * @throws ItServiceException
     */
    public YhResponse<ItVoSmsResult> market(ItReqSmsMarket itReqSmsMarket) throws ItServiceException {

           return post(new TypeReference<YhResponse<ItVoSmsResult>>() {}, "market",itReqSmsMarket);
    }

    public YhResponse<ItVoSmsResult> market(AuthInfo authInfo,ItReqSmsMarket itReqSmsMarket) throws ItServiceException {
        return post(authInfo,new TypeReference<YhResponse<ItVoSmsResult>>() {}, "market",itReqSmsMarket);
    }

    /**
     * 语音验证码接口
     * @param itReqSmsVoice
     * @return
     * @throws ItServiceException
     */
     public YhResponse<ItVoSmsResult> voiceValid(ItReqSmsVoice itReqSmsVoice) throws ItServiceException {

        return post(new TypeReference<YhResponse<ItVoSmsResult>>() {}, "voice",itReqSmsVoice);
       }

      public YhResponse<ItVoSmsResult> voiceNotify(ItReqSmsVoiceNotify itReqSmsVoiceNotify) throws ItServiceException {
        return post(new TypeReference<YhResponse<ItVoSmsResult>>() {}, "voiceNotify",itReqSmsVoiceNotify);
      }

      public YhResponse<ItVoSmsDetailParent> querySendDetails(ItReqSmsQuerySendDetails itReqSmsQuerySendDetails) throws ItServiceException {
          return get(new TypeReference<YhResponse<ItVoSmsDetailParent>>() {}, "querySendDetails",itReqSmsQuerySendDetails);
      }



}
