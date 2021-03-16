package com.yonghui.it.service.file;

public class ItReqImage {
    private byte[] file;
    private String fileName;
    private byte[] logo;
    private String logoName;
    private String layout;
    private Integer ratio;
    private String text;
    private Integer red;
    private Integer green;
    private Integer blue;
    private Integer alpha;
    private Integer pheight;

    public ItReqImage(byte[] file, String fileName) {
        this.file = file;
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }


    public String getFileName() {
        return fileName;
    }



    public byte[] getLogo() {
        return logo;
    }

    public ItReqImage setLogo(byte[] logo) {
        this.logo = logo;
        return this;
    }

    public String getLogoName() {
        return logoName;
    }

    public ItReqImage setLogoName(String logoName) {
        this.logoName = logoName;
        return this;
    }

    public String getLayout() {
        return layout;
    }

    public ItReqImage setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    public Integer getRatio() {
        return ratio;
    }

    public ItReqImage setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }

    public String getText() {
        return text;
    }

    public ItReqImage setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getRed() {
        return red;
    }

    public ItReqImage setRed(Integer red) {
        this.red = red;
        return this;
    }

    public Integer getGreen() {
        return green;
    }

    public ItReqImage setGreen(Integer green) {
        this.green = green;
        return this;
    }

    public Integer getBlue() {
        return blue;
    }

    public ItReqImage setBlue(Integer blue) {
        this.blue = blue;
        return this;
    }

    public Integer getAlpha() {
        return alpha;
    }

    public ItReqImage setAlpha(Integer alpha) {
        this.alpha = alpha;
        return this;
    }

    public Integer getPheight() {
        return pheight;
    }

    public ItReqImage setPheight(Integer pheight) {
        this.pheight = pheight;
        return this;
    }
}
