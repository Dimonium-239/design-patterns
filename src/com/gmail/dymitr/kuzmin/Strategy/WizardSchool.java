package com.gmail.dymitr.kuzmin.Strategy;

import com.gmail.dymitr.kuzmin.Strategy.SpellBehavior.*;
import com.gmail.dymitr.kuzmin.Strategy.CurseBehavior.*;
import com.gmail.dymitr.kuzmin.Strategy.Wizards.*;

public class WizardSchool {
    public static void main(String[] args) {
        Spell heal = new Healing();
        Curse poisoning = new Poisoning();

        Wizard dalandur = new Elf(heal, poisoning);

        dalandur.display();
        dalandur.fightByBow();
        dalandur.fightBySword();
        dalandur.castSpell();
        dalandur.castCurse();
        dalandur.setCurse(new StaminaDecreasing());
        dalandur.castCurse();
    }
}
