package com.gmail.dymitr.kuzmin.Command;

import java.util.ArrayList;
import java.util.List;


public class DriversBrain {

    private List<Command> commands;

    public DriversBrain(){
        commands = new ArrayList<>();
    }

    public void setCommand(Command command){
        commands.add(command);
    }

    public void timeIsPassed(){
        for (Command command : commands)
            command.execute();
    }
}
