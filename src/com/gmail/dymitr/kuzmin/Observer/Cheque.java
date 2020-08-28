package com.gmail.dymitr.kuzmin.Observer;

public class Cheque implements Observer{

    private int rounds;
    private int shootsPerRound;
    private float calibre;

    public Cheque(float calibre) {
        this.calibre = calibre;
    }

    @Override
    public void update(int rounds, int shootsPerRound) {
        this.rounds = rounds;
        this.shootsPerRound = shootsPerRound;
        display();
    }

    public void display(){
        System.out.println("Your cheque for "
                + shootsPerRound*rounds
                + " shoots is:\n"
                + shootsPerRound*rounds*(1+calibre)
                + " Eur.");
    }
}
