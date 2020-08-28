package com.gmail.dymitr.kuzmin.Factory;

import com.gmail.dymitr.kuzmin.Factory.Computers.*;

public class ComputerFactory {
    public static Computer getComputer(String type,
                                       String RAM,
                                       String HDD,
                                       String CPU){
        return switch (type){
            case "PC" -> new PC(RAM, HDD, CPU);
            case "Server" -> new Server(RAM, HDD, CPU);
            case "Phone" -> new Phone(RAM, HDD, CPU);
            default -> null;
        };
    }
}
