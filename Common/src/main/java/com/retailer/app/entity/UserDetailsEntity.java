package com.retailer.app.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "UserDetails", schema = "ShopInZone")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId", nullable = false)
    Long userId;

    @Column(name = "Name")
    String name;

    @Column(name = "Email")
    String email;

    @Column(name = "Mobile")
    String mobile;

    @Column(name = "LastUpdated")
    OffsetDateTime lastUpdated;
}
