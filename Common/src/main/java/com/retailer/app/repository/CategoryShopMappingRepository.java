package com.retailer.app.repository;

import com.retailer.app.entity.CategoryShopMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryShopMappingRepository extends JpaRepository<CategoryShopMapping, Long> {

}
