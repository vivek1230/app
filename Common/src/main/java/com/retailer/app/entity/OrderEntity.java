package com.retailer.app.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "Order", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderEntity {
    String orderId;
    String userId;
    String shopId;
    OffsetDateTime orderDate;
    double totalAmount;
    String orderAddressId;
    String orderPaymentOptionId;
}
