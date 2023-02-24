package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IAddressDAO<T> extends IBaseDAO {
    List<T> getAllAddresses();
}
