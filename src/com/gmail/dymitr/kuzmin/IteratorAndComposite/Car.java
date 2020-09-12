package com.gmail.dymitr.kuzmin.IteratorAndComposite;

public class Car {
    private Brand brand;
    private String model;
    private long price;

    public Car(Brand brand, String model, long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{ " + brand +
                " " + model + '\'' +
                ", price=" + price +
                "$ }";
    }
}
