package com.retailer.app.entity;

import com.retailer.app.enums.PricingType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OrderItemMapping", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderItemMapping {
    String orderId;
    String itemId;
    String itemName;
    String description;
    int orderQuantity;
    double price;
    PricingType pricingType;
}
