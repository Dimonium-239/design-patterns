package com.gmail.dymitr.kuzmin.TemplateMethod;

public class Farm {
    public static void main(String[] args) {
        Planter plantTree = new TreePlanter();
        Planter plantPotato = new PotatoPlanter();

        plantTree.plantersWork();
        plantPotato.plantersWork();
    }
}
