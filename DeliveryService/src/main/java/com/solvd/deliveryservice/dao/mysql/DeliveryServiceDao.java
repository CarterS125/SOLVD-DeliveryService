package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.DeliveryService;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class DeliveryServiceDao {
    private Connection connection;

    public DeliveryServiceDao(Connection connection) {
        this.connection = connection;
    }

    public void createDeliveryService(String name, String location, List<String> deliveryTypes) throws SQLException {
        String sql = "INSERT INTO delivery_service (name, location, delivery_types) VALUES (?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, location);
        statement.setArray(3, connection.createArrayOf("text", deliveryTypes.toArray()));
        statement.executeUpdate();
    }

    public void updateDeliveryService(String name, String location, List<String> deliveryTypes) throws SQLException {
        String sql = "UPDATE delivery_service SET name = ?, location = ?, delivery_types = ? WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, location);
        statement.setArray(3, connection.createArrayOf("text", deliveryTypes.toArray()));
        statement.executeUpdate();
    }

    public void removeDeliveryService(int id) throws SQLException {
        String sql = "DELETE FROM delivery_service WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    public DeliveryService getDeliveryServiceById(int id) throws SQLException {
        String sql = "SELECT * FROM delivery_service WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");
            Array deliveryTypesArray = resultSet.getArray("delivery_types");
            List<String> deliveryTypes = Arrays.asList((String[]) deliveryTypesArray.getArray());
            return new DeliveryService(name, location, deliveryTypes);
        }
        return null;
    }
}