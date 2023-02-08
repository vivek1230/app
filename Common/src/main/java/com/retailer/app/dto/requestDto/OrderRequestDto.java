package com.retailer.app.dto.requestDto;

import com.retailer.app.dto.AddressDto;
import com.retailer.app.dto.PaymentOptionDto;
import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@Builder
public class OrderRequestDto {
    String orderId;
    String userId;
    OffsetDateTime orderDate;
    Double totalAmount;
    List<OrderItemDto> orderItemList;
    AddressDto orderAddress;
    PaymentOptionDto orderPaymentOption;

    @Data
    @Builder
    public static class OrderItemDto {
        String itemId;
        String itemName;
        String description;
        int orderQuantity;
        Double price;
        PricingType pricingType;
        List<String> itemImageUrlList;
    }
}
