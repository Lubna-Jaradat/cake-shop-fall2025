package com.cakeshop.cake;

public abstract class Cake {
    private String name;
    private double price;
    private int orderNo;
    private String description;
    public Cake() {
    }

    public Cake(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getOrderNo() {
        return orderNo;
    }
    public String getDescription() {
        return description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double cost() {
        return price;
    }
}