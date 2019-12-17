package com.ddd.demo.promotion.infrastructure.boss;

import com.ddd.demo.promotion.domain.notification.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class BossNotificationService implements NotificationService {
    @Override
    public void send(String message) {

    }
}
