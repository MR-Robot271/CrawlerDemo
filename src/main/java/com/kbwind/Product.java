package com.kbwind;

// 网页中的Product的实体类
public class Product {
    public String pImage;
    public float price;
    public String pName;

    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getpName() {
        return pName;
    }


    public void setpName(String pName) {
        this.pName = pName;
    }

    public Product() {
    }

    public Product(String pImage, float price, String pName) {
        this.pImage = pImage;
        this.price = price;
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "产品{" +
                "图片地址='" + pImage + '\'' +
                ", 价格=" + price +
                ", 产品名称='" + pName + '\'' +
                '}';
    }
}