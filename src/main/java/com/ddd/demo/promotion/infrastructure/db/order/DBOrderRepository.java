package com.ddd.demo.promotion.infrastructure.db.order;

import com.ddd.demo.promotion.domain.order.Order;
import com.ddd.demo.promotion.domain.order.OrderRepository;
import com.ddd.demo.promotion.infrastructure.db.order.jpa.OrderJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DBOrderRepository implements OrderRepository {

    private OrderJpaRepository orderJpaRepository;

    @Override
    public void save(Order order) {
        OrderPO orderPO = OrderPOMapper.MAPPER.fromOrder(order);
        // add code for persistence logic

        orderJpaRepository.save(orderPO);
    }

    @Override
    public Order findById(String orderId) {
        OrderPO orderPO = orderJpaRepository.findById(orderId).orElse(null);

        // add other logic here

        return OrderPOMapper.MAPPER.toOrder(orderPO);

    }
}
