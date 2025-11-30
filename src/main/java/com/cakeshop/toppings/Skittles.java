package com.cakeshop.toppings;

import com.cakeshop.cake.Cake;

public class Skittles extends Decorator {
    Cake cake;
    double price = 1.50;

    public Skittles(Cake cake) {
        super();
        this.cake = cake;
    }
    @Override
    public String getDescription() {
        return cake.getDescription() + ", Skittles";
    }
  
    @Override
    public double cost() {
        return cake.cost() + price;
    } 
}   
