package com.example.versioning.feature.account.get.mapper;

import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GetAccountMapper {

    public Account mapToAccount(AccountEntity accountEntity){
        return Account.builder()
                .firstName(accountEntity.getFirstName())
                .lastName(accountEntity.getLastName())
                .build();
    }

    public List<Account> mapToAccounts(List<AccountEntity> accountEntityList){
        return accountEntityList.stream()
                .map(this::mapToAccount)
                .collect(Collectors.toList());
    }
}
