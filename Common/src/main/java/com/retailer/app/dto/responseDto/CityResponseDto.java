package com.retailer.app.dto.responseDto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CityResponseDto {
    Long cityId;
    String cityName;
    String description;
    List<String> cityImageUrlList;
}
