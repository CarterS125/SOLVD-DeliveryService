package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public User getEntityById(int id) throws SQLException {
        String query = "SELECT * FROM users WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String fname = resultSet.getString("fname");
            String lname = resultSet.getString("lname");
            int age = resultSet.getInt("age");
            String email = resultSet.getString("email");
            return new User(fname, lname, age, email, id);
        }
        return null;
    }

    public boolean updateEntity(User user) throws SQLException {
        String query = "UPDATE users SET fname = ?, lname = ?, age = ?, email = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, user.getFname());
        statement.setString(2, user.getLname());
        statement.setInt(3, user.getAge());
        statement.setString(4, user.getEmail());
        statement.setInt(5, user.getId());
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0;
    }

    public boolean removeEntity(int id) throws SQLException {
        String query = "DELETE FROM users WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0;
    }

    public boolean createEntity(User user) throws SQLException {
        String query = "INSERT INTO users (fname, lname, age, email) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, user.getFname());
        statement.setString(2, user.getLname());
        statement.setInt(3, user.getAge());
        statement.setString(4, user.getEmail());
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0;
    }
}
