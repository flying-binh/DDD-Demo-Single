package com.ddd.demo.promotion.domain.order;

public interface OrderRepository {
    void save(Order order);

    Order findById(String orderId);
}
