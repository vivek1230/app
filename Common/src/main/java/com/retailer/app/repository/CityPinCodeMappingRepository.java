package com.retailer.app.repository;

import com.retailer.app.entity.CityPinCodeMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CityPinCodeMappingRepository extends JpaRepository<CityPinCodeMapping, Long> {

    List<CityPinCodeMapping> findAllByCityId(Long cityId);

    @Transactional
    void deleteAllByCityId(Long cityId);
}
