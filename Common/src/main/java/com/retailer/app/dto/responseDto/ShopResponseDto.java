package com.retailer.app.dto.responseDto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShopResponseDto {
    String shopId;
    String shopName;
    String description;
    String city;
    String rating;
    String addressId;
    List<String> imageUrlList;
}
