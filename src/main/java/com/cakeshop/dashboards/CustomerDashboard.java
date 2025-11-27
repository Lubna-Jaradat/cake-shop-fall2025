package com.cakeshop.dashboards;

public class CustomerDashboard implements Dashboard {

    private String Name;
    private int OrderNo;
    private String cakeName;

    public CustomerDashboard(String Name) {
        this.Name = Name;
    }

    public void update(String cakeName, int orderNo) {
        this.OrderNo = orderNo;
        this.cakeName = cakeName;

        System.out.println("[Customer Dashboard] Hello " + Name +
                "! Your order is ready: " + cakeName +
                " | Order No: " + orderNo);
    }

    public String getCustomerName() {
        return Name;
    }

    public int getLastOrderNo() {
        return OrderNo;
    }

    public String getCakeName() {
        return cakeName;
    }

}
