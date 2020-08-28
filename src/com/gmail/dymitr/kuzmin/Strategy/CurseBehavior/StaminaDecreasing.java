package com.gmail.dymitr.kuzmin.Strategy.CurseBehavior;

public class StaminaDecreasing implements Curse{

    @Override
    public void cursing() {
        System.out.println("Cursed::Stamina decreased");
    }
}
