package com.gmail.dymitr.kuzmin.Command.CarCommands;

import com.gmail.dymitr.kuzmin.Command.Car;
import com.gmail.dymitr.kuzmin.Command.Command;

public class StopEngineCommand implements Command {

    private Car car;

    public StopEngineCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("Stop engine:");
        car.pressTheClutch();
        car.hitTheBrake();
        car.gearLeverN();
        car.releaseTheClutch();
        car.releaseTheBrake();
        car.turnTheKeyOff();
        System.out.println();
    }
}
