package com.retailer.app.repository;

import com.retailer.app.entity.CityImageUrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityImageUrlMappingRepository extends JpaRepository<CityImageUrlMapping, Long> {

}
