package com.gmail.dymitr.kuzmin.Adapter;

public class Main {
    public static void main(String[] args) {
        Car ford = new Ford();
        Boat boat = new OneEngineMotorBoat();

        Boat boatAdapted = new CarAdapter(ford);

        System.out.println("Ford:");
        ford.fuel();
        ford.running();

        System.out.println("Boat:");
        boat.fuel();
        boat.fleeing();

        System.out.println("Adapted:");
        boatAdapted.fuel();
        boatAdapted.fleeing();
    }
}
