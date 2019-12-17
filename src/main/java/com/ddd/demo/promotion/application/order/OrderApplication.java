package com.ddd.demo.promotion.application.order;


import com.ddd.demo.promotion.domain.notification.NotificationService;
import com.ddd.demo.promotion.domain.order.Order;
import com.ddd.demo.promotion.domain.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class OrderApplication {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private NotificationService notificationService;

    @Transactional
    public String createOrder(Order orderRequest) {
        Order order = orderRequest.createOrder();

        order.getPromotions().stream().forEach(
                promotion -> {
                    ActionCommandFactory.getCommand(promotion.getPromotionAction()).execute(promotion);
                }
        );

        orderRepository.save(order);
        //publish order created event;
        return order.getId();
    }
}
