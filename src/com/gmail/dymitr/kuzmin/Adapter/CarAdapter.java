package com.gmail.dymitr.kuzmin.Adapter;

public class CarAdapter implements Boat{
    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void fleeing() {
        car.running();
    }

    @Override
    public void fuel() {
        car.fuel();
    }
}
