package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignVoUserReg {
    /**
     * 异步申请证书队列中的任务编号，在24小时内可用于查询异步申请状态，taskId过24小时后就失效
     */
    private String taskId;
    private String account;

    public String getTaskId() {
        return taskId;
    }

    public String getAccount() {
        return account;
    }
}
