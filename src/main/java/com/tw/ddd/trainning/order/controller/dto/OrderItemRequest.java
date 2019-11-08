package com.tw.ddd.trainning.order.controller.dto;

import com.tw.ddd.trainning.order.domain.OrderItem;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class OrderItemRequest {
    private String goodsId;
    private double unitPrice;
    private double quantity;
    private String unitName;
    private double amount;

    public OrderItem to(){
        OrderItem orderItem = new OrderItem();
        BeanUtils.copyProperties(this, orderItem);
        return orderItem;
    }
}
