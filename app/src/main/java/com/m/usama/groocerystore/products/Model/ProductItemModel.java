package com.m.usama.groocerystore.products.Model;

public class ProductItemModel {


    private String title;
    private Boolean isFav;
    private int imgid;
    private int price;
    private int quantity;

    public String getTitle() {
        return title;
    }

    public int getImgid() {
        return imgid;
    }


    public ProductItemModel(String title, int imgid, Boolean isFav, int price,  int quantity) {
        this.title = title;
        this.imgid = imgid;
        this.isFav = isFav;
        this.price = price;
        this.quantity = quantity;
    }


    public Boolean getFav() {
        return isFav;
    }

    public void setFav(Boolean fav) {
        isFav = fav;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
