package com.gmail.dymitr.kuzmin.Factory.Computers;

public class Phone extends Computer{
    private String RAM;
    private String HDD;
    private String CPU;

    public Phone(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
