package com.retailer.app.dto.requestDto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShopRequestDto {
    String shopId;
    String shopName;
    String description;
    String city;
    String rating;
    String addressId;
    List<String> imageUrlList;
}
