package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.App;

public class AppDAO {

    public void createEntity(String rating, int activeOrders, int drivers, int version, String author) {
        App app = new App(rating, activeOrders, drivers, version, author);
    }

    public App getEntityById(long id) throws InterruptedException {
        App app = null;
        if (id == 1) {
            app = new App("4.5", 100, 500, 1, "John Doe");
        } else if (id == 2) {
            app = new App("4.0", 75, 300, 2, "Jane Doe");
        }

        if (app == null) {
            throw new InterruptedException("App with ID " + id + " not found");
        }
        return app;
    }

    public void removeEntity(long id) throws InterruptedException {
        App app = getEntityById(id);
        if (app != null) {

        } else {
            throw new InterruptedException("App with ID " + id + " not found");
        }
    }

    public void updateEntity(long id, String rating, int activeOrders, int drivers, int version, String author) throws InterruptedException {
        App app = getEntityById(id);
        if (app != null) {
            app.setRating(rating);
            app.setActiveOrders(activeOrders);
            app.setDrivers(drivers);
            app.version = version;
            app.author = author;

        } else {
            throw new InterruptedException("App with ID " + id + " not found");
        }
    }


}