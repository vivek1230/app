package com.retailer.app.services;

import com.retailer.app.dto.UserDetailsDto;
import com.retailer.app.entity.UserDetails;
import com.retailer.app.repository.UserDetailsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RetailerService {

    UserDetailsRepository userDetailsRepository;

    public UserDetailsDto addUserDetails(UserDetailsDto userDetailsDto) {

        log.info("Saving userDetails: {}", userDetailsDto);
        UserDetails userDetails = UserDetails.builder().name(userDetailsDto.getName()).email(userDetailsDto.getEmail())
                .mobile(userDetailsDto.getMobile()).lastUpdated(OffsetDateTime.now()).build();
        userDetailsRepository.save(userDetails);
        return userDetailsDto;
    }

    public UserDetailsDto getUserDetails(String email) {
        Optional<UserDetails> userDetails = userDetailsRepository.findAllByEmail(email);
        if (userDetails.isEmpty()) {
            log.info("No record found for email: {}", email);
            throw new RuntimeException("No record found");
        }
        UserDetailsDto userDetailsDto = UserDetailsDto.builder().name(userDetails.get().getName())
                .email(userDetails.get().getEmail()).mobile(userDetails.get().getMobile()).build();
        log.info("Record found for email: {}, userDetails: {}", email, userDetailsDto);
        return userDetailsDto;
    }
}
