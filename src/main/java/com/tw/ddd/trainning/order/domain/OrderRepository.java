package com.tw.ddd.trainning.order.domain;

public interface OrderRepository {
    String createOrder(Order order);
    Order getOrder(String id);
}
