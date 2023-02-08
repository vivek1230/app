package com.retailer.app.dto.requestDto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShopItemRequestDto {
    String shopId;
    String itemId;
    String itemName;
    String description;
    boolean availability;
    int availableQuantity;
    Double price;
    PricingType pricingType;
    String rating;
    List<String> itemImageUrlList;
}
