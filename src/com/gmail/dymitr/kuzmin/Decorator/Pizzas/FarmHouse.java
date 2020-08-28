package com.gmail.dymitr.kuzmin.Decorator.Pizzas;

public class FarmHouse extends Pizza{

    public FarmHouse() {
        description = "Farm House\n-----------------\n";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 11;
    }

}
