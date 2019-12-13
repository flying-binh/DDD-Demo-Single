package com.ddd.demo.promotion.domain.promotion;

import com.ddd.demo.promotion.domain.resume.comfirmation.Confirmation;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Promotion {
    private  double discountAmount;
    private  double feeAmount;
    private LocalDate endDate;
    private LocalDate activeDate;
    private Confirmation confirmation;
    private PromotionAction promotionAction;

    private List<PromotionMember> promotionMembers;

    private List<PromotionReward> promotionRewards;

    private List<PromotionRule> rules;
}

