package com.retailer.app.dto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CartItemDto {
    String cartId;
    String userId;
    String shopId;
    String itemId;
    String itemName;
    String description;
    int orderQuantity;
    double price;
    PricingType pricingType;
    List<String> itemImageUrlList;
}
