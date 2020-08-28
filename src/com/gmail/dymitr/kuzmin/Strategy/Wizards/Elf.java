package com.gmail.dymitr.kuzmin.Strategy.Wizards;

import com.gmail.dymitr.kuzmin.Strategy.CurseBehavior.Curse;
import com.gmail.dymitr.kuzmin.Strategy.SpellBehavior.Spell;

public class Elf extends Wizard {
    public Elf(Spell spell, Curse curse) {
        super(spell, curse);
    }

    public void display(){
        System.out.println("Elf");
    }
}
