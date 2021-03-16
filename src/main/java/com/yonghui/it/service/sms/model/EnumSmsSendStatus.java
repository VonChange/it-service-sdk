package com.yonghui.it.service.sms.model;

public  enum EnumSmsSendStatus {
       success(0,"发送成功"),fail(1,"发送失败"),waiting(2,"还未有回执状态");

        private Integer value;
        private String desc;
        EnumSmsSendStatus(Integer value, String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumSmsSendStatus getValue(Integer value) {
            for (EnumSmsSendStatus c : EnumSmsSendStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public Integer getValue() {
            return value;
        }

        public EnumSmsSendStatus setValue(int value) {
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