package com.yonghui.it.service.sign.sdk.service.model.contract;

import com.yonghui.it.service.sign.sdk.exception.SignRuntimeException;
import com.yonghui.it.service.sign.sdk.util.StringUtil;

public class SignatureDatePosition extends SignaturePosition{
    /**
     * 横坐标，按页面尺寸的百分比计算，取值0.0 - 1.0。以左上角为原点
     */
    private Double x;
    /**
     * 横坐标，按页面尺寸的百分比计算，取值0.0 - 1.0。以左上角为原点
     */
    private Double y;
    /**
     * 页码，从1开始，不能超过合同最大页数
     */
    private Integer pageNum;
    private String type;
    private String dateTimeFormat;
    /**
     * 当前位置的签名需要复制到的目标页码列表。该参数用于控制是否将当前位置的签名复制到其他页。
     * 参数启用之后，当前页的签名会同时出现在其他页的相同位置。
     * 参数值格式如下： 多个页码使用英文逗号(,)分隔。 参数不存在或者参数值为空表示不复制，
     * 参数值为0表示复制到所有页， 参数值为其他表示复制到指定页。
     * 参数值示例："0" “1,2,3,4,5,6” “1,3,5,7,9”
     */
    private String rptPageNums;
    private String fontSize;

    public SignatureDatePosition(int x, int y, int pageNum,String dateTimeFormat){
        if(x<0||x>1000){
            throw new SignRuntimeException("x值范围错误(0-1000)");
        }
        if(y<0||y>1000){
            throw new SignRuntimeException("y值范围错误(0-1000)");
        }
        if(pageNum<0){
            throw new SignRuntimeException("pageNum值范围错误(>0)");
        }
        this.x=x/1000.0;
        this.y=y/1000.0;
        this.pageNum=pageNum;
        this.dateTimeFormat=dateTimeFormat;
        this.type="date";
    }

    public String getFontSize() {
        return fontSize;
    }

    public SignatureDatePosition setFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public SignatureDatePosition setRptPageNums(Integer[] rptPageNums) {
        this.rptPageNums = StringUtil.StrList(rptPageNums,",");
        return this;
    }

    public String getType() {
        return type;
    }

    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public String getRptPageNums() {
        return rptPageNums;
    }
}
