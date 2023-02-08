package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {
    String categoryId;
    String categoryName;
    String description;
    List<String> categoryImageUrlList;
}
