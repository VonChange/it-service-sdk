package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.service.model.user.EnumImageName;
import com.yonghui.it.service.sign.sdk.util.ConvertUtil;
import com.yonghui.it.service.sign.sdk.util.DateUtil;

import java.util.Date;

public class SignReqContractSend {
    private String contractId;
    private String signer;
    private String dpi;
    private SignaturePosition[] signaturePositions;
    private String isAllowChangeSignaturePosition;
    private String expireTime;
    /**
     * 手动签署时，当用户签署完成后，指定回跳的页面地址
     */
    private String returnUrl;
    private String vcodeMobile;
    /**
     * 手动签署时是否手绘签名。取值0/1/2。
     * 0点击签名图片不会触发手写面板（禁止手写）。
     * 1点击签名图片能触发手写面板（既可手写也可使用默认签名）。
     * 2强制必须手绘签名（只能手写不允许使用默认签名），初始不显示用户签名图片，只显示实时手写的签名。
     */
    private String isDrawSignatureImage;
    private String signatureImageName;
    private String signatureImageWidth;
    private String signatureImageHeight;
    /**
     * 开发者自定义的签署流水号（比如第几次签署之类），如有填写，则在异步推送签署结果时包含此签署流水号
     */
    private String sid;
    //此处有配置则签署推送消息优先使用此配置，如果此处没有配置，则取开发者统一配置的异步推送地址
    /**
     *  手动签的版本，默认为2，枚举值：
     *   2-v2版本,
     *   3-v3版本，UI优化，移动端手绘面板自动横屏
     */
    private String version;
    private String readAll;
    private Boolean fullUrl;
    public SignReqContractSend(String contractId, String signer,
                               String vcodeMobile, String returnUrl, SignaturePosition[] signaturePositions){
        this.contractId=contractId;
        this.signer=signer;
        this.returnUrl=returnUrl;
        this.vcodeMobile=vcodeMobile;
        this.signaturePositions=signaturePositions;
    }

    public String getSignatureImageWidth() {
        return signatureImageWidth;
    }

    public SignReqContractSend setSignatureImageWidth(String signatureImageWidth) {
        this.signatureImageWidth = signatureImageWidth;
        return this;
    }

    public String getSignatureImageHeight() {
        return signatureImageHeight;
    }

    public SignReqContractSend setSignatureImageHeight(String signatureImageHeight) {
        this.signatureImageHeight = signatureImageHeight;
        return this;
    }

    public SignReqContractSend setSignatureImageName(EnumImageName enumImageName) {
        this.signatureImageName = enumImageName.getValue();
        return this;
    }

    public SignReqContractSend setDpi(EnumDpi enumDpi) {
        this.dpi = enumDpi.getValue().toString();
        return this;
    }

    public SignReqContractSend setIsAllowChangeSignaturePosition(boolean isAllowChangeSignaturePosition) {
        this.isAllowChangeSignaturePosition = isAllowChangeSignaturePosition?"1":"0";
        return this;
    }

    public Boolean getFullUrl() {
        return fullUrl;
    }

    public SignReqContractSend setFullUrl(Boolean fullUrl) {
        this.fullUrl = fullUrl;
        return this;
    }

    public SignReqContractSend setExpireTime(Date expireTime) {
        this.expireTime = ConvertUtil.toString(DateUtil.getUnixTime(expireTime));
        return this;
    }

    public SignReqContractSend setIsDrawSignatureImage(EnumIsDrawSignatureImage enumIsDrawSignatureImage) {
        this.isDrawSignatureImage = enumIsDrawSignatureImage.getValue().toString();
        return this;
    }

    public SignReqContractSend setSid(String sid) {
        this.sid = sid;
        return this;
    }


    public SignReqContractSend setVersion(String version) {
        this.version = version;
        return this;
    }

    public SignReqContractSend setReadAll(boolean readAll) {
        this.readAll = readAll?"1":"0";
        return this;
    }

    public String getContractId() {
        return contractId;
    }

    public String getSigner() {
        return signer;
    }

    public String getDpi() {
        return dpi;
    }

    public SignaturePosition[] getSignaturePositions() {
        return signaturePositions;
    }

    public String getIsAllowChangeSignaturePosition() {
        return isAllowChangeSignaturePosition;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public String getVcodeMobile() {
        return vcodeMobile;
    }

    public String getIsDrawSignatureImage() {
        return isDrawSignatureImage;
    }

    public String getSignatureImageName() {
        return signatureImageName;
    }

    public String getSid() {
        return sid;
    }


    public String getVersion() {
        return version;
    }

    public String getReadAll() {
        return readAll;
    }



    public  enum  EnumIsDrawSignatureImage {
        writeNotAllow(0,"禁止手写"),writeAndSign(1,"既可手写也可使用默认签名"),writeOnly(2,"只能手写不允许使用默认签名");
        //
        private Integer value;
        private String desc;
        EnumIsDrawSignatureImage(Integer value,String desc){
            this.value=value;
            this.desc=desc;
        }

        public Integer getValue() {
            return value;
        }

        public EnumIsDrawSignatureImage setValue(int value) {
            this.value = value;
            return this;

        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
