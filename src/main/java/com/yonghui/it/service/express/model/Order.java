package com.yonghui.it.service.express.model;

import java.util.List;

public class Order {
    private String orderCode;
    private String shipperCode;
    private String logisticCode;
    private String markDestination;
    private String signWaybillCode;
    private String originCode;
    private String originName;
    private String destinatioCode;
    private String destinatioName;
    private String sortingCode;
    private String packageCode;
    private String packageName;
    private String destinationAllocationCentre;
    private Integer transType;
    private Integer transportType;
    private String shipperInfo;
    private List<SFShipperInfo> shipperInfoDetails;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getShipperCode() {
        return shipperCode;
    }

    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode;
    }

    public String getLogisticCode() {
        return logisticCode;
    }

    public void setLogisticCode(String logisticCode) {
        this.logisticCode = logisticCode;
    }

    public String getMarkDestination() {
        return markDestination;
    }

    public void setMarkDestination(String markDestination) {
        this.markDestination = markDestination;
    }

    public String getSignWaybillCode() {
        return signWaybillCode;
    }

    public void setSignWaybillCode(String signWaybillCode) {
        this.signWaybillCode = signWaybillCode;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getDestinatioCode() {
        return destinatioCode;
    }

    public void setDestinatioCode(String destinatioCode) {
        this.destinatioCode = destinatioCode;
    }

    public String getDestinatioName() {
        return destinatioName;
    }

    public void setDestinatioName(String destinatioName) {
        this.destinatioName = destinatioName;
    }

    public String getSortingCode() {
        return sortingCode;
    }

    public void setSortingCode(String sortingCode) {
        this.sortingCode = sortingCode;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDestinationAllocationCentre() {
        return destinationAllocationCentre;
    }

    public void setDestinationAllocationCentre(String destinationAllocationCentre) {
        this.destinationAllocationCentre = destinationAllocationCentre;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public String getShipperInfo() {
        return shipperInfo;
    }

    public void setShipperInfo(String shipperInfo) {
        this.shipperInfo = shipperInfo;
    }

    public List<SFShipperInfo> getShipperInfoDetails() {
        return shipperInfoDetails;
    }

    public void setShipperInfoDetails(List<SFShipperInfo> shipperInfoDetails) {
        this.shipperInfoDetails = shipperInfoDetails;
    }
}
