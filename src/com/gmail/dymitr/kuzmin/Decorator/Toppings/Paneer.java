package com.gmail.dymitr.kuzmin.Decorator.Toppings;

import com.gmail.dymitr.kuzmin.Decorator.Pizzas.Pizza;

public class Paneer extends ToppingDecorator{

    private Pizza pizza;

    public Paneer(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Paneer\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}
