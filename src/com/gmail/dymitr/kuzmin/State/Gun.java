package com.gmail.dymitr.kuzmin.State;

public class Gun implements State{
    private State loadedState;
    private State shootingState;
    private State unloadedState;
    private State reloadingState;

    private State state;

    private int cartridges = 6;

    public Gun() {
        this.loadedState = new LoadedState(this);
        this.shootingState = new ShootingState(this);
        this.unloadedState = new UnloadedState(this);
        this.reloadingState = new ReloadingState(this);
        this.state = this.loadedState;
    }

    public int shoot(){
        if(cartridges <= 0) return cartridges;
        return cartridges--;
    }

    public int reload(){
        if(cartridges >= 6) return cartridges;
        return cartridges++;
    }

    public int getCartridges(){
        return cartridges;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getLoadedState() {
        return loadedState;
    }

    public State getShootingState() {
        return shootingState;
    }

    public State getReloadingState() {
        return reloadingState;
    }

    public State getUnloadedState() {
        return unloadedState;
    }

    @Override
    public void flipTheCylinder() {
        state.flipTheCylinder();
    }

    @Override
    public void removeCartridgeCase() {
        state.removeCartridgeCase();
    }

    @Override
    public void insertNewCartridge() {
        state.insertNewCartridge();
    }

    @Override
    public void pullTheTrigger() {
        state.pullTheTrigger();
    }
}
