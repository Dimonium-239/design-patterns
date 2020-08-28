package com.gmail.dymitr.kuzmin.Adapter;

public class Ford implements Car{
    @Override
    public void running() {
        System.out.println("Go by road");
    }

    @Override
    public void fuel() {
        System.out.println("Gas");
    }
}
