package com.example.versioning.feature.account.get.service;

import com.example.versioning.feature.common.account.Account;

import java.util.List;

public interface GetAccountService {

    Account getAccount(int id);
    List<Account> getAccounts();
}
