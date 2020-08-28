package com.gmail.dymitr.kuzmin.Strategy.Wizards;

import com.gmail.dymitr.kuzmin.Strategy.CurseBehavior.Curse;
import com.gmail.dymitr.kuzmin.Strategy.SpellBehavior.Spell;

public class Wizard {

    private Spell spell;

    private Curse curse;

    public Wizard(Spell spell, Curse curse) {
        this.spell = spell;
        this.curse = curse;
    }

    public void fightBySword(){
        System.out.println("Sword kick");
    }
    
    public void fightByFist(){
        System.out.println("Fist kick");
    }
    
    public void fightByBow(){
        System.out.println("Arrow");
    }

    public void castSpell(){
        spell.spelling();
    }

    public void castCurse(){
        curse.cursing();
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setCurse(Curse curse) {
        this.curse = curse;
    }

    public void display() {
        System.out.println("Unknown hero");
    }
}
