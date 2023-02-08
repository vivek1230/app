package com.retailer.app.entity;

import com.retailer.app.enums.PaymentOptionType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PaymentOption", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentOptionEntity {
    String paymentOptionId;
    String userId;
    String paymentOptionName;
    String description;
    PaymentOptionType paymentOptionType;
}
