package cn.edu.szu.service.impl;

import cn.edu.szu.service.OrdersService;
import cn.edu.szu.dao.OrderDao;
import cn.edu.szu.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrderDao orderDao;


    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    public Order findByUserId(Integer id) {
        return orderDao.findByUserId(id);
    }

    @Override
    public void delete(Integer id) {
        orderDao.delete(id);
    }

    @Override
    public void update(Order account) {
        orderDao.update(account);
    }
}
