package com.retailer.app.mapping;

import com.retailer.app.dto.requestDto.AddressRequestDto;
import com.retailer.app.dto.requestDto.ProfileRequestDto;
import com.retailer.app.dto.requestDto.UserRequestDto;
import com.retailer.app.entity.AddressEntity;
import com.retailer.app.entity.ProfileEntity;
import com.retailer.app.entity.UserEntity;
import com.retailer.app.enums.UserRoleType;

import java.time.OffsetDateTime;

public class DtoToEntityMapping {

    public static UserEntity getUserEntity(UserRequestDto userRequest) {
        return UserEntity.builder().userRoleType(UserRoleType.CUSTOMER).email(userRequest.getEmail())
                .mobile(userRequest.getMobile()).password(userRequest.getPassword()).created(OffsetDateTime.now())
                .lastUpdated(OffsetDateTime.now()).build();
    }

    public static ProfileEntity getProfileEntity(String email, ProfileRequestDto profileRequest) {
        return ProfileEntity.builder().email(email).mobile(profileRequest.getMobile()).name(profileRequest.getName())
                .gender(profileRequest.getGender()).city(profileRequest.getCity()).pinCode(profileRequest.getPinCode())
                .created(OffsetDateTime.now()).lastUpdated(OffsetDateTime.now()).build();
    }

    public static AddressEntity getAddressEntity(String email, AddressRequestDto addressRequest) {
        return AddressEntity.builder().email(email).name(addressRequest.getName()).mobile(addressRequest.getMobile())
                .city(addressRequest.getCity()).pinCode(addressRequest.getPinCode())
                .landMark(addressRequest.getLandMark()).addressType(addressRequest.getAddressType())
                .state(addressRequest.getState()).addressText(addressRequest.getAddressText())
                .created(OffsetDateTime.now()).lastUpdated(OffsetDateTime.now()).build();
    }
}
