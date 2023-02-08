package com.retailer.app.repository;

import com.retailer.app.entity.CityNameMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityNameMappingRepository extends JpaRepository<CityNameMapping, Long> {

}
