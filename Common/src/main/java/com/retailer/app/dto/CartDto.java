package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartDto {
    Long cartId;
    Long userId;
    Long shopId;
}
