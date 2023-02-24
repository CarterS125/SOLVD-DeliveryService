package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IUserDAO<T> extends IBaseDAO {
    List<T> getAllUsers();
}
