package com.retailer.app.dto.requestDto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryRequestDto {
    String categoryId;
    String categoryName;
    String description;
    List<String> categoryImageUrlList;
}
