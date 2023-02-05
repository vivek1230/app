package com.retailer.app.controllers;

import com.retailer.app.dto.*;
import com.retailer.app.enums.SignInStatusCode;
import com.retailer.app.enums.SignUpStatusCode;
import com.retailer.app.services.FirstAppService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/firstApp/v1/{email}")
@Slf4j
@RestController
@Validated
@AllArgsConstructor(onConstructor = @__(@Autowired))
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Tag(name = "First App APIs")
public class FirstAppController {

    FirstAppService firstAppService;

    @GetMapping(path = "/signIn/{password}", produces = "application/json")
    public ResponseEntity<SignInStatusCode> signIn(@PathVariable("email") String email,
            @PathVariable("password") String password) {

        SignInStatusCode signInStatusCode = firstAppService.signIn(email, password);
        return new ResponseEntity<>(signInStatusCode, HttpStatus.OK);
    }

    @PostMapping(path = "/signUp", consumes = "application/json", produces = "application/json")
    public ResponseEntity<SignUpStatusCode> signUp(@RequestBody ProfileDto profile) {

        SignUpStatusCode signUpStatusCode = firstAppService.signUp(profile);
        return new ResponseEntity<>(signUpStatusCode, HttpStatus.OK);
    }

    @GetMapping(path = "/profile", produces = "application/json")
    public ResponseEntity<ProfileDto> getProfile(@PathVariable("email") String email) {

        ProfileDto profile = firstAppService.getProfile(email);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @PostMapping(path = "/updateProfile", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ProfileDto> updateProfile(@PathVariable("email") String email,
            @RequestBody ProfileDto profile) {

        profile = firstAppService.updateProfile(email, profile);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @GetMapping(path = "/orders", produces = "application/json")
    public ResponseEntity<List<OrderDto>> getOrders(@PathVariable("email") String email) {

        List<OrderDto> orders = firstAppService.getOrders(email);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping(path = "/paymentOptions", produces = "application/json")
    public ResponseEntity<List<PaymentOptionDto>> getPaymentOptions(@PathVariable("email") String email) {

        List<PaymentOptionDto> paymentOptions = firstAppService.getPaymentOptions(email);
        return new ResponseEntity<>(paymentOptions, HttpStatus.OK);
    }

    @PostMapping(path = "/addPaymentOption", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<PaymentOptionDto>> addPaymentOption(@PathVariable("email") String email,
            @RequestBody PaymentOptionDto paymentOption) {

        List<PaymentOptionDto> paymentOptions = firstAppService.addPaymentOption(email, paymentOption);
        return new ResponseEntity<>(paymentOptions, HttpStatus.OK);
    }

    @PostMapping(path = "/deletePaymentOption/{paymentOptionId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<PaymentOptionDto>> deletePaymentOption(@PathVariable("email") String email,
            @PathVariable("paymentOptionId") String paymentOptionId) {

        List<PaymentOptionDto> paymentOptions = firstAppService.deletePaymentOption(email, paymentOptionId);
        return new ResponseEntity<>(paymentOptions, HttpStatus.OK);
    }

    @GetMapping(path = "/addresses", produces = "application/json")
    public ResponseEntity<List<AddressDto>> getAddresses(@PathVariable("email") String email) {

        List<AddressDto> addresses = firstAppService.getAddressList(email);
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @PostMapping(path = "/addAddress", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<AddressDto>> addAddress(@PathVariable("email") String email,
            @RequestBody AddressDto address) {

        List<AddressDto> addresses = firstAppService.addAddress(email, address);
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteAddress/{addressId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<AddressDto>> deleteAddress(@PathVariable("email") String email,
            @PathVariable("addressId") String addressId) {

        List<AddressDto> addresses = firstAppService.deleteAddress(email, addressId);
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @PostMapping(path = "/home", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityDto>> getCityList(@PathVariable("email") String email) {

        List<CityDto> cityList = firstAppService.getCityList(email);
        return new ResponseEntity<>(cityList, HttpStatus.OK);
    }

    @PostMapping(path = "/addCity", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityDto>> addCity(@PathVariable("email") String email, @RequestBody CityDto city) {

        List<CityDto> cityList = firstAppService.addCity(email, city);
        return new ResponseEntity<>(cityList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityDto>> updateCity(@PathVariable("email") String email,
            @PathVariable("city") String cityId, @RequestBody CityDto city) {

        List<CityDto> cityList = firstAppService.updateCity(email, cityId, city);
        return new ResponseEntity<>(cityList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityDto>> deleteCity(@PathVariable("email") String email,
            @PathVariable("city") String cityId) {

        List<CityDto> cityList = firstAppService.deleteCity(email, cityId);
        return new ResponseEntity<>(cityList, HttpStatus.OK);
    }

    @PostMapping(path = "/getCategoryListFromCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryDto>> getCategoryListFromCity(@PathVariable("email") String email,
            @PathVariable("city") String city) {

        List<CategoryDto> categoryList = firstAppService.getCategoryListFromCity(email, city);
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/addCategoryIntoCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryDto>> addCategoryIntoCity(@PathVariable("email") String email,
            @PathVariable("city") String city, @RequestBody CategoryDto category) {

        List<CategoryDto> categoryList = firstAppService.addCategoryIntoCity(email, city, category);
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateCategoryIntoCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryDto>> updateCategoryIntoCity(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @RequestBody CategoryDto category) {

        List<CategoryDto> categoryList = firstAppService.updateCategoryIntoCity(email, city, categoryId, category);
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteCategoryFromCity/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryDto>> deleteCategoryFromCity(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId) {

        List<CategoryDto> categoryList = firstAppService.deleteCategoryFromCity(email, city, categoryId);
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/getShopListFromCategory/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopDto>> getShopListFromCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId) {

        List<ShopDto> shopList = firstAppService.getShopListFromCategory(email, city, categoryId);
        return new ResponseEntity<>(shopList, HttpStatus.OK);
    }

    @PostMapping(path = "/addShopIntoCategory/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopDto>> addShopIntoCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @RequestBody ShopDto shop) {

        List<ShopDto> shopList = firstAppService.addShopIntoCategory(email, city, categoryId, shop);
        return new ResponseEntity<>(shopList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateShopIntoCategory/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopDto>> updateShopIntoCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @PathVariable("shopId") String shopId, @RequestBody ShopDto shop) {

        List<ShopDto> shopList = firstAppService.updateShopIntoCategory(email, city, categoryId, shopId, shop);
        return new ResponseEntity<>(shopList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteShopFromCategory/{city}/{categoryId}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopDto>> deleteShopFromCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @PathVariable("shopId") String shopId) {

        List<ShopDto> shopList = firstAppService.deleteShopFromCategory(email, city, categoryId, shopId);
        return new ResponseEntity<>(shopList, HttpStatus.OK);
    }

    @PostMapping(path = "/getItemListFromShop/{city}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemCategoryDto>> getItemListFromShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId) {

        List<ItemCategoryDto> itemCategoryList = firstAppService.getItemListFromShop(email, city, shopId);
        return new ResponseEntity<>(itemCategoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/addItemIntoShop/{city}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemCategoryDto>> addItemIntoShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId, @RequestBody ItemDto item) {

        List<ItemCategoryDto> itemCategoryList = firstAppService.addItemIntoShop(email, city, shopId, item);
        return new ResponseEntity<>(itemCategoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateItemtoShop/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemCategoryDto>> updateItemtoShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody ItemDto item) {

        List<ItemCategoryDto> itemCategoryList = firstAppService.updateItemIntoShop(email, city, shopId, itemId, item);
        return new ResponseEntity<>(itemCategoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteItemFromShop/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemCategoryDto>> deleteItemFromShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId) {

        List<ItemCategoryDto> itemCategoryList = firstAppService.deleteItemFromShop(email, city, shopId, itemId);
        return new ResponseEntity<>(itemCategoryList, HttpStatus.OK);
    }

    @PostMapping(path = "/getCartItemList/{city}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemDto>> getCartItemList(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @RequestBody CartRequestDto cartRequestDto) {

        List<ItemDto> itemList = firstAppService.getCartItemList(email, city, shopId, cartRequestDto);
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }

    @PostMapping(path = "/addItemIntoCart/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemDto>> addItemIntoCart(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody CartRequestDto cartRequestDto) {

        List<ItemDto> itemList = firstAppService.addItemIntoCart(email, city, shopId, itemId, cartRequestDto);
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateItemIntoCart/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemDto>> updateItemIntoCart(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody CartRequestDto cartRequestDto) {

        List<ItemDto> itemList = firstAppService.updateItemIntoCart(email, city, shopId, itemId, cartRequestDto);
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteItemFromCart/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemDto>> deleteItemFromCart(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody CartRequestDto cartRequestDto) {

        List<ItemDto> itemList = firstAppService.deleteItemFromCart(email, city, shopId, itemId, cartRequestDto);
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }

    @GetMapping(path = "/checkOut", produces = "application/json")
    public ResponseEntity<CheckOutDto> getCheckOut(@PathVariable("email") String email) {

        CheckOutDto checkOut = firstAppService.getCheckOut(email);
        return new ResponseEntity<>(checkOut, HttpStatus.OK);
    }

}
