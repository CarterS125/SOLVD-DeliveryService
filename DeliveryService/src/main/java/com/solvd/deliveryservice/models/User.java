package com.solvd.deliveryservice.models;

import java.util.List;

public class User {
    private String fname;
    private String lname;
    private int age;
    private String email;
    private int id;

    private List<User> users;

    public User(String fname, String lname, int age, String email, int id) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.id = id;
    }

    public User() {

    }

    public User(String username, String password) {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
    }
    public void setEmail(String s) {
    }

    public void setName(String john_doe) {
    }

    public String getEmail() {
        return null;
    }

    public int getId() {
        return 0;
    }

    public String getName() {
        return null;
    }
}
