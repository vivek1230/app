package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CityDto {
    String cityId;
    String name;
    String description;
    List<String> picUrls;
}
