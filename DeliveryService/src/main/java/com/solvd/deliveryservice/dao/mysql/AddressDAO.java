package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AddressDAO {
    private Connection connection;

    public AddressDAO(Connection connection) {
        this.connection = connection;
    }

    public Address getEntityById(int id) throws SQLException {
        String query = "SELECT * FROM addresses WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String pointFrom = resultSet.getString("pointFrom");
            String pointTo = resultSet.getString("pointTo");
            String state = resultSet.getString("state");
            String city = resultSet.getString("city");
            String street = resultSet.getString("street");
            int zip = resultSet.getInt("zip");
            return new Address(pointFrom, pointTo, state, city, street, zip, id);
        }
        return null;
    }

    public boolean updateEntity(Address address) throws SQLException {
        String query = "UPDATE addresses SET pointFrom = ?, pointTo = ?, state = ?, city = ?, street = ?, zip = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, address.getPointFrom());
        statement.setString(2, address.getPointTo());
        statement.setString(3, address.getState());
        statement.setString(4, address.getCity());
        statement.setString(5, address.getStreet());
        statement.setInt(6, address.getZip());
        statement.setInt(7, address.getId());
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0;
    }

    public boolean removeEntity(int id) throws SQLException {
        String query = "DELETE FROM addresses WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0;
    }

    public boolean createEntity(Address address) throws SQLException {
        String query = "INSERT INTO addresses (pointFrom, pointTo, state, city, street, zip) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, address.getPointFrom());
        statement.setString(2, address.getPointTo());
        statement.setString(3, address.getState());
        statement.setString(4, address.getCity());
        statement.setString(5, address.getStreet());
        statement.setInt(6, address.getZip());
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0;
    }
}
