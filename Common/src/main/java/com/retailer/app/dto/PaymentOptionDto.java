package com.retailer.app.dto;

import com.retailer.app.enums.PaymentOptionType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentOptionDto {
    Long paymentOptionId;
    Long userId;
    String paymentOptionName;
    String description;
    PaymentOptionType paymentOptionType;
}
