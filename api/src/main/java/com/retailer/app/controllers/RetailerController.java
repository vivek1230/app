package com.retailer.app.controllers;

import com.retailer.app.dto.UserDetailsDto;
import com.retailer.app.services.RetailerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1")
@Slf4j
@RestController
@Validated
@AllArgsConstructor(onConstructor = @__(@Autowired))
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Tag(name = "App Api")
public class RetailerController {

    RetailerService retailerService;

    @PostMapping(path = "/userDetails", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDetailsDto> addEmployee(@RequestBody UserDetailsDto userDetailsDto) {

        UserDetailsDto UserDetailsDto = retailerService.addUserDetails(userDetailsDto);
        // return new ResponseEntity<>(UserDetailsDto, HttpStatus.OK);
        return ResponseEntity.ok(UserDetailsDto);
    }

    @GetMapping(path = "/userDetails/{email}", produces = "application/json")
    public ResponseEntity<UserDetailsDto> getUserDetails(@PathVariable("email") String email) {

        UserDetailsDto userDetailsDto = retailerService.getUserDetails(email);
        // return new ResponseEntity<>(UserDetailsDto, HttpStatus.OK);
        return ResponseEntity.ok(userDetailsDto);
    }
}
