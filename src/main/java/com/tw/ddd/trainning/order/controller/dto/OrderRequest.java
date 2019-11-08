package com.tw.ddd.trainning.order.controller.dto;

import com.tw.ddd.trainning.order.domain.Order;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderRequest {
    private List<OrderItemRequest> items;
    private String customerRemarks;
    private String buyerId;
    private String sellerId;

    public Order to() {
        Order order = new Order();
        BeanUtils.copyProperties(this, order, "items");
        enrichOrderItems(order);
        return order;
    }

    private void enrichOrderItems(Order order) {
        if (!CollectionUtils.isEmpty(this.items)) {
            order.setItems(new ArrayList<>());
            this.items.stream().forEach(e -> order.getItems().add(e.to()));
        }
    }
}
