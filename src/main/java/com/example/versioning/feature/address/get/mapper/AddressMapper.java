package com.example.versioning.feature.address.get.mapper;

import com.example.versioning.feature.common.address.Address;
import com.example.versioning.feature.common.address.AddressEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddressMapper {

    public List<Address> mapAddresses(List<AddressEntity> addressEntities){
        return addressEntities.stream()
                .map(this::mapAddress)
                .collect(Collectors.toList());
    }

    private Address mapAddress(AddressEntity addressEntity){
        return Address.builder()
                .city(addressEntity.getCity())
                .country(addressEntity.getCountry())
                .extra(addressEntity.getExtra())
                .houseNumber(addressEntity.getHouseNumber())
                .postBusNumber(addressEntity.getPostBusNumber())
                .postcode(addressEntity.getPostcode())
                .street(addressEntity.getStreet())
                .build();
    }
}
