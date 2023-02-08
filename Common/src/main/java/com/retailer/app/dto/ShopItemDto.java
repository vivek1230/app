package com.retailer.app.dto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShopItemDto {
    String shopId;
    String itemId;
    String itemName;
    String description;
    boolean availability;
    int availableQuantity;
    double price;
    PricingType pricingType;
    String rating;
    List<String> itemImageUrlList;
}
