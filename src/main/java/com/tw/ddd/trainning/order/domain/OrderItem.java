package com.tw.ddd.trainning.order.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderItem {
    private String id;
    private String orderId;
    private String goodsId;
    private double unitPrice;
    private double quantity;
    private String unitName;
    private double amount;
    private LocalDateTime createdAt;
}
