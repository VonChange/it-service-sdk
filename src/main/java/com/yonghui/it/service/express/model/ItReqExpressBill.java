package com.yonghui.it.service.express.model;

import com.yonghui.it.service.annotion.SDKProperty;

import java.util.Date;
import java.util.List;


public class ItReqExpressBill {
    @SDKProperty(value = "用户自定义回传字段",optional=true)
    private String callback;
    @SDKProperty(value = "ERP系统、电商平台等系统或 平台类型用户的会员 ID 或店 铺账号等唯一性标识，用于区 分其用户",optional = true)
    private String memberId;
    private String customerName;
    private String customerPwd;
    private String sendSite;
    private String sendStaff;
    private String monthCode;
    private String customArea;
    private String wareHouseId;
    private Integer transType;
    @SDKProperty(value = "快递公司编码",required=true)
    private String shipperCode;
    private String logisticCode;
    private String thrOrderCode;
    @SDKProperty(value = "订单编号(自定义，不可重复)",required=true)
    private String orderCode;
    private Integer payType;
    private String expType;
    private Integer isReturnSignBill;
    private String operateRequire;
    private Double cost;
    private Double otherCost;
    private Linker receiver;
    private Linker sender;
    private Integer isNotice;
    private Date startDate;
    private Date endDate;
    private Double weight;
    private Integer quantity;
    private Double volume;
    private String remark;
    private List<AddService> addService;
    private List<Commodity> commodity;
    private String isReturnPrintTemplate;
    private Integer isSendMessage;
    private String isSubscribe;
    private String templateSize;
    private Integer packingType;
    private Integer deliveryMethod;
    private String currencyCode;
    private Dutiable dutiable;

    public ItReqExpressBill(String shipperCode, String orderCode, Integer payType, String expType, Linker receiver, Linker sender, Integer quantity,List<Commodity> commodity) {

        this.shipperCode = shipperCode;
        this.orderCode = orderCode;
        this.payType = payType;
        this.expType = expType;
        this.receiver = receiver;
        this.sender = sender;
        this.quantity=quantity;
        this.commodity=commodity;

    }

    public String getCallback() {
        return callback;
    }

    public ItReqExpressBill setCallback(String callback) {
        this.callback = callback;
        return this;
    }

    public String getMemberId() {
        return memberId;
    }

    public ItReqExpressBill setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ItReqExpressBill setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public ItReqExpressBill setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd;
        return this;
    }

    public String getSendStaff() {
        return sendStaff;
    }

    public ItReqExpressBill setSendStaff(String sendStaff) {
        this.sendStaff = sendStaff;
        return this;
    }

    public String getMonthCode() {
        return monthCode;
    }

    public ItReqExpressBill setMonthCode(String monthCode) {
        this.monthCode = monthCode;
        return this;
    }

    public String getCustomArea() {
        return customArea;
    }

    public ItReqExpressBill setCustomArea(String customArea) {
        this.customArea = customArea;
        return this;
    }

    public String getWareHouseId() {
        return wareHouseId;
    }

    public ItReqExpressBill setWareHouseId(String wareHouseId) {
        this.wareHouseId = wareHouseId;
        return this;
    }

    public Integer getTransType() {
        return transType;
    }

    public ItReqExpressBill setTransType(Integer transType) {
        this.transType = transType;
        return this;
    }

    public String getShipperCode() {
        return shipperCode;
    }



    public String getLogisticCode() {
        return logisticCode;
    }

    public ItReqExpressBill setLogisticCode(String logisticCode) {
        this.logisticCode = logisticCode;
        return this;
    }

    public String getThrOrderCode() {
        return thrOrderCode;
    }

    public ItReqExpressBill setThrOrderCode(String thrOrderCode) {
        this.thrOrderCode = thrOrderCode;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }



    public Integer getPayType() {
        return payType;
    }



    public String getExpType() {
        return expType;
    }


    public Integer getIsReturnSignBill() {
        return isReturnSignBill;
    }

    public ItReqExpressBill setIsReturnSignBill(Integer isReturnSignBill) {
        this.isReturnSignBill = isReturnSignBill;
        return this;
    }

    public String getOperateRequire() {
        return operateRequire;
    }

    public ItReqExpressBill setOperateRequire(String operateRequire) {
        this.operateRequire = operateRequire;
        return this;
    }

    public Double getCost() {
        return cost;
    }

    public ItReqExpressBill setCost(Double cost) {
        this.cost = cost;
        return this;
    }

    public Double getOtherCost() {
        return otherCost;
    }

    public ItReqExpressBill setOtherCost(Double otherCost) {
        this.otherCost = otherCost;
        return this;
    }

    public Linker getReceiver() {
        return receiver;
    }



    public Linker getSender() {
        return sender;
    }



    public Integer getIsNotice() {
        return isNotice;
    }

    public ItReqExpressBill setIsNotice(Integer isNotice) {
        this.isNotice = isNotice;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public ItReqExpressBill setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public ItReqExpressBill setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public ItReqExpressBill setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }



    public Double getVolume() {
        return volume;
    }

    public ItReqExpressBill setVolume(Double volume) {
        this.volume = volume;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public ItReqExpressBill setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public List<AddService> getAddService() {
        return addService;
    }

    public ItReqExpressBill setAddService(List<AddService> addService) {
        this.addService = addService;
        return this;
    }

    public List<Commodity> getCommodity() {
        return commodity;
    }

    public ItReqExpressBill setCommodity(List<Commodity> commodity) {
        this.commodity = commodity;
        return this;
    }

    public String getIsReturnPrintTemplate() {
        return isReturnPrintTemplate;
    }

    public ItReqExpressBill setIsReturnPrintTemplate(String isReturnPrintTemplate) {
        this.isReturnPrintTemplate = isReturnPrintTemplate;
        return this;
    }

    public Integer getIsSendMessage() {
        return isSendMessage;
    }

    public ItReqExpressBill setIsSendMessage(Integer isSendMessage) {
        this.isSendMessage = isSendMessage;
        return this;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public ItReqExpressBill setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
        return this;
    }

    public String getTemplateSize() {
        return templateSize;
    }

    public ItReqExpressBill setTemplateSize(String templateSize) {
        this.templateSize = templateSize;
        return this;
    }

    public Integer getPackingType() {
        return packingType;
    }

    public ItReqExpressBill setPackingType(Integer packingType) {
        this.packingType = packingType;
        return this;
    }

    public Integer getDeliveryMethod() {
        return deliveryMethod;
    }

    public ItReqExpressBill setDeliveryMethod(Integer deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public ItReqExpressBill setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public Dutiable getDutiable() {
        return dutiable;
    }

    public ItReqExpressBill setDutiable(Dutiable dutiable) {
        this.dutiable = dutiable;
        return this;
    }

    public String getSendSite() {
        return sendSite;
    }

    public ItReqExpressBill setSendSite(String sendSite) {
        this.sendSite = sendSite;
        return this;
    }
}
