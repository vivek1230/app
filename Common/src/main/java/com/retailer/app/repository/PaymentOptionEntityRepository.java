package com.retailer.app.repository;

import com.retailer.app.entity.PaymentOptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentOptionEntityRepository extends JpaRepository<PaymentOptionEntity, Long> {

}
