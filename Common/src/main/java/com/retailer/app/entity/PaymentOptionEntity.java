package com.retailer.app.entity;

import com.retailer.app.enums.PaymentOptionType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "PaymentOptionEntity", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentOptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentOptionId", nullable = false)
    String paymentOptionId;

    @Column(name = "UserId")
    String userId;

    @Column(name = "paymentOptionName")
    String paymentOptionName;

    @Column(name = "Description")
    String description;

    @Column(name = "PaymentOptionType")
    PaymentOptionType paymentOptionType;

    @Column(name = "Created")
    OffsetDateTime created;

    @Column(name = "LastUpdated")
    OffsetDateTime lastUpdated;
}
