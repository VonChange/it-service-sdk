package com.yonghui.it.service.express.model;


import java.util.Date;
import java.util.List;

/**
 * 电子面单返回
 */

public class VoExpressBill extends VoBase{

    private Order order;
    private String resultCode;
    private String uniquerRequestNumber;
    private String printTemplate;
    private Date estimatedDeliveryTime;
    private Integer subCount;
    private List<String> subOrders;
    private List<String> subPrintTemplates;
    private String signBillPrintTemplate;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getUniquerRequestNumber() {
        return uniquerRequestNumber;
    }

    public void setUniquerRequestNumber(String uniquerRequestNumber) {
        this.uniquerRequestNumber = uniquerRequestNumber;
    }

    public String getPrintTemplate() {
        return printTemplate;
    }

    public void setPrintTemplate(String printTemplate) {
        this.printTemplate = printTemplate;
    }

    public Date getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(Date estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public Integer getSubCount() {
        return subCount;
    }

    public void setSubCount(Integer subCount) {
        this.subCount = subCount;
    }

    public List<String> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<String> subOrders) {
        this.subOrders = subOrders;
    }

    public List<String> getSubPrintTemplates() {
        return subPrintTemplates;
    }

    public void setSubPrintTemplates(List<String> subPrintTemplates) {
        this.subPrintTemplates = subPrintTemplates;
    }

    public String getSignBillPrintTemplate() {
        return signBillPrintTemplate;
    }

    public void setSignBillPrintTemplate(String signBillPrintTemplate) {
        this.signBillPrintTemplate = signBillPrintTemplate;
    }
}
