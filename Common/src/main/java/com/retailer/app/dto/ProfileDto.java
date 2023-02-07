package com.retailer.app.dto;

import com.retailer.app.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileDto {
    String email;
    String name;
    String mobileNo;
    Gender gender;
    String password;
    AddressDto address;
}
