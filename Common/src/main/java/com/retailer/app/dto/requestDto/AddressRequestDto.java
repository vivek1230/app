package com.retailer.app.dto.requestDto;

import com.retailer.app.enums.AddressType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressRequestDto {
    String name;
    String mobile;
    AddressType addressType;
    String city;
    String pinCode;
    String landMark;
    String state;
    String addressText;
}
