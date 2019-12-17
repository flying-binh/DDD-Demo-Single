package com.ddd.demo.promotion.domain.order;

import com.ddd.demo.promotion.domain.order.promotion.Promotion;

import java.util.List;

public class Order {
    private String id;
    private List<Promotion> promotions;

    public String getId() {
        return id;
    }

    public Order createOrder() {
        // add domain logic

        return this;
    }

    public List<Promotion> getPromotions() {
        return this.promotions;
    }
}
