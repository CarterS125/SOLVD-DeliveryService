package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IItemDAO<T> extends IBaseDAO {
    List<T> getAllItems();
}
