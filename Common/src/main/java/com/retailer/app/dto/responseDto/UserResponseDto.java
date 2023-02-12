package com.retailer.app.dto.responseDto;

import com.retailer.app.enums.UserRoleType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDto {
    Long userId;
    UserRoleType userRoleType;
    Long profileId;
}
