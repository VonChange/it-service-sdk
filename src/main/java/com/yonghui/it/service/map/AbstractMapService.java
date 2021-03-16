package com.yonghui.it.service.map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonghui.it.service.common.exception.ItServiceException;
import com.yonghui.it.service.common.service.BaseItService;
import com.yonghui.it.service.map.model.ItReqGeocoder;
import com.yonghui.it.service.map.model.ItVoGeocoder;
import com.yonghui.it.service.map.model.ReqGeocoderAddress;
import com.yonghui.it.service.map.model.VoGeocoderAddress;
import com.yonghui.it.service.sign.sdk.domain.YhResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractMapService extends BaseItService {
    private static final Logger log = LoggerFactory.getLogger(AbstractMapService.class);
    protected   String getServiceName(){
        return "map";
    }


    public YhResponse<ItVoGeocoder> geocoder(ItReqGeocoder itReqGeocoder) throws ItServiceException {

        return get(new TypeReference<YhResponse<ItVoGeocoder>>() {}, "geocoder",itReqGeocoder);
    }

    public YhResponse<VoGeocoderAddress> geocoderAddress(ReqGeocoderAddress reqGeocoderAddress) throws ItServiceException {

        return get(new TypeReference<YhResponse<VoGeocoderAddress>>() {}, "geocoderAddress",reqGeocoderAddress);
    }
}
