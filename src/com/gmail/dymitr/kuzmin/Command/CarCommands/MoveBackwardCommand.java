package com.gmail.dymitr.kuzmin.Command.CarCommands;

import com.gmail.dymitr.kuzmin.Command.Car;
import com.gmail.dymitr.kuzmin.Command.Command;

public class MoveBackwardCommand implements Command {

    private Car car;

    public MoveBackwardCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("Move backward:");
        car.pressTheClutch();
        car.gearLeverR();
        car.releaseTheClutch();
        car.pressTheGas();
        System.out.println();
    }
}
