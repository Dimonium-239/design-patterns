package com.gmail.dymitr.kuzmin.TemplateMethod;

public abstract class Planter {

    public final void plantersWork(){
        prepareSoil();
        toPlant();
    }

    public final void prepareSoil(){
        System.out.println("Prepare soil:");
        digPit();
        pourByWater();
        addFertilizer();
        System.out.println();
    }

    public final void toPlant(){
        System.out.println("Plant:");
        addPlantToSoil();
        buryPit();
        pourByWater();
        completeFinaleStages();
        System.out.println();
    }

    abstract void digPit();
    abstract void pourByWater();
    abstract void addFertilizer();

    abstract void addPlantToSoil();
    public void buryPit(){
        System.out.println("Bury the soil that was dug");
    }
    abstract void completeFinaleStages();

}
