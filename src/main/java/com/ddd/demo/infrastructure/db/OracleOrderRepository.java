package com.ddd.demo.infrastructure.db;

import com.ddd.demo.domain.order.Order;
import com.ddd.demo.domain.order.OrderRepository;

public class OracleOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        // add code save to db
    }
}
