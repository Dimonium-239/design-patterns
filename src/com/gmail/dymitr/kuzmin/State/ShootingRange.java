package com.gmail.dymitr.kuzmin.State;

public class ShootingRange {
    public static void main(String[] args) {
        Gun revolver = new Gun();

        revolver.flipTheCylinder();
        revolver.pullTheTrigger();
        revolver.pullTheTrigger();
        revolver.pullTheTrigger();
        revolver.pullTheTrigger();
        revolver.pullTheTrigger();
        revolver.pullTheTrigger();
        revolver.flipTheCylinder();
        revolver.pullTheTrigger();
        revolver.pullTheTrigger();
        revolver.flipTheCylinder();

        revolver.removeCartridgeCase();
        revolver.insertNewCartridge();
        revolver.flipTheCylinder();
        revolver.pullTheTrigger();
    }
}
