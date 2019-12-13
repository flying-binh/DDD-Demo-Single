package com.ddd.demo.promotion.domain.promotion.action;

import com.ddd.demo.promotion.domain.promotion.Promotion;

public class WithdrawPromotionActionCommand implements ActionCommand {
    @Override
    public void execute(Promotion promotion) {
        //do withdraw business logic
    }
}
