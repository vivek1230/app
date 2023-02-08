package com.retailer.app.mapping;

import com.retailer.app.dto.responseDto.AddressResponseDto;
import com.retailer.app.dto.responseDto.ProfileResponseDto;
import com.retailer.app.entity.AddressEntity;
import com.retailer.app.entity.ProfileEntity;

import java.util.ArrayList;
import java.util.List;

public class EntityToDtoMapping {

    public static ProfileResponseDto getProfileResponse(ProfileEntity profileEntity) {
        return ProfileResponseDto.builder().profileId(profileEntity.getProfileId()).email(profileEntity.getEmail())
                .mobile(profileEntity.getMobile()).name(profileEntity.getName()).city(profileEntity.getCity())
                .pinCode(profileEntity.getPinCode()).gender(profileEntity.getGender()).build();
    }

    public static AddressResponseDto getAddressResponse(AddressEntity addressEntity) {
        return AddressResponseDto.builder().addressId(addressEntity.getAddressId()).name(addressEntity.getName())
                .mobile(addressEntity.getMobile()).addressType(addressEntity.getAddressType())
                .city(addressEntity.getCity()).pinCode(addressEntity.getPinCode()).landMark(addressEntity.getLandMark())
                .state(addressEntity.getState()).addressText(addressEntity.getAddressText()).build();
    }

    public static List<AddressResponseDto> getAddressResponseList(List<AddressEntity> addressEntityList) {
        List<AddressResponseDto> addressResponseList = new ArrayList<>();
        addressEntityList.forEach(addressEntity -> {
            addressResponseList.add(getAddressResponse(addressEntity));
        });
        return addressResponseList;
    }
}
