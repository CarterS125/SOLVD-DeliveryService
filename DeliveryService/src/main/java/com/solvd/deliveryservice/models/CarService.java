package com.solvd.deliveryservice.models;

public class CarService {
    private int cost;
    private int yearOfCar;

    public CarService(int cost, int yearOfCar) {
        this.cost = cost;
        this.yearOfCar = yearOfCar;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYearOfCar() {
        return yearOfCar;
    }

    public void setYearOfCar(int yearOfCar) {
        this.yearOfCar = yearOfCar;
    }
}
