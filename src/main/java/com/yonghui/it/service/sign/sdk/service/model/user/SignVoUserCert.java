package com.yonghui.it.service.sign.sdk.service.model.user;

public class SignVoUserCert {
    /**
     * 签署者ID
     */
    private String account;
    /**
     * 证书编号ID
     */
    private String certId;
    /**
     *证书编号
     */
    private String cert;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }
}
