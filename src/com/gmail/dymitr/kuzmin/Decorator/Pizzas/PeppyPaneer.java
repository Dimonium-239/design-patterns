package com.gmail.dymitr.kuzmin.Decorator.Pizzas;

public class PeppyPaneer extends Pizza {

    public PeppyPaneer(){
        description = "Peppy Peaneer\n-----------------\n";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
