package com.chandu.missionhealthy.Models;

public class ProductsModel
{
    int image,desc;
    String name,price;

    public ProductsModel(int image, String name, String price, int desc) {
        this.image = image;
        this.name = name;
        this.price=price;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }


}
