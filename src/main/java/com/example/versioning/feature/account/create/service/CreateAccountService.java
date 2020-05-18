package com.example.versioning.feature.account.create.service;

import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountV3;

public interface CreateAccountService {

    Account createAccount(Account account);
    Account createAccount(AccountV3 account);
}
