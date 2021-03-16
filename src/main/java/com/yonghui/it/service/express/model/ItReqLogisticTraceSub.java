package com.yonghui.it.service.express.model;

import com.yonghui.it.service.annotion.SDKProperty;

import java.util.Date;
import java.util.List;

public class ItReqLogisticTraceSub {
    @SDKProperty(value = "用户自定义回传字段",optional=true)
    private String callback;
    @SDKProperty(value = "ERP系统、电商平台等系统或 平台类型用户的会员 ID 或店 铺账号等唯一性标识，用于区 分其用户",optional = true)
    private String memberId;
    private String wareHouseId;
    @SDKProperty(value = "快递公司编码",required=true)
    private String shipperCode;
    private String logisticCode;
    private String customerName;
    private String orderCode;
    private String monthCode;
    private Integer payType;
    private String expType;
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

    public ItReqLogisticTraceSub(String shipperCode, String logisticCode, Linker receiver, Linker sender) {
        this.shipperCode = shipperCode;
        this.logisticCode=logisticCode;
        this.receiver=receiver;
        this.sender=sender;
    }

    public String getCallback() {
        return callback;
    }

    public ItReqLogisticTraceSub setCallback(String callback) {
        this.callback = callback;
        return this;
    }

    public String getMemberId() {
        return memberId;
    }

    public ItReqLogisticTraceSub setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getWareHouseId() {
        return wareHouseId;
    }

    public ItReqLogisticTraceSub setWareHouseId(String wareHouseId) {
        this.wareHouseId = wareHouseId;
        return this;
    }

    public String getShipperCode() {
        return shipperCode;
    }



    public String getLogisticCode() {
        return logisticCode;
    }



    public String getCustomerName() {
        return customerName;
    }

    public ItReqLogisticTraceSub setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public ItReqLogisticTraceSub setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public String getMonthCode() {
        return monthCode;
    }

    public ItReqLogisticTraceSub setMonthCode(String monthCode) {
        this.monthCode = monthCode;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public ItReqLogisticTraceSub setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    public String getExpType() {
        return expType;
    }

    public ItReqLogisticTraceSub setExpType(String expType) {
        this.expType = expType;
        return this;
    }

    public Double getCost() {
        return cost;
    }

    public ItReqLogisticTraceSub setCost(Double cost) {
        this.cost = cost;
        return this;
    }

    public Double getOtherCost() {
        return otherCost;
    }

    public ItReqLogisticTraceSub setOtherCost(Double otherCost) {
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

    public ItReqLogisticTraceSub setIsNotice(Integer isNotice) {
        this.isNotice = isNotice;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public ItReqLogisticTraceSub setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public ItReqLogisticTraceSub setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public ItReqLogisticTraceSub setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public ItReqLogisticTraceSub setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Double getVolume() {
        return volume;
    }

    public ItReqLogisticTraceSub setVolume(Double volume) {
        this.volume = volume;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public ItReqLogisticTraceSub setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public List<AddService> getAddService() {
        return addService;
    }

    public ItReqLogisticTraceSub setAddService(List<AddService> addService) {
        this.addService = addService;
        return this;
    }

    public List<Commodity> getCommodity() {
        return commodity;
    }

    public ItReqLogisticTraceSub setCommodity(List<Commodity> commodity) {
        this.commodity = commodity;
        return this;
    }
}
