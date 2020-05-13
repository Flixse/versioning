package com.example.versioning.resource;

import com.example.versioning.feature.account.create.service.CreateAccountService;
import com.example.versioning.feature.account.get.service.GetAccountService;
import com.example.versioning.feature.common.account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountResource {

    private final GetAccountService getAccountService;
    private final CreateAccountService createAccountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return getAccountService.getAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccounts(@PathVariable int id) {
        return getAccountService.getAccount(id);
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account account) {
        return createAccountService.createAccount(account);
    }
}
