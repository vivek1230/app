package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ItemCategoryDto {
    String title;
    String description;
    List<ItemDto> itemList;
}
