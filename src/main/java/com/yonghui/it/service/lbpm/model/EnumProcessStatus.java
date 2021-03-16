package com.yonghui.it.service.lbpm.model;

public enum EnumProcessStatus {
    CREATED("10","CREATED","草稿"),ACTIVATED("20","ACTIVATED","流转中"),
    REFUSE("11","REFUSE","驳回"),RETURN("12","RETURN","撤回"),
    ABANDON("00","ABANDON","废弃"),
    ERROR("21","ERROR","流程出错"),COMPLETED("30","COMPLETED","完成");
    private String value;
    private String code;
    private String desc;

    EnumProcessStatus(String value, String code, String desc) {
        this.value = value;
        this.code = code;
        this.desc = desc;
    }

    public static EnumProcessStatus getByValue(String  env) {
        for (EnumProcessStatus c : EnumProcessStatus.values()) {
            if (c.getValue() .equals(env)) {
                return c;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
