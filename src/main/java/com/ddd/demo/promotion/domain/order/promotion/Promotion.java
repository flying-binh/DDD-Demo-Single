package com.ddd.demo.promotion.domain.order.promotion;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Promotion {
    private  double discountAmount;
    private  double feeAmount;
    private LocalDate endDate;
    private LocalDate activeDate;
    private ResumeConfirmation confirmation;
    private PromotionAction promotionAction;

    private List<PromotionMember> promotionMembers;

    private List<PromotionReward> promotionRewards;
}
