package com.retailer.app.entity;

import com.retailer.app.enums.PricingType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "CartItemMapping", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartItemMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "CartId")
    String cartId;

    @Column(name = "UserId")
    String userId;

    @Column(name = "ShopId")
    String shopId;

    @Column(name = "ItemId")
    String itemId;

    @Column(name = "ItemName")
    String itemName;

    @Column(name = "Description")
    String description;

    @Column(name = "OrderQuantity")
    int orderQuantity;

    @Column(name = "Price")
    Double price;

    @Column(name = "PricingType")
    PricingType pricingType;

    @Column(name = "Created")
    OffsetDateTime created;

    @Column(name = "LastUpdated")
    OffsetDateTime lastUpdated;
}
