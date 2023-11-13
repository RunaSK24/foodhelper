package service;

import cn.edu.szu.config.SpringConfig;

import cn.edu.szu.domain.Order;
import cn.edu.szu.service.OrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class OrdersServiceTest {
    @Autowired
    private OrdersService ordersService;

    @Test
    public void testGetById(){
        Order order = ordersService.findByUserId(1);
        System.out.println(order);
    }

    @Test
    public void testSave(){
        Order order = new Order();
        order.setOrderId(10);
        order.setUserId(1);
        order.setPickupAddress("Pickup Address");
        order.setName("John Doe");
        order.setPhone("1234567890");
        order.setAddress("123 Main Street");
        order.setOrderDetails("Order Details");
        order.setPrice(100);
        order.setStatus(1);
        order.setOrderTime(new Date());
        order.setDriverId(2);
        order.setDeliveryTime(new Date());
        ordersService.save(order);
    }
    @Test
    public void testUpdate(){   //只修改姓名
        Order order = new Order();
        order.setOrderId(10);
        order.setUserId(1);
        order.setPickupAddress("Pickup Address");
        order.setName("John Test");
        order.setPhone("1234567890");
        order.setAddress("123 Main Street");
        order.setOrderDetails("Order Details");
        order.setPrice(100);
        order.setStatus(1);
        order.setOrderTime(new Date());
        order.setDriverId(2);
        order.setDeliveryTime(new Date());
        ordersService.update(order);
    }
    @Test
    public void testDelete(){
        ordersService.delete(10);
    }


}
