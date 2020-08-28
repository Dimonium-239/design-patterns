package com.gmail.dymitr.kuzmin.Strategy.Wizards;

import com.gmail.dymitr.kuzmin.Strategy.CurseBehavior.Curse;
import com.gmail.dymitr.kuzmin.Strategy.SpellBehavior.Spell;

public class Pyromancer extends Wizard{

    public Pyromancer(Spell spell, Curse curse) {
        super(spell, curse);
    }

    public void display(){
        System.out.println("Pyronamcer");
    }
}
