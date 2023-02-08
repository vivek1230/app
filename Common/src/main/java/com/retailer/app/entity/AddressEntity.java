package com.retailer.app.entity;

import com.retailer.app.enums.AddressType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Address", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressEntity {
    String addressId;
    String name;
    String mobile;
    AddressType addressType;
    String city;
    String pinCode;
    String landMark;
    String state;
    String addressText;
}
