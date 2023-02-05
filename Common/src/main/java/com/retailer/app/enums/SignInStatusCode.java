package com.retailer.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Slf4j
public enum SignInStatusCode {
    AUTHENTICATION_DONE("001", "User authentication is successfully done"),
    AUTHENTICATION_FAILED("002", "User authentication is failed"),;

    private final String code;
    private final String description;
}