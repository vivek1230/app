package com.retailer.app.repository;

import com.retailer.app.entity.ShopItemImageUrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopItemImageUrlMappingRepository extends JpaRepository<ShopItemImageUrlMapping, Long> {

}
