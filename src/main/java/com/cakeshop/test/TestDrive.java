package com.cakeshop.test;

import java.util.ArrayList;

import com.cakeshop.factories.CakeFactory;
import com.cakeshop.factories.Factory;
import com.cakeshop.factories.ToppingsFactory;
import com.cakeshop.cake.Cake;

public class TestDrive {
    public static void main(String[] args) {
        System.out.println("Cake Shop Test Drive");

        Factory cfactory = new CakeFactory();
        ToppingsFactory tfactory = new ToppingsFactory();
        ArrayList<ToppingsFactory.ToppingType> toppings = new ArrayList<>();
        toppings.add(ToppingsFactory.ToppingType.CHOCOLATE_CHIPS);
        toppings.add(ToppingsFactory.ToppingType.CREAM);
        toppings.add(ToppingsFactory.ToppingType.CHOCOLATE_CHIPS); 
        Cake c = cfactory.createCake(CakeFactory.CakeType.CHOCOLATE);
        System.out.println(c.getPrice());
        c.setPrice(7.00);
        c = tfactory.addTopping(c, toppings);
        System.out.println("Order Details: ");
        System.out.println("Description: " + c.getDescription());
        System.out.println("Cost: $" + c.cost());
    }
}