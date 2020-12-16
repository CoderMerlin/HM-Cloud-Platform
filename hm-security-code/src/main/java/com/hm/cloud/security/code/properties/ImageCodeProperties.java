package com.hm.cloud.security.code.properties;

/**
　* @Description: 图形验证码
　* @author Coder编程
　* @date 2020/12/16 16:07
　*/

public class ImageCodeProperties extends SmsCodeProperties {
    private int width = 67;
    private int height = 23;

    public ImageCodeProperties() {
        setLength(4);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
