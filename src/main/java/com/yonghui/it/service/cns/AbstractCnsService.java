package com.yonghui.it.service.cns;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.service.BaseItService;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sms.model.ItReqSmsIndustrial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractCnsService extends BaseItService {

        private static final Logger log = LoggerFactory.getLogger(AbstractCnsService.class);
        protected   String getServiceName(){
              return "cns";
        }


    /**
     * 测试接口
     * @param itReqSmsIndustrial
     * @return
     * @throws ItServiceException
     */
        public YhResponse<String> sendNotice(ItReqSmsIndustrial itReqSmsIndustrial) throws ItServiceException {

              return post(new TypeReference<YhResponse<String>>() {}, "sendNotice",itReqSmsIndustrial);
        }
}