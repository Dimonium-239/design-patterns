package com.gmail.dymitr.kuzmin.Command.CarCommands;

import com.gmail.dymitr.kuzmin.Command.Car;
import com.gmail.dymitr.kuzmin.Command.Command;

public class StartEngineCommand implements Command {

    private Car car;

    public StartEngineCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("Start engine:");
        car.gearLeverN();
        car.turnTheKeyOn();
        System.out.println();
    }
}
