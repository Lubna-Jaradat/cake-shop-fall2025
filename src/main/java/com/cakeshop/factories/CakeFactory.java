package com.cakeshop.factories;

import com.cakeshop.cake.Cake;
import com.cakeshop.cake.AppleCake;
import com.cakeshop.cake.ChocolateCake;
import com.cakeshop.cake.CheeseCake;

public class CakeFactory extends Factory {
    @Override
    public Cake createCake(CakeType type) {
        switch (type) {
            case APPLE:
                return new AppleCake("Apple Cake", "Delicious apple cake");
            case CHOCOLATE:
                return new ChocolateCake("Chocolate Cake", "Rich chocolate cake");
            case CHEESE:
                return new CheeseCake("Cheese Cake", "Creamy cheese cake");    
            default:
                throw new IllegalArgumentException("Unknown cake type: " + type);
        }
    }
}
