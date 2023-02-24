package com.solvd.deliveryservice.models;

import java.util.List;

public class Store {
    private String name;
    private String type;
    private String location;

    private int id;

    private List<Store> stores;

    public Store(String name, String type, String location, int id) {
        this.location = location;
        this.type = type;
        this.name = name;
        this.id = id;
    }

    public Store() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int i) {
    }

    public int getId() {
        return 0;
    }
}
