package com.retailer.app.dto.responseDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartResponseDto {
    String cartId;
    String userId;
    String shopId;
}
