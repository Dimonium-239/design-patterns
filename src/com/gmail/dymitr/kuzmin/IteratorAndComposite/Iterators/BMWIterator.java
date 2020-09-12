package com.gmail.dymitr.kuzmin.IteratorAndComposite.Iterators;

import com.gmail.dymitr.kuzmin.IteratorAndComposite.Car;

import java.util.Iterator;

public class BMWIterator implements Iterator {
    private Car[] BMWs;
    private int position = 0;

    public BMWIterator(Car[] BMWs) {
        this.BMWs = BMWs;
    }

    @Override
    public boolean hasNext() {
        return !(position >= BMWs.length || BMWs[position]==null);
    }

    @Override
    public Object next() {
        return BMWs[position++];
    }

    @Override
    public void remove() {
        if (position <= 0)
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        if (BMWs[position-1] != null)
            for (int i = position-1; i < (BMWs.length-1); i++)
                BMWs[i] = BMWs[i+1];
            BMWs[BMWs.length-1] = null;
    }
}
