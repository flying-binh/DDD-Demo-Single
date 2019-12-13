package com.ddd.demo.promotion.domain.order;

import com.ddd.demo.promotion.domain.promotion.Promotion;

import java.util.List;

public class Order {
    private String id;
    private List<Promotion> promotions;

    public String getId() {
        return id;
    }

    public Order createOrder() {
        this.promotions.stream().forEach(
                promotion -> {
                    promotion.getPromotionAction().getCommand().execute(promotion);
                }
        );
        return this;
    }
}
