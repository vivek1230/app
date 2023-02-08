package com.retailer.app.repository;

import com.retailer.app.entity.CityCategoryMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityCategoryMappingRepository extends JpaRepository<CityCategoryMapping, Long> {

}
