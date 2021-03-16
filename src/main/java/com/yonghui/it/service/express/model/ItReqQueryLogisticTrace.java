package com.yonghui.it.service.express.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class ItReqQueryLogisticTrace {
    @SDKProperty("订单编号")
    private String orderCode;
    /**
     * ShipperCode 为 JD，必填，对应京东的 青龙配送编码，也叫商家编码，格式:数 字+字母+数字，9 位数字加一个字母， 共 10 位，举例:001K123450;
     * ShipperCode 为 SF，且快递单号非快递 鸟渠道返回时，必填，对应收件人/寄件 人手机号后四位;
     * ShipperCode 为 SF，且快递单号为快递 鸟渠道返回时，不填;
     * ShipperCode 为其他快递时，不填
     */
    @SDKProperty("JD商家编码 SF非快递手机号后四位")
    private String customerName;
    @SDKProperty("快递公司编码")
    private String shipperCode;
    @SDKProperty("快递单号")
    private String logisticCode;

    public ItReqQueryLogisticTrace(String logisticCode,String shipperCode,String customerName){
        this.logisticCode=logisticCode;
        this.shipperCode=shipperCode;
        this.customerName=customerName;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public ItReqQueryLogisticTrace setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }



    public String getShipperCode() {
        return shipperCode;
    }



    public String getLogisticCode() {
        return logisticCode;
    }


}
