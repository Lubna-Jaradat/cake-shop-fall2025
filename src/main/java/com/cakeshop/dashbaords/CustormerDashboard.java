package com.cakeshop.dashbaords;

public class CustormerDashboard implements Dashboard {

    private String Name;
    private int OrderNo;
    private String cakeName;

    public CustormerDashboard(String Name) {
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
