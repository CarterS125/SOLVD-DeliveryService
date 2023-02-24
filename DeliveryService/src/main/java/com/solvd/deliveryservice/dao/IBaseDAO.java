package com.solvd.deliveryservice.dao;

import java.sql.SQLException;

public interface IBaseDAO<T> {
    T getEntityById(long id) throws SQLException, InterruptedException;
    void updateEntity(T entity);
    T createEntity(T entity);
    void removeEntity(long id);
}
