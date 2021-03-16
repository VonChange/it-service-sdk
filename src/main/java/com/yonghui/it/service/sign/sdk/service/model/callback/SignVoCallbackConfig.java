package com.yonghui.it.service.sign.sdk.service.model.callback;

import java.util.Date;

public class SignVoCallbackConfig {
    /**
     * 服务平台开发者ID
     */
    private String userId;
    /**
     * 回调url
     */
    private String url;
    private Date createTime;
    private Date updateTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}