package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDetailsDto {
    String name;
    String email;
    String mobile;
}
