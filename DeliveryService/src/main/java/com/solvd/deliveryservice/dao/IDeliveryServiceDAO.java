package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IDeliveryServiceDAO<T> extends IBaseDAO {
    List<T> getAllDeliveryServices();
}
