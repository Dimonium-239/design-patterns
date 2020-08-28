package com.gmail.dymitr.kuzmin.Factory;

import com.gmail.dymitr.kuzmin.Factory.Computers.*;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "6 GB", "225 Gb", "2.4 Hz");
        Computer server = ComputerFactory.getComputer("Server", "16 GB", "40 Tb", "3.2 Hz");
        Computer mobile = ComputerFactory.getComputer("Phone", "2 GB", "40 Gb", "1.8 Hz");

        System.out.println("PC\t  ::" + pc);
        System.out.println("Server::" + server);
        System.out.println("Phone ::" + mobile);
    }
}
