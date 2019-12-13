package com.ddd.demo.promotion.application;


import com.ddd.demo.promotion.domain.notification.NotificationService;
import com.ddd.demo.promotion.domain.order.Order;
import com.ddd.demo.promotion.domain.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class OrderApplication {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private NotificationService notificationService;

    @Transactional
    public String createOrder(Order orderRequest) {
        Order order = orderRequest.createOrder();
        orderRepository.save(order);
        //publish order created event;
        return order.getId();
    }
}
