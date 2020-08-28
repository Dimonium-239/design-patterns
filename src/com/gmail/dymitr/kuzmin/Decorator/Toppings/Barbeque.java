package com.gmail.dymitr.kuzmin.Decorator.Toppings;

import com.gmail.dymitr.kuzmin.Decorator.Pizzas.Pizza;

public class Barbeque extends ToppingDecorator{

    private Pizza pizza;

    public Barbeque(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Barbeque\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }

}
