package com.gmail.dymitr.kuzmin.Decorator.Toppings;

import com.gmail.dymitr.kuzmin.Decorator.Pizzas.Pizza;

public class FreshTomato extends ToppingDecorator{

    private Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Fresh tomato\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }

}
