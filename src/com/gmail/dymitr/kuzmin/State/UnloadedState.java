package com.gmail.dymitr.kuzmin.State;

public class UnloadedState implements State{
    private Gun gun;

    public UnloadedState(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void flipTheCylinder() {
        int cartridges = gun.getCartridges();
        if(cartridges == 0) System.out.println("Wow its empty");
        else gun.setState(gun.getReloadingState());
    }

    @Override
    public void removeCartridgeCase() {
        gun.setState(gun.getReloadingState());
    }

    @Override
    public void insertNewCartridge() {
        gun.setState(gun.getReloadingState());
    }

    @Override
    public void pullTheTrigger() {
        gun.setState(gun.getShootingState());
    }
}
