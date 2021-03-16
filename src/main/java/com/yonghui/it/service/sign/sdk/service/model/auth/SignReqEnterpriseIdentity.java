package com.yonghui.it.service.sign.sdk.service.model.auth;

public class SignReqEnterpriseIdentity {
    private String name;
    private String identity;
    private String legalPerson;
    /**
     *
     * @param name 企业名称
     * @param identity 工商注册号或统一社会信用代码，限中国大陆企业
     * @param legalPerson  法人代表姓名
     */
    public SignReqEnterpriseIdentity(String name,String identity,String legalPerson){
        this.name=name;
        this.identity=identity;
        this.legalPerson=legalPerson;
    }
    public String getName() {
        return name;
    }
    public String getIdentity() {
        return identity;
    }

    public String getLegalPerson() {
        return legalPerson;
    }
}
