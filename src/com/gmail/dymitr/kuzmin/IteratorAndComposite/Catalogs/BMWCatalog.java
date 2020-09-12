package com.gmail.dymitr.kuzmin.IteratorAndComposite.Catalogs;

import com.gmail.dymitr.kuzmin.IteratorAndComposite.Iterators.BMWIterator;
import com.gmail.dymitr.kuzmin.IteratorAndComposite.Brand;
import com.gmail.dymitr.kuzmin.IteratorAndComposite.Car;

import java.util.Iterator;

public class BMWCatalog implements Catalog{
    private static final int MAX_CARS = 4;
    private int numberOfCars = 0;
    private Car[] BMWs;

    public BMWCatalog() {
        BMWs = new Car[MAX_CARS];

        addBMW("X5", 59_400);
        addBMW("i3 Sedan", 44_450);
        addBMW("2 Series Gran Coupe", 37_700);
        addBMW("M2", 58_900);
        //addBMW("M8", 133_000);
    }

    public void addBMW(String model, long price){
        if(numberOfCars >= MAX_CARS) System.err.println("Followed current contract, we can not order more than "+ MAX_CARS +" BMW cars");
        else BMWs[numberOfCars++] = new Car(Brand.BMW, model, price);
    }

    @Override
    public Iterator createIterator() {
        return new BMWIterator(BMWs);
    }
}
