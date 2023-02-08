package com.retailer.app.repository;

import com.retailer.app.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopEntityRepository extends JpaRepository<ShopEntity, Long> {

}
