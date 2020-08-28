package com.gmail.dymitr.kuzmin.Strategy.SpellBehavior;

public class Healing implements Spell{
    @Override
    public void spelling() {
        System.out.println("Spell::Healing");
    }
}
