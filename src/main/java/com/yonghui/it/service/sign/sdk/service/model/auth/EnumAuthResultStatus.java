package com.yonghui.it.service.sign.sdk.service.model.auth;

public  enum EnumAuthResultStatus {
       pass(1,"通过"),noPass(0,"未通过");

        private Integer value;
        private String desc;
        EnumAuthResultStatus(Integer value, String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumAuthResultStatus getValue(Integer value) {
            for (EnumAuthResultStatus c : EnumAuthResultStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public Integer getValue() {
            return value;
        }

        public EnumAuthResultStatus setValue(int value) {
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