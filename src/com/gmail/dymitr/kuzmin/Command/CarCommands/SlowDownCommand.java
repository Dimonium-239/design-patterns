package com.gmail.dymitr.kuzmin.Command.CarCommands;

import com.gmail.dymitr.kuzmin.Command.Car;
import com.gmail.dymitr.kuzmin.Command.Command;

public class SlowDownCommand implements Command {

    private Car car;

    public SlowDownCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("Slow down:");
        car.releaseTheGas();
        car.pressTheClutch();
        car.hitTheBrake();
        car.gearLeverDown();
        car.releaseTheBrake();
        System.out.println();
    }
}
