package com.retailer.app.repository;

import com.retailer.app.entity.ShopItemMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopItemMappingRepository extends JpaRepository<ShopItemMapping, Long> {

}
