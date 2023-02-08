package com.retailer.app.dto.requestDto;

import com.retailer.app.enums.PaymentOptionType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentOptionRequestDto {
    String paymentOptionId;
    String userId;
    String paymentOptionName;
    String description;
    PaymentOptionType paymentOptionType;
}
