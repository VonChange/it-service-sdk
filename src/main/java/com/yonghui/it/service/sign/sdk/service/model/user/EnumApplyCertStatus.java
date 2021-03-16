package com.yonghui.it.service.sign.sdk.service.model.user;

/**
     * 1：新申请
     * 2：申请中
     * 3：超时
     * 4：申请失败
     * 5：成功
     * -1：无效的申请（数据库无此值）
     * 0：taskId不存在或已过期
     */
    public  enum EnumApplyCertStatus {
        ok(5,"成功"),newApply(1,"新申请"),applying(2,"申请中"),timeout(3,"超时"),
        applyFail(4,"申请失败"),invaid(-1,"无效的申请"),notExist(0,"taskId不存在或已过期"),unKnow(999,"未知状态");
        //
        private Integer status;
        private String desc;
        EnumApplyCertStatus(Integer status, String desc){
            this.status=status;
            this.desc=desc;
        }
        public static EnumApplyCertStatus getStatus(Integer status) {
            for (EnumApplyCertStatus c : EnumApplyCertStatus.values()) {
                if (c.getStatus() .equals(status)) {
                    return c;
                }
            }
            return EnumApplyCertStatus.unKnow.setStatus(status);
        }
        public Integer getStatus() {
            return status;
        }

        public EnumApplyCertStatus setStatus(int status) {
            this.status = status;
            return this;

        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }