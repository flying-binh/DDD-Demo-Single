package com.ddd.demo.promotion.controller;

import com.ddd.demo.promotion.application.order.OrderApplication;
import com.ddd.demo.promotion.controller.dto.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderApplication promotionOrderApplication;

    @PostMapping
    public String createPromotionOrder(OrderRequest orderRequest){
            return promotionOrderApplication.createOrder(orderRequest.toOrder());
    }
}
