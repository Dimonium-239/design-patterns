package com.gmail.dymitr.kuzmin.IteratorAndComposite;

import com.gmail.dymitr.kuzmin.IteratorAndComposite.Catalogs.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarShowroom {
    private List<Catalog> catalogs;

    public CarShowroom(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    public void showCatalog(){
        for (Catalog carCatalog : catalogs)
            showCar(carCatalog.createIterator());
    }

    private void showCar(Iterator<Car> carIterator){
        while (carIterator.hasNext())
            System.out.println(carIterator.next());
    }
}
