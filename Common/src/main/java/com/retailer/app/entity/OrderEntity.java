package com.retailer.app.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "OrderEntity", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AddressId", nullable = false)
    String orderId;

    @Column(name = "UserId")
    String userId;

    @Column(name = "ShopId")
    String shopId;

    @Column(name = "OrderDate")
    OffsetDateTime orderDate;

    @Column(name = "TotalAmount")
    Double totalAmount;

    @Column(name = "OrderAddressId")
    String orderAddressId;

    @Column(name = "OrderPaymentOptionId")
    String orderPaymentOptionId;

    @Column(name = "Created")
    OffsetDateTime created;

    @Column(name = "LastUpdated")
    OffsetDateTime lastUpdated;
}
