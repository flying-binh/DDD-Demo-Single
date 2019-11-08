package com.tw.ddd.trainning.order.infrastructure.persistence.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderJPARepository extends JpaRepository<OrderDBO, String> {
}
