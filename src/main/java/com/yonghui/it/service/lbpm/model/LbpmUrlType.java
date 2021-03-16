package com.yonghui.it.service.lbpm.model;

public enum LbpmUrlType {
    showProcess("showProcess", "审批页面"),
    showChart("showChart", "流程图页面");

    LbpmUrlType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    // 成员变量
    private String type;
    private String desc;
    public static LbpmUrlType getByType(String  type) {
        for (LbpmUrlType c : LbpmUrlType.values()) {
            if (c.getType() .equals(type)) {
                return c;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}