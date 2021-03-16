package com.yonghui.it.service.sms.model;

public class ItReqSmsQuerySendDetails {
    private String requestId;
    private String phoneNumber;
    private String sendDate;

    public ItReqSmsQuerySendDetails(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public ItReqSmsQuerySendDetails setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ItReqSmsQuerySendDetails setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getSendDate() {
        return sendDate;

    }

    public ItReqSmsQuerySendDetails setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
}
