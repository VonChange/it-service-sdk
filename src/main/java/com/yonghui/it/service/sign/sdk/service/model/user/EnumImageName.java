package com.yonghui.it.service.sign.sdk.service.model.user;

public  enum  EnumImageName {
        defaultImage("default","未签署"),defaultA("defaultA","defaultA"),
        defaultB("defaultB","defaultB"),defaultC("defaultC","defaultC");
        //
        private String value;
        private String desc;
        EnumImageName(String value,String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumImageName getValue(String value) {
            for (EnumImageName c : EnumImageName.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public String getValue() {
            return value;
        }

        public EnumImageName setValue(String value) {
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