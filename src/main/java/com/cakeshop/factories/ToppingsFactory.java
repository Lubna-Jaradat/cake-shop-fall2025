package com.cakeshop.factories;

import java.util.ArrayList;

import com.cakeshop.cake.Cake;
import com.cakeshop.toppings.Skittles;
import com.cakeshop.toppings.Cream;
import com.cakeshop.toppings.ChocolateChips;

public class ToppingsFactory {
     public enum ToppingType { SKITTLES, CREAM, CHOCOLATE_CHIPS };

     public Cake addTopping(Cake cake, ArrayList<ToppingType> types){ 
        for(ToppingType type : types){
             cake = addTopping(cake, type);
         }
         return cake;
      }

     public Cake addTopping(Cake cake, ToppingType type){
        switch (type) {
            case SKITTLES:
                cake = new Skittles(cake);
                return cake;
            case CREAM:
                cake = new Cream(cake);
                return cake;
            case CHOCOLATE_CHIPS:
                cake = new ChocolateChips(cake);
                return cake;
            default:
                throw new IllegalArgumentException("Unknown cake type: " + type);
        }
        
     }
}
