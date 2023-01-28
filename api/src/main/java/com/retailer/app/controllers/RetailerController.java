package com.retailer.app.controllers;

import com.retailer.app.dto.UserDetailsDto;
import com.retailer.app.services.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
public class RetailerController {

    @Autowired
    RetailerService retailerService;

    @GetMapping(path = "/userDetails", produces = "application/json")
    public ResponseEntity<UserDetailsDto> getUserDetails(@RequestBody UserDetailsDto userDetailsDto) {

        UserDetailsDto UserDetailsDto = retailerService.getUserDetails(userDetailsDto);
        // return new ResponseEntity<>(UserDetailsDto, HttpStatus.OK);
        return ResponseEntity.ok(UserDetailsDto);
    }

    @PostMapping(path = "/userDetails", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDetailsDto> addEmployee(@PathVariable("email") String email) {

        UserDetailsDto userDetailsDto = retailerService.addUserDetails(email);
        // return new ResponseEntity<>(UserDetailsDto, HttpStatus.OK);
        return ResponseEntity.ok(userDetailsDto);
    }
}
