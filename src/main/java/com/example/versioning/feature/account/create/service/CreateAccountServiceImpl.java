package com.example.versioning.feature.account.create.service;

import com.example.versioning.feature.account.create.mapper.CreateAccountMapper;
import com.example.versioning.feature.account.get.mapper.GetAccountMapper;
import com.example.versioning.feature.account.get.repository.AccountRepository;
import com.example.versioning.feature.common.account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateAccountServiceImpl implements CreateAccountService {

    private final AccountRepository accountRepository;
    private final CreateAccountMapper createAccountMapper;
    private final GetAccountMapper getAccountMapper;

    @Override
    public Account createAccount(Account account) {
        return getAccountMapper.mapToAccount(accountRepository.save(createAccountMapper.toAccountEntity(account)));
    }
}
