package com.ddd.demo.promotion.domain.promotion.action;

import com.ddd.demo.promotion.domain.promotion.Promotion;

public class ChangePromotionActionCommand implements ActionCommand {
    @Override
    public void execute(Promotion promotion) {
        //do change business logic
    }
}
