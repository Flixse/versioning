package com.example.versioning.resource;

import com.example.versioning.feature.account.create.service.CreateAccountService;
import com.example.versioning.feature.account.get.service.GetAccountsService;
import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountV3;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountResource {

    private final GetAccountsService getAccountsService;
    private final GetAccountsService getAccountsServiceV2;
    private final CreateAccountService createAccountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return getAccountsService.getAccounts();
    }

    @GetMapping("/v2/accounts")
    public List<Account> getV2Accounts() {
        return getAccountsServiceV2.getAccounts();
    }


    @GetMapping("/accounts/{id}")
    public Account getAccounts(@PathVariable int id) {
        return getAccountsService.getAccount(id);
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account account) {
        return createAccountService.createAccount(account);
    }

    @PostMapping("v3/accounts")
    public Account createAccountV3(@RequestBody AccountV3 account) {
        return createAccountService.createAccount(account);
    }
}
