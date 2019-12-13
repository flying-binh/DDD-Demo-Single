package com.ddd.demo.promotion.domain.promotion.action;

import com.ddd.demo.promotion.domain.promotion.Promotion;

public interface ActionCommand {
    void execute(Promotion promotion);
}
