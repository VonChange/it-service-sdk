package com.yonghui.it.service.express.model;

import com.yonghui.it.service.annotion.SDKProperty;

import java.util.List;

public class ItVoLogisticTrace extends VoBase{
    @SDKProperty("快递单号")
    private String logisticCode;
    /**
     * 0 - 暂无轨迹信息 1-已揽收 2-在途中 3-签收 4-问题件
     */
    @SDKProperty("物流状态")
    private String state;
    private EnumLogisticTraceState stateEnum;
    /**
     * 0-暂无轨迹信息 1-已揽收
     * 2-在途中 201-到达派件城市 202-派件中 211-已放入快递柜或驿站
     * 3-已签收
     * 301-正常签收 302-派件异常后最终签收 304-代收签收 311-快递柜或驿站签收
     * 4-问题件
     * 401-发货无信息 402-超时未签收 403-超时未更新 404-拒收(退件) 405-派件异常 406-退货签收 407-退货未签收 412-快递柜或驿站超时未取
     */
    @SDKProperty("增值物流状态")
    private String stateEx;
    private EnumLogisticTraceStateExt stateExEnum;
    @SDKProperty("所在城市")
    private String location;
    @SDKProperty("快递公司编码")
    private String shipperCode;
    @SDKProperty("订单编号")
    private String orderCode;
    @SDKProperty("用户自定义回传字段")
    private String callback;
    @SDKProperty("轨迹")
    private List<Trace> traces;

    public String getLogisticCode() {
        return logisticCode;
    }

    public void setLogisticCode(String logisticCode) {
        this.logisticCode = logisticCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.stateEnum=EnumLogisticTraceState.getByState(state);
    }

    public String getStateEx() {
        return stateEx;
    }

    public void setStateEx(String stateEx) {
        this.stateEx = stateEx;
        this.stateExEnum = EnumLogisticTraceStateExt.getByState(stateEx);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShipperCode() {
        return shipperCode;
    }

    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public List<Trace> getTraces() {
        return traces;
    }

    public void setTraces(List<Trace> traces) {
        this.traces = traces;
    }

    public EnumLogisticTraceState getStateEnum() {
        return stateEnum;
    }

    public void setStateEnum(EnumLogisticTraceState stateEnum) {
        this.stateEnum = stateEnum;
    }

    public EnumLogisticTraceStateExt getStateExEnum() {
        return stateExEnum;
    }

    public void setStateExEnum(EnumLogisticTraceStateExt stateExEnum) {
        this.stateExEnum = stateExEnum;
    }
}
