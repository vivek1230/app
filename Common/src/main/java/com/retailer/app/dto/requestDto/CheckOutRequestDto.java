package com.retailer.app.dto.requestDto;

import com.retailer.app.dto.AddressDto;
import com.retailer.app.dto.PaymentOptionDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CheckOutRequestDto {
    String checkOutId;
    String userId;
    String shopId;
    String cartId;
    List<AddressDto> addressList;
    List<PaymentOptionDto> paymentOptionList;
}
