package com.cakeshop.dashboards;

import com.cakeshop.Customer.Customer;

public class CustomerDashboard implements Dashboard {

    private Customer customer;
    private int OrderNo;
    private String cakeName;

    public CustomerDashboard(Customer customer) {
        this.customer = customer;
    }

    public void update(String cakeName, int orderNo) {
        this.OrderNo = orderNo;
        this.cakeName = cakeName;

        System.out.println("[Customer Dashboard] Hello " + customer.getName() +
                "! Your order is ready: " + cakeName +
                " | Order No: " + orderNo);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getLastOrderNo() {
        return OrderNo;
    }

    public String getCakeName() {
        return cakeName;
    }

}
