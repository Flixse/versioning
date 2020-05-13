package com.example.versioning.feature.address.get.service;

import com.example.versioning.feature.common.address.Address;

import java.util.List;

public interface GetAddressService {

    List<Address> getAddressesOfAccount(int id);
}
