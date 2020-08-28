package com.gmail.dymitr.kuzmin.Observer;

public abstract class Subject{

    abstract void registerObserver(Observer observer);

    abstract void unregisterObserver(Observer observer);

    abstract void notifyObserver();

}
