package com.gmail.dymitr.kuzmin.IteratorAndComposite.Catalogs;

import com.gmail.dymitr.kuzmin.IteratorAndComposite.CarShowroom;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TODO: complete 'Composite pattern' for this problem
        CarShowroom carShowroom = new CarShowroom(Arrays.asList(
                new FordCatalog(),
                new BMWCatalog(),
                new HondaCatalog()
                ));
        carShowroom.showCatalog();
    }
}
