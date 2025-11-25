package com.cakeshop.ordering;
import com.cakeshop.dashbaords.*;;
public interface Subject {
    void registerObserver(Dashboard observer);
    void removeObserver(Dashboard observer);
    void notifyCustomer(String cakeName, int orderNo);
    void notifyManager(String cakeName, int cakeCount);
}
