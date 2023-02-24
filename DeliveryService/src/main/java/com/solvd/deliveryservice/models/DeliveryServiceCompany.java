package com.solvd.deliveryservice.models;

public class DeliveryServiceCompany {
    private String address;
    private String name;

    public DeliveryServiceCompany(String address, String name) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
