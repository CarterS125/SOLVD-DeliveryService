package com.solvd.deliveryservice.models;

public class UserCar {
    private int amount;
    private String owner;


    public UserCar(int amount, String owner) {
        this.amount = amount;
        this.owner = owner;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
