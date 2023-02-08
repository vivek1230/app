package com.retailer.app.dto;

import com.retailer.app.enums.PricingType;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@Builder
public class OrderDto {
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
