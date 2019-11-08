package com.tw.ddd.trainning.order.controller.dto;

import com.tw.ddd.trainning.order.domain.Order;
import com.tw.ddd.trainning.order.domain.OrderItem;
import com.tw.ddd.trainning.order.domain.OrderStatus;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrderResponse {
    private  String id;
    private String orderNo;
    private OrderStatus status;
    private List<OrderItemResponse> items;
    private LocalDateTime createdAt;
    private LocalDateTime paidAt;
    private String customerRemarks;
    private LocalDateTime deliveryTime;
    private LocalDateTime receiveTime;
    private String buyerId;
    private String sellerId;

    public static OrderResponse from(Order order){
        OrderResponse orderResponse = new OrderResponse();
        BeanUtils.copyProperties(order, orderResponse, "items");

        if(!CollectionUtils.isEmpty(order.getItems())){
            orderResponse.setItems(new ArrayList<>());
            order.getItems().stream().forEach(e -> orderResponse.getItems().add(OrderItemResponse.from(e)));
        }
        return orderResponse;
    }
}
