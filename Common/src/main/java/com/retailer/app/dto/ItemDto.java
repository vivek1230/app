package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ItemDto {
    String itemId;
    String itemName;
    String description;
    List<String> itemImageUrlList;
}
