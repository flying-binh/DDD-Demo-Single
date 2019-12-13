package com.ddd.demo.promotion.controller.dto;

import com.ddd.demo.promotion.domain.order.Order;

public class OrderRequest {

    public Order toOrder(){
        // convert this to Order domain object, below code just for demo.
        Order mockOrder = new Order();
        return mockOrder;
    }
}
