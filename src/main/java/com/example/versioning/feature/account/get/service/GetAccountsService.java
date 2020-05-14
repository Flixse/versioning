package com.example.versioning.feature.account.get.service;

import com.example.versioning.feature.common.account.Account;

import java.util.List;

public interface GetAccountsService {

    Account getAccount(int id);
    List<Account> getAccounts();
}
