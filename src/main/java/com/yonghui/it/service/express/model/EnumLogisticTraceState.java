package com.yonghui.it.service.express.model;

/**
 * 0 - 暂无轨迹信息 1-已揽收 2-在途中 3-签收 4-问题件
 */
    public  enum EnumLogisticTraceState {
        noTrace("0","暂无轨迹信息"),collection("1","已揽收"),onTheWay("2","在途中"),signOff("3","签收"),
        problemCourier("4","问题件");
        //
        private String state;
        private String desc;
        EnumLogisticTraceState(String state, String desc){
            this.state=state;
            this.desc=desc;
        }
        public static EnumLogisticTraceState getByState(String state) {
            for (EnumLogisticTraceState c : EnumLogisticTraceState.values()) {
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