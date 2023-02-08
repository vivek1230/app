package com.retailer.app.repository;

import com.retailer.app.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressEntityRepository extends JpaRepository<AddressEntity, Long> {

    // List<AddressEntity> findByUserId(String userId);
    //
    // List<AddressEntity> findByMobile(String mobile);

    @Query(value = "select * from ShopInZone.AddressEntity where UserId=?1 ", nativeQuery = true)
    List<AddressEntity> findByUserId(Long userId);

    @Query(value = "select * from ShopInZone.AddressEntity where Email=?1 ", nativeQuery = true)
    List<AddressEntity> findByEmail(String email);

    @Query(value = "select * from ShopInZone.AddressEntity where Mobile=?1 ", nativeQuery = true)
    List<AddressEntity> findByMobile(String mobile);

    @Query(value = "select * from ShopInZone.AddressEntity where addressId=?1 and Email=?2 ", nativeQuery = true)
    List<AddressEntity> findByAddressIdAndEmail(Long addressId, String email);

    @Query(value = "delete * from ShopInZone.AddressEntity where addressId=?1 and Email=?2 ", nativeQuery = true)
    void deleteByAddressIdAndEmail(Long addressId, String email);
}
