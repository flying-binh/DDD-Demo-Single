package com.ddd.demo.domain.promotion;

import com.ddd.demo.domain.resume.comfirmation.Confirmation;

import java.time.LocalDate;
import java.util.List;

public class Promotion {
    private  double discountAmount;
    private  double feeAmount;
    private LocalDate endDate;
    private LocalDate activeDate;
    private Confirmation confirmation;

    private List<PromotionMember> promotionMember;

    private List<PromotionReward> promotionReward;

    public String generateBossNotifycation() {
        return "";
    }

    public String generateUserNotifycation() {
        return "";
    }
}

