package com.ddd.demo.promotion.infrastructure.db.order;

import com.ddd.demo.promotion.domain.order.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderPOMapper {
    OrderPOMapper MAPPER = Mappers.getMapper(OrderPOMapper.class);

    Order toOrder(OrderPO orderPO);

    OrderPO fromOrder(Order order);
}
