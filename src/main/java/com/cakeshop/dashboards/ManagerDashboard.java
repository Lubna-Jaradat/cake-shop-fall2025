package com.cakeshop.dashboards;

import java.util.HashMap;
import java.util.Map;

public class ManagerDashboard implements Dashboard {

    private Map<String, Integer> soldCake = new HashMap<>();

    public void update(String cakeName, int cakeCount) {

        soldCake.put(cakeName, cakeCount);

        System.out.println("[Manager Dashboard] Updated Sales: "
                + cakeName + " = " + cakeCount);
    }

    public Map<String, Integer> getSoldCake() {
        return soldCake;
    }
}
