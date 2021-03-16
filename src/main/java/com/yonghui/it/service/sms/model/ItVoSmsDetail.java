package com.yonghui.it.service.sms.model;

public class ItVoSmsDetail {

      private  String requestId;
      private String customId;
      private Integer sendStatus;
      private String receiveDate;
      private String errorCode;
      private String content;
      private String phoneNumber;
      private String  sign;
      private EnumSmsSendStatus enumSendStatus;

      public String getRequestId() {
            return requestId;
      }

      public void setRequestId(String requestId) {
            this.requestId = requestId;
      }

      public String getCustomId() {
            return customId;
      }

      public void setCustomId(String customId) {
            this.customId = customId;
      }

      public Integer getSendStatus() {
            return sendStatus;
      }

      public void setSendStatus(Integer sendStatus) {
            this.sendStatus = sendStatus;
            this.setEnumSendStatus(EnumSmsSendStatus.getValue(sendStatus));
      }

      public String getReceiveDate() {
            return receiveDate;
      }

      public void setReceiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
      }

      public String getErrorCode() {
            return errorCode;
      }

      public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
      }

      public String getContent() {
            return content;
      }

      public void setContent(String content) {
            this.content = content;
      }

      public String getPhoneNumber() {
            return phoneNumber;
      }

      public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
      }

      public String getSign() {
            return sign;
      }

      public void setSign(String sign) {
            this.sign = sign;
      }

      public EnumSmsSendStatus getEnumSendStatus() {
            return enumSendStatus;
      }

      public void setEnumSendStatus(EnumSmsSendStatus enumSendStatus) {
            this.enumSendStatus = enumSendStatus;
      }
}
