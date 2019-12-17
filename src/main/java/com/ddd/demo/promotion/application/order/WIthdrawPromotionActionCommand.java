package com.ddd.demo.promotion.application.order;

import com.ddd.demo.promotion.domain.order.promotion.Promotion;

public class WIthdrawPromotionActionCommand implements ActionCommand {
    @Override
    public void execute(Promotion promotion) {
        //do withdraw business logic
    }
}
