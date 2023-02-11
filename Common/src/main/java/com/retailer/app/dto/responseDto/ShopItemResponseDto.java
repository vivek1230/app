package com.retailer.app.dto.responseDto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShopItemResponseDto {
    Long shopId;
    Long itemId;
    String itemName;
    String description;
    boolean availability;
    int availableQuantity;
    Double price;
    PricingType pricingType;
    String rating;
    List<String> itemImageUrlList;
}
