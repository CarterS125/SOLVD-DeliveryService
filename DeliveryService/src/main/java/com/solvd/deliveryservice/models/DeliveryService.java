package com.solvd.deliveryservice.models;

import java.sql.Driver;
import java.util.List;

public class DeliveryService {
    private String name;
    private String location;
    private List<String> deliveryTypes;

    public DeliveryService(String name, String location, List<String> deliveryTypes) {
        this.name = name;
        this.location = location;
        this.deliveryTypes = deliveryTypes;
    }

    public DeliveryService() {

    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getDeliveryTypes() {
        return deliveryTypes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDeliveryTypes(List<String> deliveryTypes) {
        this.deliveryTypes = deliveryTypes;
    }

    public List<User> getUsers() {
        return null;
    }

    public void setUsers(List<User> users) {
    }

    public List<Driver> getDrivers() {
        return null;
    }

    public void setDrivers(List<Driver> drivers) {
    }

    public List<Store> getStores() {
        return null;
    }

    public void setStores(List<Store> stores) {
    }

    public List<Item> getItems() {
        return null;
    }

    public void setItems(List<Item> items) {
    }

    public List<Order> getOrders() {
        return null;
    }

    public void setOrders(List<Order> orders) {
    }

    public List<Address> getAddresses() {
        return null;
    }

    public void setAddresses(List<Address> addresses) {
    }

    public List<License> getLicenses() {
        return null;
    }

    public void setLicenses(List<License> licenses) {
    }

    public List<Car> getCars() {
        return null;
    }

    public void setCars(List<Car> cars) {
    }

    public App getApp() {
        return null;
    }

    public void setApp(App app) {
    }
}
