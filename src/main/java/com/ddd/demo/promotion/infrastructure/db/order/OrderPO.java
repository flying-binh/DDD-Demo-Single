package com.ddd.demo.promotion.infrastructure.db.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "order")
@NoArgsConstructor
public class OrderPO {
    @Id
    private String id;

    // other fields.
}
