package com.ddd.demo.promotion.domain.order.promotion.action;

import com.ddd.demo.promotion.domain.order.promotion.Promotion;

public interface ActionCommand {
    void execute(Promotion promotion);
}
