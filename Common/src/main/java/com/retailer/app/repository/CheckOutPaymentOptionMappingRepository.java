package com.retailer.app.repository;

import com.retailer.app.entity.CheckOutPaymentOptionMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckOutPaymentOptionMappingRepository extends JpaRepository<CheckOutPaymentOptionMapping, Long> {

}
