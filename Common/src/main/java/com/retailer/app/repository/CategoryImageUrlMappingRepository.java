package com.retailer.app.repository;

import com.retailer.app.entity.CategoryImageUrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryImageUrlMappingRepository extends JpaRepository<CategoryImageUrlMapping, Long> {

}
