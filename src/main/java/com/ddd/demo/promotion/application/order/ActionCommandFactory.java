package com.ddd.demo.promotion.application.order;

import com.ddd.demo.promotion.domain.order.promotion.PromotionAction;

public class ActionCommandFactory {
    public static final ActionCommand getCommand(PromotionAction promotionAction){
        switch (promotionAction){
            case ATTEND:
                return new AttendPromotionActionCommand();
            case CANCEL:
                return new CancelPromotionActionCommand();
            case CHANGE:
                return new ChangePromotionActionCommand();
            case WITHDRAW:
                return new WithdrawPromotionActionCommand();
            default:
                return null;
        }
    }
}
