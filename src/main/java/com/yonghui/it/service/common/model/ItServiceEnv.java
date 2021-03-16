package com.yonghui.it.service.common.model;


import com.yonghui.it.service.common.exception.ItServiceRuntimeException;

public enum ItServiceEnv {
    dev("dev","开发环境"),
    test("test","测试环境"),
    prod("prod","正式环境");

    // 成员变量
    private String env;
    private String desc;


    // 构造方法
    ItServiceEnv(String env, String desc) {
        this.env=env;
        this.desc = desc;
    }

    public static ItServiceEnv getByEnv(String  env) {
        for (ItServiceEnv c : ItServiceEnv.values()) {
            if (c.getEnv() .equals(env)) {
                return c;
            }
        }
        throw new ItServiceRuntimeException("环境参数配置错误");
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
