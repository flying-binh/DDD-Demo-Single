package com.ddd.demo.promotion.controller;

import com.ddd.demo.promotion.application.order.OrderApplication;
import com.ddd.demo.promotion.controller.dto.OrderRequest;
import com.ddd.demo.promotion.controller.dto.OrderRequestMapper;
import com.ddd.demo.promotion.controller.dto.OrderResponse;
import com.ddd.demo.promotion.controller.dto.OrderResponseMapper;
import com.ddd.demo.promotion.domain.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderApplication promotionOrderApplication;

    @PostMapping
    public String createPromotionOrder(OrderRequest orderRequest) {
        return promotionOrderApplication.createOrder(OrderRequestMapper.MAPPER.toOrder(orderRequest));
    }

    @GetMapping("/{orderId}")
    public OrderResponse getPromotionOrder(@PathVariable String orderId) {
        Order order = promotionOrderApplication.findOrderById(orderId);
        return (OrderResponseMapper.MAPPER.fromOrder(order));
    }
}
