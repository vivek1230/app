package com.retailer.app.repository;

import com.retailer.app.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileEntityRepository extends JpaRepository<ProfileEntity, Long> {

}
