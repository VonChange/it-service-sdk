package com.yonghui.it.service.express.model;

import java.util.Date;
import java.util.List;

public class VoTracePush {
    private String eBusinessID;
    private Date pushTime;
    private String count;
    private List<ItVoLogisticTrace> data;

    public String geteBusinessID() {
        return eBusinessID;
    }

    public void seteBusinessID(String eBusinessID) {
        this.eBusinessID = eBusinessID;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ItVoLogisticTrace> getData() {
        return data;
    }

    public void setData(List<ItVoLogisticTrace> data) {
        this.data = data;
    }
}