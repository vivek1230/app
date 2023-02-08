package com.retailer.app.dto.responseDto;

import com.retailer.app.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileResponseDto {
    Long profileId;
    String email;
    String name;
    String mobile;
    Gender gender;
    String pinCode;
    String city;
    String password;
}
