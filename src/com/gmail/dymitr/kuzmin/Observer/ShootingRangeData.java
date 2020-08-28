package com.gmail.dymitr.kuzmin.Observer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShootingRangeData extends Subject{

    private int rounds;
    private int shootsPerRound;
    private float calibre;
    private int hits;
    private List<Observer> observerList;

    public ShootingRangeData() {
        this.observerList = new LinkedList<>();
    }

    @Override
    void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    void unregisterObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Iterator<Observer> it = observerList.iterator(); it.hasNext();){
            Observer o = it.next();
            o.update(rounds, shootsPerRound);
        }
    }

    private int getRounds() {
        return 5;
    }

    private int getShootsPerRound() {
        return 10;
    }

    public void updateData(){
        this.rounds = getRounds();
        this.shootsPerRound = getShootsPerRound();
    }
}
