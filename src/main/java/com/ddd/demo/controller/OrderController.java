package com.ddd.demo.controller;

import com.ddd.demo.application.OrderApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderApplication promotionOrderApplication;

    @PostMapping
    public String fullfillPromotion(){
            return promotionOrderApplication.fullfillOrder(null);
    }
}
