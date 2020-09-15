package com.gmail.dymitr.kuzmin.State;

public class ShootingState implements  State{

    private Gun gun;

    public ShootingState(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void flipTheCylinder() {
        int cartridges = gun.getCartridges();
        System.out.println("You gut " + cartridges + " cartridges");
        if(cartridges == 0) gun.setState(gun.getUnloadedState());
    }

    @Override
    public void removeCartridgeCase() {
        System.out.println("Not now");
    }

    @Override
    public void insertNewCartridge() {
        System.out.println("Not now");
    }

    @Override
    public void pullTheTrigger() {
        if(gun.shoot() > 0) System.out.println("Bang");
        else {
            System.out.println("Click");
            gun.setState(gun.getUnloadedState());
        }
    }
}
