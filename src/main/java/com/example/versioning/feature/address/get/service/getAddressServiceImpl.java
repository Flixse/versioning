package com.example.versioning.feature.address.get.service;

import com.example.versioning.feature.account.get.repository.v1.AccountRepository;
import com.example.versioning.feature.address.get.mapper.AddressMapper;
import com.example.versioning.feature.common.address.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class getAddressServiceImpl implements GetAddressService {

    private final AccountRepository accountRepository;
    private final AddressMapper addressMapper;

    @Override
    public List<Address> getAddressesOfAccount(int id){
        return addressMapper.mapAddresses(accountRepository.findById(id).get().getAddress());
    }
}
