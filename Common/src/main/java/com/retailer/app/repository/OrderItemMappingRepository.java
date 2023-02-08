package com.retailer.app.repository;

import com.retailer.app.entity.OrderItemMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemMappingRepository extends JpaRepository<OrderItemMapping, Long> {

}
