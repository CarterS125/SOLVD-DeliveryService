package com.solvd.deliveryservice.dao;

import java.util.List;

public interface ICarDAO<T> extends IBaseDAO {
    List<T> getAllCars();
}
