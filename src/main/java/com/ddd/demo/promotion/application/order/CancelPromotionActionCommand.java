package com.ddd.demo.promotion.application.order;

import com.ddd.demo.promotion.domain.order.promotion.Promotion;

public class CancelPromotionActionCommand implements ActionCommand {
    @Override
    public void execute(Promotion promotion) {
        //do cancel promotion business logic
    }
}
