package com.gmail.dymitr.kuzmin.IteratorAndComposite.Catalogs;

import com.gmail.dymitr.kuzmin.IteratorAndComposite.Brand;
import com.gmail.dymitr.kuzmin.IteratorAndComposite.Car;

import java.util.ArrayList;
import java.util.Iterator;

public class FordCatalog implements Catalog{

    private ArrayList<Car> fords;

    public FordCatalog() {
        fords = new ArrayList<>();

        addFord("Mustang", 100_000);
        addFord("Focus", 20_000);
        addFord("Fiesta", 40_000);
        addFord("Shelby", 250_000);
    }

    public void addFord(String model, long price){
        fords.add(new Car(Brand.FORD, model, price));
    }

    @Override
    public Iterator createIterator() {
        return fords.iterator();
    }
}
