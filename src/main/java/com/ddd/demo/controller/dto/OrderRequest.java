package com.ddd.demo.controller.dto;

import com.tw.ddd.trainning.order.domain.Order;

public class OrderRequest {

    public Order toOrder(){
        // convert this to Order domain object, below code just for demo.
        Order mockOrder = new Order();
        return mockOrder;
    }
}
