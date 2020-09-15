package com.gmail.dymitr.kuzmin.State;

public class ReloadingState implements State {

    private Gun gun;

    public ReloadingState(Gun gun) {
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
        if(gun.getCartridges() < 6)
            for(int i=0; i< 6-gun.getCartridges(); i++)
                System.out.println("Cartridge case is removed");
    }

    @Override
    public void insertNewCartridge() {
        gun.reload();
    }


    @Override
    public void pullTheTrigger() {
        gun.setState(gun.getShootingState());
        gun.pullTheTrigger();
    }
}
