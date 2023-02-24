package com.solvd.deliveryservice.models;

import java.util.List;

public class StoreOrder {
    private int amount;
    private int rating;

    private List<StoreOrder> storeOrders;

    public StoreOrder(int amount, int rating) {
        this.amount = amount;
        this.rating = rating;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
