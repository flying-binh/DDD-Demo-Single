package com.ddd.demo.application;


import com.ddd.demo.domain.notification.NotificationService;
import com.ddd.demo.domain.order.Order;
import com.ddd.demo.domain.promotion.Promotion;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderApplication {

    @Autowired
    private NotificationService notificationService;

//    private BPM bpm;

    public String fullfillOrder(Order order) {
//        bpm.exexute();

        //somelogic for fullfill Order
        return null;
    }

    public void notifyBoss(Order order) {
        List<Promotion> promotions = order.getPromotions();
        promotions.stream().forEach(
                promotion -> notificationService.send(promotion.generateBossNotifycation())
        );
    }

    public void notifyUser(Order order) {
        List<Promotion> promotions = order.getPromotions();
        promotions.stream().forEach(promotion -> notificationService.send(promotion.generateUserNotifycation()));
    }
}
