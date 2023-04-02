package com.example.fiveprojectspringboot.home;

public class Two {

    int width;
    int height;
int result ;

    public Two(int width, int height, int result) {
        this.width = width;
        this.height = height;
        this.result = height*width;
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
