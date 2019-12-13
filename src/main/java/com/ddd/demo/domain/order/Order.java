package com.ddd.demo.domain.order;

import com.ddd.demo.domain.promotion.Promotion;

import java.util.List;

public class Order {
    private  String id;
    private List<Promotion> promotion;
    private OrderRepository orderRepository;

    public String attendPromotion(){
        // attend promotion logic (eg. 生成生效任务、生成到期任务、BOSS通知等等)

        orderRepository.save(this);
        return this.id;
    }

    public String changePromotion(){
        // change promotion logic

        orderRepository.save(this);
        return this.id;
    }

    public String resumePromotion(){
        // some logic here
        orderRepository.save(this);
        return this.id;
    }

    public String cancelPromotion(){
        // some logic here
        orderRepository.save(this);
        return this.id;
    }

    public String rollbackPromotion(){
        // some logic here
        orderRepository.save(this);
        return this.id;
    }


    public String forceCancelPromotion(){
        // some logic here
        orderRepository.save(this);
        return this.id;
    }

    public String generateUserConfirmation (){
        // some logic here
        orderRepository.save(this);
        return this.id;
    }

    public String updateUserConfirmation(){
        // some logic here
        orderRepository.save(this);
        return this.id;
    }

    public List<Promotion> getPromotions() {
        return null;
    }
}
