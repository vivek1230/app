package com.retailer.app.services;

import com.retailer.app.dto.UserDetailsDto;
import com.retailer.app.entity.UserDetails;
import com.retailer.app.repository.UserDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.OffsetDateTime;
import java.util.List;

@Service
@Slf4j
public class RetailerService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetailsDto getUserDetails(UserDetailsDto userDetailsDto) {

        log.info("Saving userDetails: {}", userDetailsDto);
        UserDetails userDetails = UserDetails.builder()
                .name(userDetailsDto.getName())
                .email(userDetailsDto.getEmail())
                .mobile(userDetailsDto.getMobile())
                .lastUpdated(OffsetDateTime.now())
                .build();
        userDetailsRepository.save(userDetails);
        return userDetailsDto;
    }

    public UserDetailsDto addUserDetails(String email) {
        List<UserDetails> userDetailsList =  userDetailsRepository.findAllByEmail(email);
        if(CollectionUtils.isEmpty(userDetailsList)) {
            log.info("No record found for email: {}", email);
            throw new RuntimeException("No record found");
        }
        UserDetailsDto userDetailsDto = UserDetailsDto.builder()
                .name(userDetailsList.get(0).getName())
                .email(userDetailsList.get(0).getEmail())
                .mobile(userDetailsList.get(0).getMobile())
                .build();
        log.info("Record found for email: {}, userDetails: {}", email, userDetailsDto);
        return userDetailsDto;
    }
}
