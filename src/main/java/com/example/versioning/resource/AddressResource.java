package com.example.versioning.resource;

import com.example.versioning.feature.address.get.service.GetAddressService;
import com.example.versioning.feature.common.address.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AddressResource {

    private final GetAddressService getAddressService;

    @GetMapping("/accounts/{id}/addresses")
    public List<Address> getAddress(@PathVariable int id){
        return getAddressService.getAddressesOfAccount(id);
    }
}
