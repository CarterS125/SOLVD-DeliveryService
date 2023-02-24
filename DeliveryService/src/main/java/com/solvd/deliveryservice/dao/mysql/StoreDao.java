package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StoreDao {
    private Connection connection;

    public StoreDao(Connection connection) {
        this.connection = connection;
    }

    public Store getEntityById(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM store WHERE id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new Store(
                    resultSet.getString("name"),
                    resultSet.getString("type"),
                    resultSet.getString("location"),
                    resultSet.getInt("id")
            );
        }
        return null;
    }

    public int updateEntity(Store store) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE store SET name = ?, type = ?, location = ? WHERE id = ?"
        );
        statement.setString(1, store.getName());
        statement.setString(2, store.getType());
        statement.setString(3, store.getLocation());
        statement.setInt(4, store.getId());
        return statement.executeUpdate();
    }

    public int removeEntity(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM store WHERE id = ?");
        statement.setInt(1, id);
        return statement.executeUpdate();
    }

    public int createEntity(Store store) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO store (name, type, location) VALUES (?, ?, ?)"
        );
        statement.setString(1, store.getName());
        statement.setString(2, store.getType());
        statement.setString(3, store.getLocation());
        return statement.executeUpdate();
    }

    public List<Store> getResultSet() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM store");
        ResultSet resultSet = statement.executeQuery();
        List<Store> stores = new ArrayList<>();
        while (resultSet.next()) {
            stores.add(new Store(
                    resultSet.getString("name"),
                    resultSet.getString("type"),
                    resultSet.getString("location"),
                    resultSet.getInt("id")
            ));
        }
        return stores;
    }
}
