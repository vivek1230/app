package com.retailer.app.dto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class CartRequestDto {
    Map<String, Integer> ItemIdQuantityMap;
    String itemId;
    String quantity;
    PricingType pricingType;
}
