package com.gmail.dymitr.kuzmin.Observer;

public class ShootingRangeConclusion {
    public static void main(String[] args) {
        CurrentScore score = new CurrentScore(12);
        Cheque cheque = new Cheque(.12f);


        ShootingRangeData data = new ShootingRangeData();
        data.registerObserver(score);
        data.registerObserver(cheque);

        data.updateData();
        data.notifyObserver();

        data.updateData();
        data.notifyObserver();

        data.unregisterObserver(cheque);
        data.notifyObserver();

    }
}
