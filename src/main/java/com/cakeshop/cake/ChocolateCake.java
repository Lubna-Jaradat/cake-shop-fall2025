package com.cakeshop.cake;

public class ChocolateCake extends Cake {
    private double price = 5.00;
    public ChocolateCake(String name, String description) {
        super(name, description);
        setPrice(price);
    }
}