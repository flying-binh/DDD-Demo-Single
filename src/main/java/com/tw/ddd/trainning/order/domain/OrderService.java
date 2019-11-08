package com.tw.ddd.trainning.order.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public String createOrder(Order order) {
        initial(order);

        return orderRepository.createOrder(order);
    }

    private void initial(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        order.setOrderNo(generateOrderNo());
        order.setStatus(OrderStatus.NEW);
    }


    public Order get(String orderId) {
        return orderRepository.getOrder(orderId);
    }


    private String generateOrderNo() {
        StringBuilder builder = new StringBuilder();
        builder.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        builder.append(new Random().nextInt(100));
        return builder.toString();
    }
}
