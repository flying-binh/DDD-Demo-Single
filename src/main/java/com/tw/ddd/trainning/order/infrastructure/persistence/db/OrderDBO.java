package com.tw.ddd.trainning.order.infrastructure.persistence.db;

import com.tw.ddd.trainning.order.domain.Order;
import com.tw.ddd.trainning.order.domain.OrderStatus;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class OrderDBO {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    private String orderNo;
    private OrderStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime paidAt;
    private String customerRemarks;
    private LocalDateTime deliveryTime;
    private LocalDateTime receiveTime;
    private String buyerId;
    private String sellerId;

    public static OrderDBO from(Order order) {
        OrderDBO orderDBO = new OrderDBO();
        BeanUtils.copyProperties(order, orderDBO);
        return orderDBO;
    }

    public static OrderDBO empty() {
        return new OrderDBO();
    }

    public Order to() {
        Order order = new Order();
        BeanUtils.copyProperties(this, order);
        return order;
    }
}
