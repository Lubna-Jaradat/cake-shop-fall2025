package com.cakeshop.toppings;

import com.cakeshop.cake.Cake;

public class ChocolateChips extends Decorator {
    Cake cake;
    double price = 2.50;
    
    public ChocolateChips(Cake cake) {
        super();
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Chocolate Chips";
    }
  
    @Override
    public double cost() {
        return cake.cost() + price;
    }
}