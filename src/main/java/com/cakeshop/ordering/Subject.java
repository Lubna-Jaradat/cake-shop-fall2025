package com.cakeshop.ordering;

import com.cakeshop.dashboards.*;

public interface Subject {
    public void registerObserver(Dashboard observer);

    public void removeObserver(Dashboard observer);

    public void notifyCustomer(String cakeName, int orderNo);

    public void notifyManager(String cakeName, int cakeCount);
}
