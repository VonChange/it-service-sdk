package com.yonghui.it.service.sign.sdk.service.model.user;

public  enum EnumIdentityType {
        sfz("0","居民身份证"),hz("1","护照"),gangAo("B","港澳居民往来内地通行证"),
        taiwan("C","台湾居民来往大陆通行证"),huKou("E","户口簿"),lsSfz("F","临时居民身份证");
        //
        private String value;
        private String desc;
        EnumIdentityType(String value, String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumIdentityType getValue(String value) {
            for (EnumIdentityType c : EnumIdentityType.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public String getValue() {
            return value;
        }

        public EnumIdentityType setValue(String value) {
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