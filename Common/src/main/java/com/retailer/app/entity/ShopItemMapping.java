package com.retailer.app.entity;

import com.retailer.app.enums.PricingType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ShopItemMapping", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShopItemMapping {
    String shopId;
    String itemId;
    String itemName;
    String description;
    boolean availability;
    int availableQuantity;
    double price;
    PricingType pricingType;
    String rating;
}
