package com.example.versioning.feature.account.get.service;

import com.example.versioning.feature.account.get.mapper.GetAccountMapper;
import com.example.versioning.feature.account.get.repository.AccountRepository;
import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAccountServiceImpl implements GetAccountService {

    private final AccountRepository accountRepository;
    private final GetAccountMapper getAccountMapper;

    @Override
    public Account getAccount(int id) {
        return getAccountMapper.mapToAccount(accountRepository.findById(id).get());
    }

    @Override
    public List<Account> getAccounts() {
        List<AccountEntity> accountEntities = new ArrayList<>();
        accountRepository.findAll().forEach(accountEntities::add);
        return getAccountMapper.mapToAccounts(accountEntities);
    }
}
