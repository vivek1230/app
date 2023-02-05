package com.retailer.app.dto;

import com.retailer.app.enums.PaymentOptionType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentOptionDto {
    PaymentOptionType type;
    String title;
    String description;
    String paymentOptionId;
}