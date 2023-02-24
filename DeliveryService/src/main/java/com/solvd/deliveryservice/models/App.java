package com.solvd.deliveryservice.models;

public class App {
    private String rating;
    private int activeOrders;
    private int drivers;

    public String author;

    public int version;

    public App(String rating, int activeOrders, int drivers, int version, String author) {
        this.activeOrders = activeOrders;
        this.drivers = drivers;
        this.rating = rating;
        this.version = version;
        this.author = author;
    }

    public App() {

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getActiveOrders() {
        return activeOrders;
    }

    public void setActiveOrders(int activeOrders) {
        this.activeOrders = activeOrders;
    }

    public int getDrivers() {
        return drivers;
    }

    public void setDrivers(int drivers) {
        this.drivers = drivers;
    }

    public void setVersion(String s) {
    }

    public void setAuthor(String john_doe) {
    }

    public String getVersion() {
        return null;
    }

    public String getAuthor() {
        return null;
    }
}
