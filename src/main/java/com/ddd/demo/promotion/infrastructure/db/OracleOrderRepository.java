package com.ddd.demo.promotion.infrastructure.db;

import com.ddd.demo.promotion.domain.order.Order;
import com.ddd.demo.promotion.domain.order.OrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OracleOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        // add code save to db
    }
}
