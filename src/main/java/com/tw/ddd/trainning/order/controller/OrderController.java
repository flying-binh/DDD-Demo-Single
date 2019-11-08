package com.tw.ddd.trainning.order.controller;

import com.tw.ddd.trainning.order.controller.dto.IdResponse;
import com.tw.ddd.trainning.order.controller.dto.OrderRequest;
import com.tw.ddd.trainning.order.controller.dto.OrderResponse;
import com.tw.ddd.trainning.order.domain.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public @ResponseBody
    IdResponse createOrder(@RequestBody OrderRequest orderRequest){
        return new IdResponse(orderService.createOrder(orderRequest.to()));
    }

    @GetMapping("/{orderId}")
    public @ResponseBody
    OrderResponse get(@PathVariable String orderId){
        return OrderResponse.from(orderService.get(orderId));
    }
}
