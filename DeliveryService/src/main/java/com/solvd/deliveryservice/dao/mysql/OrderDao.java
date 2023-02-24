package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    private List<Order> orders = new ArrayList<>();

    public Order getEntityById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void createEntity(int avgOrders, int price, String address, int id, int userId, int storeId) {
        Order order = new Order(avgOrders, price, address, id, userId, storeId);
        orders.add(order);
    }

    public void updateEntity(int id, int avgOrders, int price, String address, int userId, int storeId) {
        Order order = getEntityById(id);
        if (order != null) {
            order.setAvgOrders(avgOrders);
            order.setPrice(price);
            order.setAddress(address);
            order.setUserId(userId);
            order.setStoreId(storeId);
        }
    }

    public void removeEntity(int id) {
        Order order = getEntityById(id);
        if (order != null) {
            orders.remove(order);
        }
    }
}
