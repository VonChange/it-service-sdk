package com.yonghui.it.service.sign.sdk.service.model.contract;

import java.util.List;

public class SignVoDalayExpireTime {
    private List<VoMessage> successed;
    private List<VoMessage> failed;

    public List<VoMessage> getSuccessed() {
        return successed;
    }

    public void setSuccessed(List<VoMessage> successed) {
        this.successed = successed;
    }

    public List<VoMessage> getFailed() {
        return failed;
    }

    public void setFailed(List<VoMessage> failed) {
        this.failed = failed;
    }
}
