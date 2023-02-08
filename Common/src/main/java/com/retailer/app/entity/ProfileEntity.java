package com.retailer.app.entity;

import com.retailer.app.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Profile", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProfileEntity {
    String profileId;
    String userId;
    String email;
    String name;
    String mobileNo;
    Gender gender;
    String pinCode;
    String city;
    String password;
    String addressId;
}
