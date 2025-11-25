package com.cakeshop.cake;

public class CheeseCake extends Cake {
    private double price = 5.00;
    public CheeseCake(String name, String description) {
        super(name, description);
        setPrice(price);
    }
}
