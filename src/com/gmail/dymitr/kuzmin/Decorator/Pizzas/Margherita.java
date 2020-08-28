package com.gmail.dymitr.kuzmin.Decorator.Pizzas;

public class Margherita extends Pizza{

    public Margherita(){
        description = "Margherita\n-----------------\n";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 7;
    }

}
