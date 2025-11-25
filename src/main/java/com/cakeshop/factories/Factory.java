package com.cakeshop.factories;

import com.cakeshop.cake.Cake;


public abstract class Factory {
    public enum CakeType { APPLE, CHOCOLATE, CHEESE };
    public abstract Cake createCake(CakeType type);
}
