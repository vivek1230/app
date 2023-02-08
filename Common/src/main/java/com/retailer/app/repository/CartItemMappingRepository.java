package com.retailer.app.repository;

import com.retailer.app.entity.CartItemMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemMappingRepository extends JpaRepository<CartItemMapping, Long> {

}
