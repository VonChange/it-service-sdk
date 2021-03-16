package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignReqUserApplyCertStatus {
    /**
     * 签署方ID
     */
    private String account;
    /**
     * 任务单号
     * 由异步申请数字证书接口返回得到，taskId在24小时内可用于查询
     */
    private String taskId;
    public SignReqUserApplyCertStatus(String account,String taskId){
        this.account=account;
        this.taskId=taskId;
    }

    public String getAccount() {
        return account;
    }



    public String getTaskId() {
        return taskId;
    }
}
