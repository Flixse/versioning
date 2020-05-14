package com.example.versioning.feature.account.get.repository.v2;

import com.example.versioning.feature.common.account.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositoryV2 extends CrudRepository<AccountEntity, Integer> {
}
