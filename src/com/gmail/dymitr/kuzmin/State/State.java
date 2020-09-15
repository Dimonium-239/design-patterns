package com.gmail.dymitr.kuzmin.State;

public interface State {
    void flipTheCylinder();
    void removeCartridgeCase();
    void insertNewCartridge();
    void pullTheTrigger();
}
