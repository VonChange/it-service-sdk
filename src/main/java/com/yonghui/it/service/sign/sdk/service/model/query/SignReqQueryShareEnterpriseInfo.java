package com.yonghui.it.service.sign.sdk.service.model.query;

public class SignReqQueryShareEnterpriseInfo {
    //String name,String regCode,String companyCode
    private String name;
    private String regCode;
    private String companyCode;

    public String getName() {
        return name;
    }

    public SignReqQueryShareEnterpriseInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getRegCode() {
        return regCode;
    }

    public SignReqQueryShareEnterpriseInfo setRegCode(String regCode) {
        this.regCode = regCode;
        return this;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public SignReqQueryShareEnterpriseInfo setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
}
