package com.cakeshop.dashbaords; 

import java.util.HashMap;
import java.util.Map;

public class ManagerDashboard implements Dashboard {

    private Map<String, Integer> totalSales = new HashMap<>();

    public void update(String cakeName, int cakeCount) {

        totalSales.put(cakeName, cakeCount);

        System.out.println("[Manager Dashboard] Updated Sales: " 
                + cakeName + " = " + cakeCount);
    }

    public Map<String, Integer> getTotalSales() {
        return new HashMap<>(totalSales);
    }
}
