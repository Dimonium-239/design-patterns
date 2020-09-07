package com.gmail.dymitr.kuzmin.Command;

public class Car {

    private static int gear = 0;

    public void turnTheKeyOn(){
        System.out.println("Car::turns the key on");
    }

    public void turnTheKeyOff(){
        System.out.println("Car::turns the key off");
    }

    public void hitTheBrake(){
        System.out.println("Car::hits the brake");
    }

    public void releaseTheBrake(){
        System.out.println("Car::release the brake");
    }

    public void pressTheClutch(){
        System.out.println("Car::press the clutch");
    }

    public void releaseTheClutch(){
        System.out.println("Car::release the clutch");
    }

    public void pressTheGas(){
        System.out.println("Car::press the gas");
    }

    public void releaseTheGas(){
        System.out.println("Car::release the gas");
    }

    public void gearLeverUp(){
        System.out.println("Car::gear lever is on " + ++gear + " gear");
    }

    public void gearLeverDown(){
        System.out.println("Car::gear lever is on " + --gear + " gear");
    }

    public void gearLeverN(){
        gear = 0;
        System.out.println("Car::gear lever if on N gear");
    }

    public void gearLeverR(){
        System.out.println("Car::gear lever R on gear");
    }
}
