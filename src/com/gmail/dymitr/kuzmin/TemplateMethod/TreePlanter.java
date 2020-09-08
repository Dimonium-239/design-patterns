package com.gmail.dymitr.kuzmin.TemplateMethod;

public class TreePlanter extends Planter{
    @Override
    void digPit() {
        System.out.println("Pit dig in 0.85m");
    }

    @Override
    void pourByWater() {
        System.out.println("Pour by 12L");
    }

    @Override
    void addFertilizer() {
        System.out.println("Add saltpeter");
    }

    @Override
    void addPlantToSoil() {
        System.out.println("Insert tree");
    }

    @Override
    void completeFinaleStages() {
        System.out.println("Make a circle around trunk");
    }
}
