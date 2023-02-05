package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Builder
public class OrderDto {
    String orderId;
    OffsetDateTime orderDate;
    Double totalAmount;
    AddressDto deliveryAddress;
    PaymentOptionDto orderPaymentOption;
}
