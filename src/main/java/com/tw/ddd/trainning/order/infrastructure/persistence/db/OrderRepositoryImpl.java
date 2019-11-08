package com.tw.ddd.trainning.order.infrastructure.persistence.db;

import com.tw.ddd.trainning.order.domain.Order;
import com.tw.ddd.trainning.order.domain.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderRepositoryImpl implements OrderRepository {
    private OrderJPARepository orderJPARepository;

    @Autowired
    public OrderRepositoryImpl(OrderJPARepository orderJPARepository) {
        this.orderJPARepository = orderJPARepository;
    }

    @Override
    public String createOrder(Order order) {
        OrderDBO  orderDBO = OrderDBO.from(order);
        OrderDBO  saved = this.orderJPARepository.save(orderDBO);
        return saved.getId();
    }

    @Override
    public Order getOrder(String id) {
        return this.orderJPARepository.findById(id).orElse(OrderDBO.empty()).to();
    }
}
