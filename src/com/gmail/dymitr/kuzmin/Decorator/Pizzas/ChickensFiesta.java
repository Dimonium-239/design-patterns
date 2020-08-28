package com.gmail.dymitr.kuzmin.Decorator.Pizzas;

public class ChickensFiesta extends Pizza {

    public ChickensFiesta() {
        description = "Chicken's Fiesta\n-----------------\n";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 15;
    }

}
