package com.ddd.demo.promotion.infrastructure.db.order.jpa;

import com.ddd.demo.promotion.infrastructure.db.order.OrderPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<OrderPO, String> {
}
