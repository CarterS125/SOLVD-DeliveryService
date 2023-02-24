package com.solvd.deliveryservice.models;

import java.util.List;

public class Car {
    private String make;
    private String model;

    private int year;

    private int price;

    private int id;

    private List<Car> car;

    public Car(int id, String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.id = id;
        this.year = year;
        this.price = price;

    }

    public Car() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return 0;
    }

    public int getYear() {
        return 0;
    }

    public double getPrice() {
        return 0;
    }
}
