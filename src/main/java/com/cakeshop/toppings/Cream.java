package com.cakeshop.toppings;

import com.cakeshop.cake.Cake;

public class Cream extends Decorator {
    Cake cake;
    double price = 2.00;
    
    public Cream(Cake cake) {
        super();
        this.cake = cake;
    }
    @Override
    public String getDescription() {
        return cake.getDescription() + ", Cream";
    }
  
    @Override
    public double cost() {
        return cake.cost() + price;
    }
}