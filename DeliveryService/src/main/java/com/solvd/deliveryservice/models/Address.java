package com.solvd.deliveryservice.models;

import java.util.List;

public class Address {
    private String pointTo;
    private String pointFrom;

    private String state;

    private String city;

    private String street;

    private int zip;

    private List<Address> address;

    public Address(String pointFrom, String pointTo, String state, String city, String street, int zip, int id) {
        this.pointFrom = pointFrom;
        this.pointTo = pointTo;
        this.state = state;
        this.city = city;
        this.street = street;
        this.zip = zip;
    }

    public Address() {

    }

    public String getPointTo() {
        return pointTo;
    }

    public void setPointTo(String pointTo) {
        this.pointTo = pointTo;
    }

    public String getPointFrom() {
        return pointFrom;
    }

    public void setPointFrom(String pointFrom) {
        this.pointFrom = pointFrom;
    }

    public void setId(int id) {
    }

    public int getId() {
        return 0;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
