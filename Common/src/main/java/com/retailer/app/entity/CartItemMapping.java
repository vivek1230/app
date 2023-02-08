package com.retailer.app.entity;

import com.retailer.app.enums.PricingType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CartItemMapping", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartItemMapping {
    String cartId;
    String userId;
    String shopId;
    String itemId;
    String itemName;
    String description;
    int orderQuantity;
    double price;
    PricingType pricingType;
}
