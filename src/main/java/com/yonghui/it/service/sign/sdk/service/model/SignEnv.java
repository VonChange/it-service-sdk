package com.yonghui.it.service.sign.sdk.service.model;

import com.yonghui.it.service.sign.sdk.exception.SignRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum SignEnv {
    dev("dev","开发环境"),
    test("test","测试环境"),
    prod("prod","正式环境");
    private static final Logger log = LoggerFactory.getLogger(SignEnv.class);
    // 成员变量
    private String env;
    private String desc;


    // 构造方法
    SignEnv(String env, String desc) {
        this.env=env;
        this.desc = desc;
    }

    public static SignEnv getByEnv(String  env) {
        for (SignEnv c : SignEnv.values()) {
            if (c.getEnv() .equals(env)) {
                return c;
            }
        }
        throw new SignRuntimeException("环境参数配置错误");
       // return null;
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
