package com.solvd.deliveryservice.models;

import java.sql.Date;

public class License {
    private int number;
    private static int expirationDate;
    private String state;

    public License(int number, int expirationDate, String state) {
        this.expirationDate = expirationDate;
        this.number = number;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getExpirationDate() {
        return expirationDate;
    }

    public static void setExpirationDate(int expirationDate) {
        License.expirationDate = expirationDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return 0;
    }
}
