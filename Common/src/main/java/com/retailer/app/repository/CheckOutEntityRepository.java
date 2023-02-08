package com.retailer.app.repository;

import com.retailer.app.entity.CheckOutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckOutEntityRepository extends JpaRepository<CheckOutEntity, Long> {

}
