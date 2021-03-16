package com.yonghui.it.service.lbpm.model;

import java.util.List;
public class LbpmPage<T> {
    private PageInfo page;
    private List<T> datas;

    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
