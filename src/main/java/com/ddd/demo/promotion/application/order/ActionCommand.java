package com.ddd.demo.promotion.application.order;

import com.ddd.demo.promotion.domain.order.promotion.Promotion;

public interface ActionCommand {
    void execute(Promotion promotion);
}
