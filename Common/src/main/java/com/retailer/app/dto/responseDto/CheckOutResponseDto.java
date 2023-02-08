package com.retailer.app.dto.responseDto;

import com.retailer.app.dto.AddressDto;
import com.retailer.app.dto.PaymentOptionDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CheckOutResponseDto {
    String checkOutId;
    String userId;
    String shopId;
    String cartId;
    List<AddressDto> addressList;
    List<PaymentOptionDto> paymentOptionList;
}
