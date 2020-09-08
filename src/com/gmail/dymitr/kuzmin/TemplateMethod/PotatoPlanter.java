package com.gmail.dymitr.kuzmin.TemplateMethod;

public class PotatoPlanter extends Planter{
    @Override
    void digPit() {
        System.out.println("Pit dig in 0.1m");
    }

    @Override
    void pourByWater() {
        System.out.println("Pour by 0.75L");
    }

    @Override
    void addFertilizer() {
        System.out.println("Fertilizer against pests");
    }

    @Override
    void addPlantToSoil() {
        System.out.println("Insert potato");
    }

    @Override
    void completeFinaleStages() {
        System.out.println("To spud");
    }
}
