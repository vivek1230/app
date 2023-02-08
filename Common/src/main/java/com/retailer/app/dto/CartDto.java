package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartDto {
    String cartId;
    String userId;
    String shopId;
}
