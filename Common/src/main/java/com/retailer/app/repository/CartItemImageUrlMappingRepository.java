package com.retailer.app.repository;

import com.retailer.app.entity.CartItemImageUrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemImageUrlMappingRepository extends JpaRepository<CartItemImageUrlMapping, Long> {

}
