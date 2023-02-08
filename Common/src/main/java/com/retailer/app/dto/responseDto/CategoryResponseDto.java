package com.retailer.app.dto.responseDto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryResponseDto {
    String categoryId;
    String categoryName;
    String description;
    List<String> categoryImageUrlList;
}
