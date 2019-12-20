package com.ddd.demo.promotion.controller.dto;

import com.ddd.demo.promotion.domain.order.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderResponseMapper {
    OrderResponseMapper MAPPER = Mappers.getMapper(OrderResponseMapper.class);

    OrderResponse fromOrder(Order order);
}
