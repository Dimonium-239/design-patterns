package com.gmail.dymitr.kuzmin.IteratorAndComposite.Catalogs;

import com.gmail.dymitr.kuzmin.IteratorAndComposite.Brand;
import com.gmail.dymitr.kuzmin.IteratorAndComposite.Car;

import java.util.Iterator;
import java.util.LinkedList;

public class HondaCatalog implements Catalog{
    private LinkedList<Car> hondas;

    public HondaCatalog() {
        hondas = new LinkedList<>();

        addHonda("Civic", 23_000);
        addHonda("Odyssey", 45_000);
        addHonda("CR-V", 55_000);
        addHonda("Accord", 25_000);
    }

    public void addHonda(String model, long price){
        hondas.add(new Car(Brand.HONDA, model, price));
    }

    @Override
    public Iterator createIterator() {
        return hondas.iterator();
    }
}
