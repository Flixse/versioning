package com.example.versioning.feature.account.get.repository;

import com.example.versioning.feature.common.account.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {
}
