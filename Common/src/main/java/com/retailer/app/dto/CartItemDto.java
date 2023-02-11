package com.retailer.app.dto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CartItemDto {
    Long cartId;
    Long userId;
    Long shopId;
    Long itemId;
    String itemName;
    String description;
    int orderQuantity;
    Double price;
    PricingType pricingType;
    List<String> itemImageUrlList;
}
