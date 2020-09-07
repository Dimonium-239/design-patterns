package com.gmail.dymitr.kuzmin.Command;

import com.gmail.dymitr.kuzmin.Command.CarCommands.*;

public class Main {
    public static void main(String[] args) {
        Car extraMegaCoolCar = new Car();

        DriversBrain averageBrain = new DriversBrain();

        averageBrain.setCommand(new StartEngineCommand(extraMegaCoolCar));
        averageBrain.setCommand(new MoveBackwardCommand(extraMegaCoolCar));
        averageBrain.setCommand(new AccelerateCommand(extraMegaCoolCar));
        averageBrain.setCommand(new AccelerateCommand(extraMegaCoolCar));
        averageBrain.setCommand(new AccelerateCommand(extraMegaCoolCar));
        averageBrain.setCommand(new AccelerateCommand(extraMegaCoolCar));
        averageBrain.setCommand(new SlowDownCommand(extraMegaCoolCar));
        averageBrain.setCommand(new SlowDownCommand(extraMegaCoolCar));
        averageBrain.setCommand(new SlowDownCommand(extraMegaCoolCar));
        averageBrain.setCommand(new StopEngineCommand(extraMegaCoolCar));

        averageBrain.timeIsPassed();
    }
}
