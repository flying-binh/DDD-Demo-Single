package com.ddd.demo.promotion.domain.order.promotion;

import com.ddd.demo.promotion.domain.order.promotion.action.*;

public enum PromotionAction {
    ATTEND {
        @Override
        public ActionCommand getCommand() {
            return new AttendPromotionActionCommand();
        }
    }, CANCEL{
        @Override
        public ActionCommand getCommand() {
            return new CancelPromotionActionCommand();
        }
    }, CHANGE{
        @Override
        public ActionCommand getCommand() {
            return new ChangePromotionActionCommand();
        }
    }, WITHDRAW{
        @Override
        public ActionCommand getCommand() {
            return new WithdrawPromotionActionCommand();
        }
    };

    public ActionCommand getCommand() {
        return null;
    }
}
