package com.example.versioning.feature.account.get.service;

import com.example.versioning.feature.account.get.mapper.GetAccountMapper;
import com.example.versioning.feature.account.get.repository.v2.AccountRepositoryV2;
import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("getAccountsServiceV2")
@RequiredArgsConstructor
public class GetAccountsServiceV2Impl implements GetAccountsService {

    private final AccountRepositoryV2 accountRepositoryV2;
    private final GetAccountMapper getAccountMapper;

    @Override
    public Account getAccount(int id) {
        return getAccountMapper.mapToAccount(accountRepositoryV2.findById(id).get());
    }

    @Override
    public List<Account> getAccounts() {
        List<AccountEntity> accountEntities = new ArrayList<>();
        accountRepositoryV2.findAll().forEach(accountEntities::add);
        return getAccountMapper.mapToAccounts(accountEntities);
    }
}
