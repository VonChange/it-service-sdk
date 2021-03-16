package com.yonghui.it.service.sign.sdk.service.model.callback;

public  enum EnumSignerCallbackStatus {
        signing(1,"正在进行中"),signed(2,"已完成"),cancel(3,"已拒绝并取消");
        private Integer value;
        private String desc;
        EnumSignerCallbackStatus(Integer value, String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumSignerCallbackStatus getValue(Integer value) {
            for (EnumSignerCallbackStatus c : EnumSignerCallbackStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public Integer getValue() {
            return value;
        }

        public EnumSignerCallbackStatus setValue(int value) {
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