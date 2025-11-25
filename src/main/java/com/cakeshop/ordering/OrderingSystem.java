package com.cakeshop.ordering;

import com.cakeshop.*;
import com.cakeshop.dashbaords.*;
import com.cakeshop.cake.*;
import com.cakeshop.factories.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderingSystem implements Subject {

    private static OrderingSystem uniqueInstance;

    private OrderingSystem() {
        customerObservers = new ArrayList<>();
        managerObservers = new ArrayList<>();
        soldCake = new HashMap<>();
        factory = new CakeFactory();
        toppingsFactory = new ToppingsFactory();
    }

    public static synchronized OrderingSystem getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new OrderingSystem();
        }
        return uniqueInstance;
    }

    
    private final List<Dashboard> customerObservers;
    private final List<Dashboard> managerObservers;

    private final Map<String, Integer> soldCake;
    private int orderNum = 0;

    private final CakeFactory factory;
    private final ToppingsFactory toppingsFactory;

   
    public void registerObserver(Dashboard observer) {
        if (observer instanceof CustormerDashboard) {
            if (!customerObservers.contains(observer)) customerObservers.add(observer);
        } else if (observer instanceof ManagerDashboard) {
            if (!managerObservers.contains(observer)) managerObservers.add(observer);
        } else {
            if (!customerObservers.contains(observer)) customerObservers.add(observer);
            if (!managerObservers.contains(observer)) managerObservers.add(observer);
        }
    }

    
    public void removeObserver(Dashboard observer) {
        customerObservers.remove(observer);
        managerObservers.remove(observer);
    }

    
    public void notifyCustomer(String cakeName, int orderNo) {
        for (Dashboard d : new ArrayList<>(customerObservers)) {
            try {
                d.update(cakeName, orderNo);
            } catch (Exception e) {
                System.err.println("Failed to notify a customer dashboard: " + e.getMessage());
            }
        }
    }

    public void notifyManager(String cakeName, int cakeCount) {
        for (Dashboard d : new ArrayList<>(managerObservers)) {
            try {
                d.update(cakeName, cakeCount);
            } catch (Exception e) {
                System.err.println("Failed to notify a manager dashboard: " + e.getMessage());
            }
        }
    }


    public Cake order(String cakeType, String[] toppings) {
        Cake cake = factory.createCake(cakeType);

        if (toppings != null && toppings.length > 0) {
            cake = toppingsFactory.addToppings(cake, toppings);
        }

        orderNum++;
        cake.setOrderNo(orderNum);

        String cakeName = cake.getName(); 
        soldCake.put(cakeName, soldCake.getOrDefault(cakeName, 0) + 1);
        int cakeCount = soldCake.get(cakeName);

        notifyCustomer(cakeName, cake.getOrderNo());
        notifyManager(cakeName, cakeCount);

        return cake;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public Map<String, Integer> getSoldCakeMap() {
        return new HashMap<>(soldCake);
    }
}
