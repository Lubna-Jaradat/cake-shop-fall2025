package com.cakeshop.cake;

public class AppleCake extends Cake {
    private double price = 5.00;
    
    public AppleCake(String name, String description) {
        super(name, description);
        setPrice(price);
    }
}
