package com.gmail.dymitr.kuzmin.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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
