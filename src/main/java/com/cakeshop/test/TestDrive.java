package com.cakeshop.test;

import java.util.ArrayList;

import com.cakeshop.factories.ToppingsFactory;
import com.cakeshop.factories.Factory.CakeType;
import com.cakeshop.ordering.OrderingSystem;
import com.cakeshop.Customer.Customer;
import com.cakeshop.dashboards.CustomerDashboard;
import com.cakeshop.dashboards.ManagerDashboard;

public class TestDrive {
    public static void main(String[] args) {

        System.out.println("Cake Shop Test Drive");

        OrderingSystem os = OrderingSystem.getInstance();
        Customer c = new Customer("Rayan", os);
        ManagerDashboard md = new ManagerDashboard();
        CustomerDashboard cd = new CustomerDashboard(c);

        ArrayList<ToppingsFactory.ToppingType> toppings = new ArrayList<>();
        toppings.add(ToppingsFactory.ToppingType.CHOCOLATE_CHIPS);
        toppings.add(ToppingsFactory.ToppingType.CREAM);
        toppings.add(ToppingsFactory.ToppingType.CHOCOLATE_CHIPS);

        os.registerObserver(cd);
        os.registerObserver(md);

        c.placeOrder(CakeType.APPLE);
        c.placeOrder(CakeType.APPLE);
        c.placeOrder(CakeType.APPLE);
        c.placeOrder(CakeType.APPLE, toppings);

        System.out.println(c.getName());
        c.placeOrder(CakeType.CHOCOLATE);
<<<<<<< HEAD
        c.placeOrder(CakeType.CHOCOLATE, toppings);
        c.placeOrder(CakeType.CHEESE, toppings);

=======
        c.placeOrder(CakeType.CHOCOLATE,toppings);
        c.placeOrder(CakeType.CHEESE,toppings);
>>>>>>> feature/ordering
    }
}