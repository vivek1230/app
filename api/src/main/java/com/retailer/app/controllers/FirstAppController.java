package com.retailer.app.controllers;

import com.retailer.app.dto.requestDto.*;
import com.retailer.app.dto.responseDto.*;
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

        log.info("Calling signIn");
        SignInStatusCode signInStatusCode = firstAppService.signIn(email, password);
        return new ResponseEntity<>(signInStatusCode, HttpStatus.OK);
    }

    @PostMapping(path = "/signUp", consumes = "application/json", produces = "application/json")
    public ResponseEntity<SignUpStatusCode> signUp(@RequestBody UserRequestDto userRequest) {

        log.info("Calling signUp");
        SignUpStatusCode signUpStatusCode = firstAppService.signUp(userRequest);
        return new ResponseEntity<>(signUpStatusCode, HttpStatus.OK);
    }

    @GetMapping(path = "/getProfile", produces = "application/json")
    public ResponseEntity<ProfileResponseDto> getProfile(@PathVariable("email") String email) {

        log.info("Calling getProfile");
        ProfileResponseDto profileResponse = firstAppService.getProfile(email);
        return new ResponseEntity<>(profileResponse, HttpStatus.OK);
    }

    @PostMapping(path = "/updateProfile", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ProfileResponseDto> updateProfile(@PathVariable("email") String email,
            @RequestBody ProfileRequestDto profileRequest) {

        log.info("Calling updateProfile");
        ProfileResponseDto profileResponse = firstAppService.updateProfile(email, profileRequest);
        return new ResponseEntity<>(profileResponse, HttpStatus.OK);
    }

    @PostMapping(path = "/addAddress", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<AddressResponseDto>> addAddress(@PathVariable("email") String email,
            @RequestBody AddressRequestDto addressRequest) {

        log.info("Calling getAddressList");
        List<AddressResponseDto> addressResponseList = firstAppService.addAddress(email, addressRequest);
        return new ResponseEntity<>(addressResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteAddress/{addressId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<AddressResponseDto>> deleteAddress(@PathVariable("email") String email,
            @PathVariable("addressId") Long addressId) {

        log.info("Calling getAddressList");
        List<AddressResponseDto> addressResponseList = firstAppService.deleteAddress(email, addressId);
        return new ResponseEntity<>(addressResponseList, HttpStatus.OK);
    }

    @GetMapping(path = "/getOrderList", produces = "application/json")
    public ResponseEntity<List<OrderResponseDto>> getOrderList(@PathVariable("email") String email) {

        List<OrderResponseDto> orderResponseList = firstAppService.getOrderList(email);
        return new ResponseEntity<>(orderResponseList, HttpStatus.OK);
    }

    @GetMapping(path = "/getPaymentOptionList", produces = "application/json")
    public ResponseEntity<List<PaymentOptionResponseDto>> getPaymentOptionList(@PathVariable("email") String email) {

        List<PaymentOptionResponseDto> paymentOptionResponseList = firstAppService.getPaymentOptionList(email);
        return new ResponseEntity<>(paymentOptionResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/addPaymentOption", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<PaymentOptionResponseDto>> addPaymentOption(@PathVariable("email") String email,
            @RequestBody PaymentOptionRequestDto paymentOptionRequest) {

        List<PaymentOptionResponseDto> paymentOptionResponseList = firstAppService.addPaymentOption(email,
                paymentOptionRequest);
        return new ResponseEntity<>(paymentOptionResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/deletePaymentOption/{paymentOptionId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<PaymentOptionResponseDto>> deletePaymentOption(@PathVariable("email") String email,
            @PathVariable("paymentOptionId") String paymentOptionId) {

        List<PaymentOptionResponseDto> paymentOptionResponseList = firstAppService.deletePaymentOption(email,
                paymentOptionId);
        return new ResponseEntity<>(paymentOptionResponseList, HttpStatus.OK);
    }

    @GetMapping(path = "/getAddressList", produces = "application/json")
    public ResponseEntity<List<AddressResponseDto>> getAddressList(@PathVariable("email") String email) {

        log.info("Calling getAddressList");
        List<AddressResponseDto> addressResponseList = firstAppService.getAddressList(email);
        return new ResponseEntity<>(addressResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/home", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityResponseDto>> getCityList(@PathVariable("email") String email) {

        List<CityResponseDto> cityResponseList = firstAppService.getCityList(email);
        return new ResponseEntity<>(cityResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/addCity", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityResponseDto>> addCity(@PathVariable("email") String email,
            @RequestBody CityRequestDto cityRequest) {

        List<CityResponseDto> cityResponseList = firstAppService.addCity(email, cityRequest);
        return new ResponseEntity<>(cityResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityResponseDto>> updateCity(@PathVariable("email") String email,
            @PathVariable("city") String cityId, @RequestBody CityRequestDto cityRequest) {

        List<CityResponseDto> cityResponseList = firstAppService.updateCity(email, cityId, cityRequest);
        return new ResponseEntity<>(cityResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CityResponseDto>> deleteCity(@PathVariable("email") String email,
            @PathVariable("city") String cityId) {

        List<CityResponseDto> cityResponseList = firstAppService.deleteCity(email, cityId);
        return new ResponseEntity<>(cityResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/getCategoryListFromCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryResponseDto>> getCategoryListFromCity(@PathVariable("email") String email,
            @PathVariable("city") String city) {

        List<CategoryResponseDto> categoryResponseList = firstAppService.getCategoryListFromCity(email, city);
        return new ResponseEntity<>(categoryResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/addCategoryIntoCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryResponseDto>> addCategoryIntoCity(@PathVariable("email") String email,
            @PathVariable("city") String city, @RequestBody CategoryRequestDto categoryRequest) {

        List<CategoryResponseDto> categoryResponseList = firstAppService.addCategoryIntoCity(email, city,
                categoryRequest);
        return new ResponseEntity<>(categoryResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateCategoryIntoCity/{city}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryResponseDto>> updateCategoryIntoCity(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @RequestBody CategoryRequestDto categoryRequest) {

        List<CategoryResponseDto> categoryResponseList = firstAppService.updateCategoryIntoCity(email, city, categoryId,
                categoryRequest);
        return new ResponseEntity<>(categoryResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteCategoryFromCity/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<CategoryResponseDto>> deleteCategoryFromCity(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId) {

        List<CategoryResponseDto> categoryResponseList = firstAppService.deleteCategoryFromCity(email, city,
                categoryId);
        return new ResponseEntity<>(categoryResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/getShopListFromCategory/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopResponseDto>> getShopListFromCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId) {

        List<ShopResponseDto> shopResponseList = firstAppService.getShopListFromCategory(email, city, categoryId);
        return new ResponseEntity<>(shopResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/addShopIntoCategory/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopResponseDto>> addShopIntoCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @RequestBody ShopRequestDto shopRequest) {

        List<ShopResponseDto> shopResponseList = firstAppService.addShopIntoCategory(email, city, categoryId,
                shopRequest);
        return new ResponseEntity<>(shopResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateShopIntoCategory/{city}/{categoryId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopResponseDto>> updateShopIntoCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @PathVariable("shopId") String shopId, @RequestBody ShopRequestDto shopRequest) {

        List<ShopResponseDto> shopResponseList = firstAppService.updateShopIntoCategory(email, city, categoryId, shopId,
                shopRequest);
        return new ResponseEntity<>(shopResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteShopFromCategory/{city}/{categoryId}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ShopResponseDto>> deleteShopFromCategory(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("categoryId") String categoryId,
            @PathVariable("shopId") String shopId) {

        List<ShopResponseDto> shopResponseList = firstAppService.deleteShopFromCategory(email, city, categoryId,
                shopId);
        return new ResponseEntity<>(shopResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/getItemListFromShop/{city}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> getItemListFromShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId) {

        List<ItemResponseDto> itemResponseList = firstAppService.getItemListFromShop(email, city, shopId);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/addItemIntoShop/{city}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> addItemIntoShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @RequestBody ItemRequestDto itemRequest) {

        List<ItemResponseDto> itemResponseList = firstAppService.addItemIntoShop(email, city, shopId, itemRequest);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateItemIntoShop/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> updateItemIntoShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody ItemRequestDto itemRequest) {

        List<ItemResponseDto> itemResponseList = firstAppService.updateItemIntoShop(email, city, shopId, itemId,
                itemRequest);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteItemFromShop/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> deleteItemFromShop(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId) {

        List<ItemResponseDto> itemResponseList = firstAppService.deleteItemFromShop(email, city, shopId, itemId);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/getCartItemList/{city}/{shopId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> getCartItemList(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @RequestBody CartRequestDto cartRequestDto) {

        List<ItemResponseDto> itemResponseList = firstAppService.getCartItemList(email, city, shopId, cartRequestDto);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/addItemIntoCart/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> addItemIntoCart(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody CartRequestDto cartRequestDto) {

        List<ItemResponseDto> itemResponseList = firstAppService.addItemIntoCart(email, city, shopId, itemId,
                cartRequestDto);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/updateItemIntoCart/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> updateItemIntoCart(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody CartRequestDto cartRequestDto) {

        List<ItemResponseDto> itemResponseList = firstAppService.updateItemIntoCart(email, city, shopId, itemId,
                cartRequestDto);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @PostMapping(path = "/deleteItemFromCart/{city}/{shopId}/{itemId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<ItemResponseDto>> deleteItemFromCart(@PathVariable("email") String email,
            @PathVariable("city") String city, @PathVariable("shopId") String shopId,
            @PathVariable("itemId") String itemId, @RequestBody CartRequestDto cartRequestDto) {

        List<ItemResponseDto> itemResponseList = firstAppService.deleteItemFromCart(email, city, shopId, itemId,
                cartRequestDto);
        return new ResponseEntity<>(itemResponseList, HttpStatus.OK);
    }

    @GetMapping(path = "/checkOut", produces = "application/json")
    public ResponseEntity<CheckOutResponseDto> getCheckOut(@PathVariable("email") String email) {

        CheckOutResponseDto checkOutResponse = firstAppService.getCheckOut(email);
        return new ResponseEntity<>(checkOutResponse, HttpStatus.OK);
    }

}
