package com.retailer.app.dto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ItemDto {
    String itemId;
    String name;
    String description;
    Double price;
    PricingType pricingType;
    int quantity;
    String rating;
    List<String> picUrls;
}
