package com.retailer.app.repository;

import com.retailer.app.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileEntityRepository extends JpaRepository<ProfileEntity, Long> {

    @Query(value = "select * from ShopInZone.ProfileEntity where UserId=?1 ", nativeQuery = true)
    Optional<ProfileEntity> findByUserId(Long userId);

    @Query(value = "select * from ShopInZone.ProfileEntity where Email=?1 ", nativeQuery = true)
    Optional<ProfileEntity> findByEmail(String email);

    @Query(value = "select * from ShopInZone.ProfileEntity where Mobile=?1 ", nativeQuery = true)
    Optional<ProfileEntity> findByMobile(String mobile);

    // Optional<ProfileEntity> findByUserId(Long userId);
    //
    // Optional<ProfileEntity> findByEmail(String email);
    //
    // Optional<ProfileEntity> findByMobile(String mobile);
}
