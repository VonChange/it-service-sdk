package com.yonghui.it.service.sign.sdk.service.model.contract;

import java.util.List;

public class SignVoContractInfo {
    /**
     * 合同ID
     */
    private String contractId;
    /**
     * 文件编号
     */
    private String fid;
    /**
     * 用户id 即创建者的account在上上签系统内的用户id
     */
    private String userId;
    /**
     * 创建者的account
     */
    private String senderAccount;
    /**
     * 合同描述
     */
    private String description;
    /**
     * 合同签署的到期时间 Unix时间戳（秒数），格式：1490976000
     */
    private Long expireTime;
    /**
     * 标题
     */
    private String title;
    /**
     * 合同的发送时间
     * 添加第一个签署者的时间，当第一个签署者添加成功即认为合同已发送
     */
    private String sendTime;
    /**
     * 合同的完成时间 调用锁定合同接口之后结束合同的时间
     */
    private String finishTime;
    /**
     * 合同签署者account集合. json array形式。
     * "signers": [“mlimd@163.com” ]
     */
    private List<String> signers;
    /**
     * 开发者编号
     */
    private String developerId;
    /**
     * 合同页数
     */
    private Integer pages;
    /**
     *
     * 合同状态
     * 2：已创建；3：已发送，正在签署中；4：拒绝签署,已取消；5：已完成；9：已过期；
     */
    private Integer status;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public List<String> getSigners() {
        return signers;
    }

    public void setSigners(List<String> signers) {
        this.signers = signers;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getStatus() {
        return status;
    }
    public EnumStatus getStatuseEnum() {
        return EnumStatus.getValue(status);
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public  enum  EnumStatus {
        created(2,"已创建"),signing(3,"已发送"),cancel(4,"拒绝签署,已取消"),end(5,"已完成"),expire(9,"已过期");
        //2：已创建；3：已发送，正在签署中；4：拒绝签署,已取消；5：已完成；9：已过期；
        private Integer value;
        private String desc;
        EnumStatus(Integer value,String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumStatus getValue(Integer value) {
            for (EnumStatus c : EnumStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public Integer getValue() {
            return value;
        }

        public EnumStatus setValue(int value) {
            this.value = value;
            return this;

        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
