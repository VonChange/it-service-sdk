package com.yonghui.it.service.sign.sdk.service.model.contract;

public class SignVoContractSignerStatus {
    private  String account;
    /**
     * 1 － 未签署; 2 - 已签署。
     */
    private  Integer status;
    public SignVoContractSignerStatus(String account,Integer status){
        this.account=account;
        this.status=status;
    }

    public String getAccount() {
        return account;
    }

    public Integer getStatus() {
        return status;
    }
    public EnumStatus getStatusEnum() {
        return EnumStatus.getValue(status);
    }

    public  enum  EnumStatus {
        unSign(1,"未签署"),signed(2,"已签署");
        //
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
