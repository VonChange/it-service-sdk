package com.yonghui.it.service.express.model;

/**
 * 0-暂无轨迹信息 1-已揽收
 * 2-在途中 201-到达派件城市 202-派件中 211-已放入快递柜或驿站
 * 3-已签收
 * 301-正常签收 302-派件异常后最终签收 304-代收签收 311-快递柜或驿站签收
 * 4-问题件
 * 401-发货无信息 402-超时未签收 403-超时未更新 404-拒收(退件) 405-派件异常 406-退货签收 407-退货未签收 412-快递柜或驿站超时未取
 */
    public  enum EnumLogisticTraceStateExt {
        noTrace("0","暂无轨迹信息"),collection("1","已揽收"),onTheWay("2","在途中"),signOff("3","签收"),
        problemCourier("4","问题件"),arriveUserCity("201","到达派件城市"),dispatching("202","派件中"),inCabinetOrStation("211","已放入快递柜或驿站"),
    signOffNormal("301","正常签收"),signOffAfterException("302","派件异常后最终签收"),signOffByOther("304","代收签收")
    ,signOffInCabinetOrStation("311","快递柜或驿站签收"),noShippingInfo("401","发货无信息"),unSignOffOfTimeOut("402","超时未签收"),
    rejectOrBack("404","拒收(退件)"),dispatchException("405","派件异常"),backSignOff("406","退货签收"),
    backUnSignOff("407","退货未签收"),CabinetOrStationTimeOut("412","快递柜或驿站超时未取");
        //
        private String state;
        private String desc;
        EnumLogisticTraceStateExt(String state, String desc){
            this.state=state;
            this.desc=desc;
        }
        public static EnumLogisticTraceStateExt getByState(String state) {
            for (EnumLogisticTraceStateExt c : EnumLogisticTraceStateExt.values()) {
                if (c.getState() .equals(state)) {
                    return c;
                }
            }
            return null;
        }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }