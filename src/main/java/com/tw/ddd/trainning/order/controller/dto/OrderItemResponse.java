package com.tw.ddd.trainning.order.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tw.ddd.trainning.order.domain.OrderItem;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemResponse {
    private String id;
    private String orderId;
    private String goodsId;
    private double unitPrice;
    private double quantity;
    private String unitName;
    private double amount;
    private LocalDateTime createdAt;

    public static OrderItemResponse from(OrderItem orderItem) {
        OrderItemResponse orderItemResponse = new OrderItemResponse();
        BeanUtils.copyProperties(orderItem, orderItemResponse);
        return orderItemResponse;
    }
}
