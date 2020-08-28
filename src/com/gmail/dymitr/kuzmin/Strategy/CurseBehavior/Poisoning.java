package com.gmail.dymitr.kuzmin.Strategy.CurseBehavior;

public class Poisoning implements Curse{
    @Override
    public void cursing() {
        System.out.println("Cursed::Poisoned");
    }
}
