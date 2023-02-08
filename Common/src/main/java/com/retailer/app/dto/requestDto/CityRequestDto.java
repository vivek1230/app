package com.retailer.app.dto.requestDto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CityRequestDto {
    String cityId;
    String cityName;
    String description;
    List<String> cityImageUrlList;
    List<String> cityNameList;
    List<String> cityPinCodeList;
}
