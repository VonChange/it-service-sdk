package com.yonghui.it.service.sign.sdk.service.model;

import java.util.Date;

public class Auth {
    private String uid;
    private String skey;
    private Date putTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }

    public Date getPutTime() {
        return putTime;
    }

    public void setPutTime(Date putTime) {
        this.putTime = putTime;
    }
}
