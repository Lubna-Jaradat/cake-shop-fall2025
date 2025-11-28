package com.cakeshop.Customer;

import java.util.ArrayList;

import com.cakeshop.factories.Factory.CakeType;
import com.cakeshop.factories.ToppingsFactory.ToppingType;
import com.cakeshop.ordering.*;

public class Customer {

    private String userName;

    private OrderingSystem orderingSystem;

    public Customer(String userName,OrderingSystem orderingSystem) {
        this.userName = userName;
        this.orderingSystem = orderingSystem;
    }

    public void placeOrder(CakeType cakeType, ArrayList<ToppingType> toppings) {
        orderingSystem.order(cakeType, toppings);
    }

    public void placeOrder(CakeType cakeType) {
        orderingSystem.order(cakeType);
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }
}
