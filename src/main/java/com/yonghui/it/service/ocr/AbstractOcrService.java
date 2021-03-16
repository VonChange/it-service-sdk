package com.yonghui.it.service.ocr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.service.BaseItService;
import com.yonghui.it.service.ocr.model.ItReqOcrCommon;
import com.yonghui.it.service.ocr.model.ItReqOcrIDCard;
import com.yonghui.it.service.ocr.model.ItVoBankCardOCR;
import com.yonghui.it.service.ocr.model.ItVoIDCardOCR;
import com.yonghui.it.service.ocr.model.ItVoLicenseOCR;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import com.yonghui.it.service.sign.sdk.util.map.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractOcrService extends BaseItService {
    private static final Logger log = LoggerFactory.getLogger(AbstractOcrService.class);
    protected   String getServiceName(){
        return "ocr";
    }


    public YhResponse<ItVoLicenseOCR> licenseOCR(ItReqOcrCommon itReqOcrCommon) throws ItServiceException {
            return post(new TypeReference<YhResponse<ItVoLicenseOCR>>() {},
                    "ImageScan",new HashMap<String,String>().set("type","BizLicenseOCR"),itReqOcrCommon);
    }

    public YhResponse<ItVoBankCardOCR> bankCardOCR(ItReqOcrCommon itReqOcrCommon) throws ItServiceException {
        return post(new TypeReference<YhResponse<ItVoBankCardOCR>>() {},
                "ImageScan",new HashMap<String,String>().set("type","BankCardOCR"),itReqOcrCommon);
    }


    public YhResponse<ItVoIDCardOCR> idCardOCR(ItReqOcrIDCard itReqOcrIDCard) throws ItServiceException {
        return post(new TypeReference<YhResponse<ItVoIDCardOCR>>() {},
                "ImageScan",new HashMap<String,String>().set("type","IDCardOCR"),itReqOcrIDCard);
    }

}
