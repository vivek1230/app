package com.retailer.app.dto;

import com.retailer.app.enums.UserRoleType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    String userId;
    UserRoleType userRoleType;
    String profileId;
}
