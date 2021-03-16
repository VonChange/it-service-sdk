package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.service.model.user.EnumImageName;

public class SignReqContractAutoSign {
    /**
     * 合同ID
     */
    private String contractId;
    /**
     * 签章者ID
     */
    private String signer;
    /**
     * 签名/印章图片。企业用户可以指定上传过的印章图片中的某一张作为本次签署的印章图片，取“上传用户签名/印章图片”接口设置的
     */
    private String signatureImageName;
    /**
     * 用户指定的签名图片，Base64字符串。允许为空，
     * 为空时使用用户默认的签名图片。
     * 使用自动签的用户，可直接在此提供签名/印章图片即可。
     */
    private String signatureImageData;
    /**
     * 本次签署使用的签名/印章图片在合同PDF上显示的宽度，72dpi下的磅值。
     * 如果指定位置上没有设置签名图片的宽度和高度，那么按照如下默认值处理：
     * 个人签名：默认高度：48磅，最大宽度：130磅，宽度一般小于等于130磅。
     * 企业印章：默认宽度：130磅，默认高度：130磅。
     */
    private String signatureImageWidth;
    /**
     * 本次签署使用的签名/印章图片在合同PDF上显示的高度，72dpi下的磅值。
     * 如果指定位置上没有设置签名图片的宽度和高度，那么按照如下默认值处理：
     * 个人签名：默认高度：48磅，最大宽度：130磅，宽度一般小于等于130磅。
     * 企业印章：默认宽度：130磅，默认高度：130磅。
     */
    private String signatureImageHeight;
    /**
     * 指定的签署位置，json array格式
     */
    private SignaturePosition[] signaturePositions;
    public SignReqContractAutoSign(String contractId, String signer, SignaturePosition[] signaturePositions){
        this.contractId= contractId;
        this.signer = signer;
        this.signaturePositions=signaturePositions;
    }

    /**
     * 请使用setSignatureImageNameEnum
     * @param signatureImageName
     * @return
     */
    @Deprecated
    public SignReqContractAutoSign setSignatureImageName(String signatureImageName) {
        this.signatureImageName = signatureImageName;
        return this;
    }
    public SignReqContractAutoSign setSignatureImageNameEnum(EnumImageName signatureImageName) {
        this.signatureImageName = signatureImageName.getValue();
        return this;
    }

    public SignReqContractAutoSign setSignatureImageData(String signatureImageData) {
        this.signatureImageData = signatureImageData;
        return this;
    }

    public SignReqContractAutoSign setSignatureImageWidth(String signatureImageWidth) {
        this.signatureImageWidth = signatureImageWidth;
        return this;
    }

    public SignReqContractAutoSign setSignatureImageHeight(String signatureImageHeight) {
        this.signatureImageHeight = signatureImageHeight;
        return this;
    }

    public String getContractId() {
        return contractId;
    }

    public String getSigner() {
        return signer;
    }

    public String getSignatureImageName() {
        return signatureImageName;
    }

    public String getSignatureImageData() {
        return signatureImageData;
    }

    public String getSignatureImageWidth() {
        return signatureImageWidth;
    }

    public String getSignatureImageHeight() {
        return signatureImageHeight;
    }

    public SignaturePosition[] getSignaturePositions() {
        return signaturePositions;
    }
}
