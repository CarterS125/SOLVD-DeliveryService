package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.License;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LicenseDAO {
    private Connection connection;

    public LicenseDAO(Connection connection) {
        this.connection = connection;
    }

    public License getEntityById(int id) throws SQLException {
        String query = "SELECT * FROM licenses WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int number = resultSet.getInt("number");
            int expirationDate = resultSet.getInt("expiration_date");
            String state = resultSet.getString("state");
            return new License(number, expirationDate, state);
        }
        return null;
    }

    public void updateEntity(License license) throws SQLException {
        String query = "UPDATE licenses SET number=?, expiration_date=?, state=? WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, license.getNumber());
        statement.setInt(2, license.getExpirationDate());
        statement.setString(3, license.getState());
        statement.setInt(4, license.getId());
        statement.executeUpdate();
    }

    public void removeEntity(int id) throws SQLException {
        String query = "DELETE FROM licenses WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    public void createEntity(License license) throws SQLException {
        String query = "INSERT INTO licenses (number, expiration_date, state) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, license.getNumber());
        statement.setInt(2, license.getExpirationDate());
        statement.setString(3, license.getState());
        statement.executeUpdate();
    }
}
