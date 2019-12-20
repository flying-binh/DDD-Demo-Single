package com.ddd.demo.promotion.domain.order;

import com.ddd.demo.promotion.domain.order.promotion.Promotion;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String id;
    private String userId;
    /**
     * 网点ID.
     */
    private String outletId;
    /**
     * 下单时间.
     */
    private LocalDateTime orderedDate;

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
