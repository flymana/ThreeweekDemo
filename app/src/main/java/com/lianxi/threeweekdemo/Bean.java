package com.lianxi.threeweekdemo;

/**
 * Created by dell on 2017/8/31.
 */

public class Bean {
    private String image;
    private  String Text;
    private  String Text2;

    public Bean() {
        super();
    }

    public Bean(String image, String text, String text2) {
        this.image = image;
        Text = text;
        Text2 = text2;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getText2() {
        return Text2;
    }

    public void setText2(String text2) {
        Text2 = text2;
    }
}
