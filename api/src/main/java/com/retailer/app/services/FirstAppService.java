package com.retailer.app.services;

import com.retailer.app.dto.*;
import com.retailer.app.enums.SignInStatusCode;
import com.retailer.app.enums.SignUpStatusCode;
import com.retailer.app.repository.UserDetailsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FirstAppService {

    UserDetailsRepository userDetailsRepository;

    public SignInStatusCode signIn(String email, String password) {
        return null;
    }

    public SignUpStatusCode signUp(ProfileDto profileDto) {
        return null;
    }

    public ProfileDto getProfile(String email) {
        return null;
    }

    public List<OrderDto> getOrders(String email) {
        return null;
    }

    public List<AddressDto> getAddressList(String email) {
        return null;
    }

    public List<PaymentOptionDto> getPaymentOptions(String email) {
        return null;
    }

    public CheckOutDto getCheckOut(String email) {
        return null;
    }

    public ProfileDto updateProfile(String email, ProfileDto profileDto) {
        return null;
    }

    public List<PaymentOptionDto> addPaymentOption(String email, PaymentOptionDto paymentOption) {
        return null;
    }

    public List<PaymentOptionDto> deletePaymentOption(String email, String paymentOptionId) {
        return null;
    }

    public List<AddressDto> addAddress(String email, AddressDto address) {
        return null;
    }

    public List<AddressDto> deleteAddress(String email, String addressId) {
        return null;
    }

    public List<CategoryDto> deleteCategoryFromCity(String email, String city, String categoryId) {
        return null;
    }

    public List<ShopDto> deleteShopFromCategory(String email, String city, String categoryId, String shopId) {
        return null;
    }

    public List<ItemDto> deleteItemFromShop(String email, String city, String shopId, String itemId) {
        return null;
    }

    public List<ItemDto> getCartItemList(String email, String city, String shopId, CartRequestDto cartRequestDto) {
        return null;
    }

    public List<ItemDto> deleteItemFromCart(String email, String city, String shopId, String itemId,
            CartRequestDto cartRequestDto) {
        return null;
    }

    public List<ItemDto> updateItemIntoShop(String email, String city, String shopId, String itemId, ItemDto item) {
        return null;
    }

    public List<CityDto> addCity(String email, CityDto city) {
        return null;
    }

    public List<CityDto> updateCity(String email, String cityId, CityDto city) {
        return null;
    }

    public List<CityDto> deleteCity(String email, String cityId) {
        return null;
    }

    public List<CityDto> getCityList(String email) {
        return null;
    }

    public List<ItemDto> getItemListFromShop(String email, String city, String shopId) {
        return null;
    }

    public List<ShopDto> getShopListFromCategory(String email, String city, String categoryId) {
        return null;
    }

    public List<CategoryDto> getCategoryListFromCity(String email, String city) {
        return null;
    }

    public List<CategoryDto> addCategoryIntoCity(String email, String city, CategoryDto category) {
        return null;
    }

    public List<CategoryDto> updateCategoryIntoCity(String email, String city, String categoryId,
            CategoryDto category) {
        return null;
    }

    public List<ShopDto> addShopIntoCategory(String email, String city, String categoryId, ShopDto shop) {
        return null;
    }

    public List<ShopDto> updateShopIntoCategory(String email, String city, String categoryId, String shopId,
            ShopDto shop) {
        return null;
    }

    public List<ItemDto> addItemIntoShop(String email, String city, String shopId, ItemDto item) {
        return null;
    }

    public List<ItemDto> addItemIntoCart(String email, String city, String shopId, String itemId,
            CartRequestDto cartRequestDto) {
        return null;
    }

    public List<ItemDto> updateItemIntoCart(String email, String city, String shopId, String itemId,
            CartRequestDto cartRequestDto) {
        return null;
    }
}
