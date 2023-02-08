package com.retailer.app.services;

import com.retailer.app.dto.requestDto.*;
import com.retailer.app.dto.responseDto.*;
import com.retailer.app.entity.AddressEntity;
import com.retailer.app.entity.ProfileEntity;
import com.retailer.app.entity.UserEntity;
import com.retailer.app.enums.SignInStatusCode;
import com.retailer.app.enums.SignUpStatusCode;
import com.retailer.app.mapping.DtoToEntityMapping;
import com.retailer.app.mapping.EntityToDtoMapping;
import com.retailer.app.repository.AddressEntityRepository;
import com.retailer.app.repository.ProfileEntityRepository;
import com.retailer.app.repository.UserEntityRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FirstAppService {

    UserEntityRepository userEntityRepository;
    ProfileEntityRepository profileEntityRepository;
    AddressEntityRepository addressEntityRepository;

    public SignInStatusCode signIn(String email, String password) {
        log.info("email : {}, password : {}", email, password);
        Optional<UserEntity> userEntityOptional;
        userEntityOptional = userEntityRepository.findByEmail(email);
        if (userEntityOptional.isEmpty())
            return SignInStatusCode.NOT_REGISTERED_WITH_EMAIL;
        if (!StringUtils.equals(userEntityOptional.get().getPassword(), password))
            return SignInStatusCode.AUTHENTICATION_FAILED;
        return SignInStatusCode.AUTHENTICATION_DONE;
    }

    private void authenticateUserWithEmail(String email) {
        log.info("email : {}", email);
        Optional<UserEntity> userEntityOptional = userEntityRepository.findByEmail(email);
        if (userEntityOptional.isEmpty())
            throw new RuntimeException("Exception: " + SignInStatusCode.NOT_REGISTERED_WITH_EMAIL);
    }

    public SignUpStatusCode signUp(UserRequestDto userRequest) {

        log.info("UserRequest : {}", userRequest);
        Optional<UserEntity> userEntityOptional;
        userEntityOptional = userEntityRepository.findByEmail(userRequest.getEmail());
        if (userEntityOptional.isPresent())
            return SignUpStatusCode.DUPLICATE_EMAIL;

        userEntityOptional = userEntityRepository.findByMobile(userRequest.getMobile());
        if (userEntityOptional.isPresent())
            return SignUpStatusCode.DUPLICATE_MOBILE;

        UserEntity userEntity = DtoToEntityMapping.getUserEntity(userRequest);
        userEntity = userEntityRepository.save(userEntity);
        log.info("UserEntity : {}", userEntity);
        return SignUpStatusCode.SIGN_UP_DONE;
    }

    public ProfileResponseDto getProfile(String email) {

        authenticateUserWithEmail(email);
        Optional<ProfileEntity> profileEntity = profileEntityRepository.findByEmail(email);
        if (profileEntity.isEmpty())
            return null;

        log.info("ProfileEntity : {}", profileEntity.get());
        ProfileResponseDto profileResponse = EntityToDtoMapping.getProfileResponse(profileEntity.get());
        log.info("ProfileResponse : {}", profileResponse);
        return profileResponse;
    }

    public ProfileResponseDto updateProfile(String email, ProfileRequestDto profileRequest) {

        authenticateUserWithEmail(email);
        log.info("ProfileRequest : {}", profileRequest);
        ProfileEntity profileEntity = DtoToEntityMapping.getProfileEntity(email, profileRequest);
        profileEntity = profileEntityRepository.save(profileEntity);
        log.info("ProfileEntity : {}", profileEntity);
        return EntityToDtoMapping.getProfileResponse(profileEntity);
    }

    public List<AddressResponseDto> addAddress(String email, AddressRequestDto addressRequest) {

        authenticateUserWithEmail(email);
        log.info("AddressRequest : {}", addressRequest);
        AddressEntity addressEntity = DtoToEntityMapping.getAddressEntity(email, addressRequest);
        addressEntity = addressEntityRepository.save(addressEntity);
        log.info("AddressEntity : {}", addressEntity);
        List<AddressEntity> addressEntityList = addressEntityRepository.findByEmail(email);
        log.info("AddressEntityList : {}", addressEntityList);
        return EntityToDtoMapping.getAddressResponseList(addressEntityList);
    }

    public List<AddressResponseDto> deleteAddress(String email, Long addressId) {
        authenticateUserWithEmail(email);
        List<AddressEntity> addressEntityList = addressEntityRepository.findByAddressIdAndEmail(addressId, email);
        log.info("AddressEntityList before deletion: {}", addressEntityList);
        if (CollectionUtils.isEmpty(addressEntityList))
            return EntityToDtoMapping.getAddressResponseList(addressEntityList);

        addressEntityRepository.deleteByAddressIdAndEmail(addressId, email);
        addressEntityList = addressEntityRepository.findByEmail(email);
        log.info("AddressEntityList after deletion: {}", addressEntityList);
        return EntityToDtoMapping.getAddressResponseList(addressEntityList);
    }

    public List<AddressResponseDto> getAddressList(String email) {

        authenticateUserWithEmail(email);
        List<AddressEntity> addressEntityList = addressEntityRepository.findByEmail(email);
        log.info("AddressEntityList : {}", addressEntityList);
        return EntityToDtoMapping.getAddressResponseList(addressEntityList);
    }

    public List<OrderResponseDto> getOrderList(String email) {
        return null;
    }

    public List<PaymentOptionResponseDto> getPaymentOptionList(String email) {
        return null;
    }

    public CheckOutResponseDto getCheckOut(String email) {
        return null;
    }

    public List<PaymentOptionResponseDto> addPaymentOption(String email, PaymentOptionRequestDto paymentOption) {
        return null;
    }

    public List<PaymentOptionResponseDto> deletePaymentOption(String email, String paymentOptionId) {
        return null;
    }

    public List<CategoryResponseDto> deleteCategoryFromCity(String email, String city, String categoryId) {
        return null;
    }

    public List<ShopResponseDto> deleteShopFromCategory(String email, String city, String categoryId, String shopId) {
        return null;
    }

    public List<ItemResponseDto> deleteItemFromShop(String email, String city, String shopId, String itemId) {
        return null;
    }

    public List<ItemResponseDto> getCartItemList(String email, String city, String shopId,
            CartRequestDto cartRequestDto) {
        return null;
    }

    public List<ItemResponseDto> deleteItemFromCart(String email, String city, String shopId, String itemId,
            CartRequestDto cartRequestDto) {
        return null;
    }

    public List<ItemResponseDto> updateItemIntoShop(String email, String city, String shopId, String itemId,
            ItemRequestDto item) {
        return null;
    }

    public List<CityResponseDto> addCity(String email, CityRequestDto city) {
        return null;
    }

    public List<CityResponseDto> updateCity(String email, String cityId, CityRequestDto city) {
        return null;
    }

    public List<CityResponseDto> deleteCity(String email, String cityId) {
        return null;
    }

    public List<CityResponseDto> getCityList(String email) {
        return null;
    }

    public List<ItemResponseDto> getItemListFromShop(String email, String city, String shopId) {
        return null;
    }

    public List<ShopResponseDto> getShopListFromCategory(String email, String city, String categoryId) {
        return null;
    }

    public List<CategoryResponseDto> getCategoryListFromCity(String email, String city) {
        return null;
    }

    public List<CategoryResponseDto> addCategoryIntoCity(String email, String city, CategoryRequestDto category) {
        return null;
    }

    public List<CategoryResponseDto> updateCategoryIntoCity(String email, String city, String categoryId,
            CategoryRequestDto category) {
        return null;
    }

    public List<ShopResponseDto> addShopIntoCategory(String email, String city, String categoryId,
            ShopRequestDto shop) {
        return null;
    }

    public List<ShopResponseDto> updateShopIntoCategory(String email, String city, String categoryId, String shopId,
            ShopRequestDto shop) {
        return null;
    }

    public List<ItemResponseDto> addItemIntoShop(String email, String city, String shopId, ItemRequestDto item) {
        return null;
    }

    public List<ItemResponseDto> addItemIntoCart(String email, String city, String shopId, String itemId,
            CartRequestDto cartRequestDto) {
        return null;
    }

    public List<ItemResponseDto> updateItemIntoCart(String email, String city, String shopId, String itemId,
            CartRequestDto cartRequestDto) {
        return null;
    }
}
