package com.gmail.dymitr.kuzmin.Decorator.Toppings;

import com.gmail.dymitr.kuzmin.Decorator.Pizzas.Pizza;

public class Jalapenio extends ToppingDecorator {

    private Pizza pizza;

    public Jalapenio(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + "Jalapenio\n";
    }

    @Override
    public int getPrice(){
        return 2 + pizza.getPrice();
    }

}
