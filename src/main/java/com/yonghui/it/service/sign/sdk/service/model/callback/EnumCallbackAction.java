package com.yonghui.it.service.sign.sdk.service.model.callback;

public  enum EnumCallbackAction {
        certApply("certApply","证书回调"),
        signContract("signContract","手动签署合同回调"),
        test("test","测试接口的有效性");
        //
        private String value;
        private String desc;
        EnumCallbackAction(String value, String desc){
            this.value=value;
            this.desc=desc;
        }
        public static EnumCallbackAction getValue(String value) {
            for (EnumCallbackAction c : EnumCallbackAction.values()) {
                if (c.getValue().equals(value)) {
                    return c;
                }
            }
            return null;
        }
        public String getValue() {
            return value;
        }

        public EnumCallbackAction setValue(String value) {
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