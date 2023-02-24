package com.solvd.deliveryservice.dao;

import java.util.List;

public interface ILiscenseDAO<T> extends IBaseDAO {
    List<T> getAllLiscenses();
}
