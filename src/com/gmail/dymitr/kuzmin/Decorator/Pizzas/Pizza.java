package com.gmail.dymitr.kuzmin.Decorator.Pizzas;

public abstract class Pizza {

    String description = "<Pizza>";

    public abstract String getDescription();

    public abstract int getPrice();

    public void print(){
        System.out.println(getDescription() + "\n" + getPrice() + " Eur.");
    }
}
