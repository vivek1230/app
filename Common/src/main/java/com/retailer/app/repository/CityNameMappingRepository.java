package com.retailer.app.repository;

import com.retailer.app.entity.CityNameMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CityNameMappingRepository extends JpaRepository<CityNameMapping, Long> {

    List<CityNameMapping> findAllByCityId(Long cityId);

    @Transactional
    void deleteAllByCityId(Long cityId);
}
