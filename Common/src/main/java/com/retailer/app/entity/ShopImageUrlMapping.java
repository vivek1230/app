package com.retailer.app.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ShopImageUrlMapping", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShopImageUrlMapping {
    String shopId;
    String imageUrl;
}
