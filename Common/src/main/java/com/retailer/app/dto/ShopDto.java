package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShopDto {
    String shopId;
    String name;
    String description;
    String location;
    String rating;
    List<String> picUrls;
}
