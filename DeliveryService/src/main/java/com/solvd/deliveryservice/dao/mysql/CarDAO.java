package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CarDAO {
    private Connection connection;

    public CarDAO(Connection connection) {
            this.connection = connection;
    }

    public Car getEntityById(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM cars WHERE id=?");
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
               int carId = resultSet.getInt("id");
               String make = resultSet.getString("make");
               String model = resultSet.getString("model");
               int year = resultSet.getInt("year");
               int price = resultSet.getInt("price");

               return new Car(carId, make, model, year, price);
        }
        return null;
    }

    public void updateEntity(Car car) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE cars SET make=?, model=?, year=?, price=? WHERE id=?");
        statement.setString(1, car.getMake());
        statement.setString(2, car.getModel());
        statement.setInt(3, car.getYear());
        statement.setInt(4, (int) car.getPrice());
        statement.setInt(5, car.getId());

        statement.executeUpdate();
    }

    public void removeEntity(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM cars WHERE id=?");
        statement.setInt(1, id);

        statement.executeUpdate();
    }

    public void createEntity(Car car) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO cars (make, model, year, price) VALUES (?, ?, ?, ?)");
        statement.setString(1, car.getMake());
        statement.setString(2, car.getModel());
        statement.setInt(3, car.getYear());
        statement.setInt(4, (int) car.getPrice());

        statement.executeUpdate();
    }
}



