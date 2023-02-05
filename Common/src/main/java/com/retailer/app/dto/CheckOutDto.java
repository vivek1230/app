package com.retailer.app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CheckOutDto {
    List<AddressDto> addressList;
    List<PaymentOptionDto> paymentList;
}
