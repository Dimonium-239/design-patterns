package com.gmail.dymitr.kuzmin.Factory.Computers;

public abstract class Computer {

    protected abstract String getRAM();
    protected abstract String getHDD();
    protected abstract String getCPU();

    @Override
    public String toString(){
        return "RAM: " + getRAM() + " HDD: " + getHDD() + " CPU: " + getCPU();
    }
}
