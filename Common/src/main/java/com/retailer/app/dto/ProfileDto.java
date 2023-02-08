package com.retailer.app.dto;

import com.retailer.app.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileDto {
    String profileId;
    String userId;
    String email;
    String name;
    String mobileNo;
    Gender gender;
    String pinCode;
    String city;
    String password;
    AddressDto primaryAddress;
}
