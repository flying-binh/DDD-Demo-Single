package com.tw.ddd.trainning.order.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {
    private  String id;
    private String orderNo;
    private OrderStatus status;
    private List<OrderItem> items;
    private LocalDateTime createdAt;
    private LocalDateTime paidAt;
    private String customerRemarks;
    private LocalDateTime deliveryTime;
    private LocalDateTime receiveTime;
    private String buyerId;
    private String sellerId;
}
