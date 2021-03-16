package com.yonghui.it.service.ocr.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class ItVoIDCardOCR extends ItVoOcrError{
    @SDKProperty( "姓名（人像面）")
    private String name;

    private String sex;

    private String nation;

    private String birth;

    private String address;

    private String idNum;

    private String authority;

    private String validDate;

    private String advancedInfo;

    private String requestId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getAdvancedInfo() {
        return advancedInfo;
    }

    public void setAdvancedInfo(String advancedInfo) {
        this.advancedInfo = advancedInfo;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
