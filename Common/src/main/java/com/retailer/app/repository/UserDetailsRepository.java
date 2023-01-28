package com.retailer.app.repository;

import com.retailer.app.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

    List<UserDetails> findAllByEmail(String email);
}
