package com.tw.ddd.trainning.order.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IdResponse {
    private String id;

    public IdResponse(String id) {
        this.id = id;
    }
}
