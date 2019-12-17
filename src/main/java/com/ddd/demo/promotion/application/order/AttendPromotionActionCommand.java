package com.ddd.demo.promotion.application.order;

import com.ddd.demo.promotion.domain.order.promotion.Promotion;

public class AttendPromotionActionCommand implements ActionCommand {
    @Override
    public void execute(Promotion promotion) {
        /*
            to call bpm if have.
         */

        // if no bpm then use below pseudo code
        //send notification to boss

        //generate sms to user

        //generate end date task

        //increase promotion attend number

        //create user promotion instance.

        //check if active promotion instance.
    }
}
