package com.yonghui.it.service.sign.sdk.service.model.contract;

public  enum  EnumDpi {
        lowDpi(96,"低清（默认）"),normalDpi(120,"普清"),highDpi(160,"高清"),superDpi(240,"超清");
        //
        private Integer value;
        private String desc;
        EnumDpi(Integer value,String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumDpi getValue(Integer value) {
            for (EnumDpi c : EnumDpi.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public Integer getValue() {
            return value;
        }

        public EnumDpi setValue(int value) {
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