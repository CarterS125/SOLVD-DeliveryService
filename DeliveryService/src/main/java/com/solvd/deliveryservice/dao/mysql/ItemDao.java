package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemDao {
    private Connection connection;

    public ItemDao(Connection connection) {
        this.connection = connection;
    }

    public void createItem(String itemName, int price, String description, int id, int storeId) throws SQLException {
        String sql = "INSERT INTO item (item_name, price, description, id, store_id) VALUES (?, ?, ?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemName);
        statement.setInt(2, price);
        statement.setString(3, description);
        statement.setInt(4, id);
        statement.setInt(5, storeId);
        statement.executeUpdate();
    }

    public void updateItem(String itemName, int price, String description, int id, int storeId) throws SQLException {
        String sql = "UPDATE item SET item_name = ?, price = ?, description = ?, store_id = ? WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemName);
        statement.setInt(2, price);
        statement.setString(3, description);
        statement.setInt(4, storeId);
        statement.setInt(5, id);
        statement.executeUpdate();
    }

    public void removeItem(int id) throws SQLException {
        String sql = "DELETE FROM item WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    public Item getItemById(int id) throws SQLException {
        String sql = "SELECT * FROM item WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String itemName = resultSet.getString("item_name");
            int price = resultSet.getInt("price");
            String description = resultSet.getString("description");
            int storeId = resultSet.getInt("store_id");
            return new Item(itemName, price, description, id, storeId);
        }
        return null;
    }
}
