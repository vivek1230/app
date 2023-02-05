package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {
    String categoryId;
    String name;
    String description;
    List<String> picUrls;
}
