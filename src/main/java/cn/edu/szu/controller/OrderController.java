package cn.edu.szu.controller;

import cn.edu.szu.domain.Order;
import cn.edu.szu.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrdersServiceImpl ordersService;

    @GetMapping
    public Order getByOrdersId(Integer id){
        return ordersService.findByUserId(id);
    }

    @PostMapping
    public String saveOrder(Order order){
        ordersService.save(order);
        return "Order Save";
    }

    @PutMapping
    public String updateOrder(Order order){
        ordersService.update(order);
        System.out.println(order);
        return "Order Update";
    }

    @DeleteMapping
    public String deleteOrder(Integer id){
        ordersService.delete(id);
        return "Order Delete";
    }
}
