package com.gmail.dymitr.kuzmin.Observer;

public class CurrentScore implements Observer{

    private int rounds;
    private int shootsPerRound;
    private int quantityOfHits;

    public CurrentScore(int quantityOfHits) {
        this.quantityOfHits = quantityOfHits;
    }

    @Override
    public void update(int rounds, int shootsPerRound) {
        this.rounds = rounds;
        this.shootsPerRound = shootsPerRound;
        display();
    }

    public void display(){
        float score = ((float)quantityOfHits/(float)(shootsPerRound*rounds)*100);
        System.out.println("Shoots per round: " + shootsPerRound +
        "\nRounds: " + rounds +
        "\nHits: " + quantityOfHits + '\\' + shootsPerRound*rounds +
        "\nYour current score is: " + score + "\\100\n");
    }
}
