package com.solvd.deliveryservice.models;

import java.sql.Driver;
import java.util.List;

public class Order {
    private int avgOrders;
    private int price;

    private String address;

    private int id;

    private int userId;

    private int storeId;


    private List<Order> orders;

    public Order(int avgOrders, int price, String address, int id, int userId, int storeId) {
        this.avgOrders = avgOrders;
        this.price = price;
        this.address = address;
        this.id = id;
        this.userId = userId;
        this.storeId = storeId;
    }

    public Order() {

    }

    public int getAvgOrders() {
        return avgOrders;
    }

    public void setAvgOrders(int avgOrders) {
        this.avgOrders = avgOrders;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
    }

    public void setUserId(int userId) {
    }

    public void setAddressId(int addressId) {
    }

    public void setStoreId(int i) {
    }

    public void setTotalCost(double v) {
    }

    public void setAddress(String address) {
    }

    public int getId() {
        return 0;
    }

    public String getUserId() {
        return null;
    }

    public String getStoreId() {
        return null;
    }

    public String getTotalCost() {
        return null;
    }

    public void setDriver(Driver driver) {
    }

    public void setUser(User user) {
    }

    public void setStore(Store store) {
    }
}
