package com.gmail.dymitr.kuzmin.State;

public class LoadedState implements State {

    private Gun gun;
    private int cartridgesNumber;

    public LoadedState(Gun gun) {
        this.gun = gun;
        this.cartridgesNumber = gun.getCartridges();
    }

    @Override
    public void flipTheCylinder() {
        System.out.println("You got " + cartridgesNumber + " cartridges");
        if(cartridgesNumber == 6) System.out.println("It is full loaded");
        else gun.setState(gun.getReloadingState());
    }

    @Override
    public void removeCartridgeCase() {
        if(cartridgesNumber == 6) System.out.println("Nothing to do");
        else gun.setState(gun.getReloadingState());
    }

    @Override
    public void insertNewCartridge() {
        if(cartridgesNumber == 6) System.out.println("Nothing to do");
        else gun.setState(gun.getReloadingState());
    }


    @Override
    public void pullTheTrigger() {
        gun.setState(gun.getShootingState());
    }
}
