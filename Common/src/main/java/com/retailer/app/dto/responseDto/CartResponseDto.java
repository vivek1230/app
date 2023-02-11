package com.retailer.app.dto.responseDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartResponseDto {
    Long cartId;
    Long userId;
    Long shopId;
}
