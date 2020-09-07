package com.gmail.dymitr.kuzmin.Command.CarCommands;

import com.gmail.dymitr.kuzmin.Command.Car;
import com.gmail.dymitr.kuzmin.Command.Command;

public class AccelerateCommand implements Command {

    private Car car;

    public AccelerateCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("Accelerate:");
        car.pressTheGas();
        car.releaseTheGas();
        car.pressTheClutch();
        car.gearLeverUp();
        car.releaseTheClutch();
        car.pressTheGas();
        System.out.println();
    }
}
