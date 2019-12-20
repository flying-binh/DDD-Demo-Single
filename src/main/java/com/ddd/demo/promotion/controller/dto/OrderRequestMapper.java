package com.ddd.demo.promotion.controller.dto;

import com.ddd.demo.promotion.domain.order.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderRequestMapper {
    OrderRequestMapper MAPPER = Mappers.getMapper(OrderRequestMapper.class);

    Order toOrder(OrderRequest orderRequest);
}
