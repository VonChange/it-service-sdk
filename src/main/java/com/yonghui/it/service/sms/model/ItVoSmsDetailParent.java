package com.yonghui.it.service.sms.model;

import java.util.List;

public class ItVoSmsDetailParent {
      private List<ItVoSmsDetail> smsSendDetails;

    public List<ItVoSmsDetail> getSmsSendDetails() {
        return smsSendDetails;
    }

    public void setSmsSendDetails(List<ItVoSmsDetail> smsSendDetails) {
        this.smsSendDetails = smsSendDetails;
    }
}
