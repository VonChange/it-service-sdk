package com.yonghui.it.service.express.model;

import com.yonghui.it.service.annotion.SDKProperty;

public class Trace {
    /**
     * 0-暂无轨迹信息 1-已揽收
     * 2-在途中 201-到达派件城市 202-派件中 211-已放入快递柜或驿站
     * 3-已签收
     * 301-正常签收 302-派件异常后最终签收 304-代收签收 311-快递柜或驿站签收
     * 4-问题件
     * 401-发货无信息 402-超时未签收 403-超时未更新 404-拒收(退件) 405-派件异常 406-退货签收 407-退货未签收 412-快递柜或驿站超时未取
     */
    @SDKProperty("当前状态(同 StateEx)")
    private  String action;
    private EnumLogisticTraceStateExt actionEnum;
    @SDKProperty("轨迹描述")
    private String acceptStation;
    @SDKProperty("轨迹发生时间")
    private String acceptTime;
    @SDKProperty("当前城市")
    private String location;
    @SDKProperty("备注")
    private String remark;
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
        this.actionEnum = EnumLogisticTraceStateExt.getByState(action);
    }

    public String getAcceptStation() {
        return acceptStation;
    }
    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }
    public String getAcceptTime() {
        return acceptTime;
    }
    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public EnumLogisticTraceStateExt getActionEnum() {
        return actionEnum;
    }

    public void setActionEnum(EnumLogisticTraceStateExt actionEnum) {
        this.actionEnum = actionEnum;
    }
}
