package com.retailer.app.repository;

import com.retailer.app.entity.ShopCategoryMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCategoryMappingRepository extends JpaRepository<ShopCategoryMapping, Long> {

}
