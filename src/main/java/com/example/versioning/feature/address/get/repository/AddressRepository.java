package com.example.versioning.feature.address.get.repository;

import com.example.versioning.feature.common.address.AddressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {

}
