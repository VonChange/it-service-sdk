package com.yonghui.it.service.ocr.model;

public  enum EnumCardSide {
        FRONT("FRONT","身份证有照片的一面（人像面）"),BACK("BACK","身份证有国徽的一面（国徽面）");

        private String value;
        private String desc;
        EnumCardSide(String value, String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumCardSide getValue(String value) {
            for (EnumCardSide c : EnumCardSide.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public String getValue() {
            return value;
        }

        public EnumCardSide setValue(String value) {
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