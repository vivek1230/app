package com.retailer.app.repository;

import com.retailer.app.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Long> {

    Optional<UserDetailsEntity> findAllByEmail(String email);
}
