package com.example.versioning.feature.address.get.repository;

import com.example.versioning.feature.common.address.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {

}
