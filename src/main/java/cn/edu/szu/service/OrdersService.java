package cn.edu.szu.service;

import cn.edu.szu.domain.Order;

public interface OrdersService {
    void save(Order account);

    Order findByUserId(Integer id);

    void delete(Integer id);

    void update(Order account);
}
