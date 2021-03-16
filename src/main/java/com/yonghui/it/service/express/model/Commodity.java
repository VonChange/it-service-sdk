package com.yonghui.it.service.express.model;

public class Commodity {
    private String goodsName;
    private String goodsCode;
    private Integer goodsQuantity;
    private Double goodsPrice;
    private Double goodsWeight;
    private String goodsDesc;
    private Double goodsVol;

    public Commodity(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return goodsName;
    }


    public String getGoodsCode() {
        return goodsCode;
    }

    public Commodity setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
        return this;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsQuantity() {
        return goodsQuantity;
    }

    public Commodity setGoodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
        return this;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public Commodity setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
        return this;
    }

    public Double getGoodsWeight() {
        return goodsWeight;
    }

    public Commodity setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
        return this;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public Commodity setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
        return this;
    }

    public Double getGoodsVol() {
        return goodsVol;
    }

    public Commodity setGoodsVol(Double goodsVol) {
        this.goodsVol = goodsVol;
        return this;
    }
}
