package com.gmail.dymitr.kuzmin.Adapter;

public class OneEngineMotorBoat implements Boat {
    @Override
    public void fleeing() {
        System.out.println("Flee in river");
    }

    @Override
    public void fuel() {
        System.out.println("Gasoline");
    }
}
