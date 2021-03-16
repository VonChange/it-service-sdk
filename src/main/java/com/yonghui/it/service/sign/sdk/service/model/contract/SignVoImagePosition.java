package com.yonghui.it.service.sign.sdk.service.model.contract;

/**
 * 模版 文本域 位置及其大小
 */
public class SignVoImagePosition {
    /**
     * 横坐标，千分比
     */
    private Integer x;
    /**
     * 纵坐标，千分比
     */
    private Integer y;
    /**
     * 宽度
     */
    private Integer width;
    /**
     * 长度
     */
    private Integer height;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
