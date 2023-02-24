package com.solvd.deliveryservice.models;

import java.util.List;

public class Item {
    private String itemName;
    private int price;
    private String description;
    private int id;
    private int storeId;


    private List<Item> items;

    public Item(String itemName, int price, String description, int id, int storeId) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.id = id;
        this.storeId = storeId;
    }

    public Item() {

    }

    public Item(String name, String description, double price) {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
    }

    public int getIdStoreOrder() {
        return 0;
    }

    public String getItemDescription() {
        return null;
    }

    public void setName(String bread) {
    }

    public String getName() {
        return null;
    }

    public String getId() {
        return null;
    }
}
