package com.retailer.app.repository;

import com.retailer.app.entity.CheckOutAddressMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckOutAddressMappingyRepository extends JpaRepository<CheckOutAddressMapping, Long> {

}
