package com.example.versioning.feature.account.create.mapper;

import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountEntity;
import com.example.versioning.feature.common.account.AccountV3;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountMapper {
    public AccountEntity toAccountEntity(Account account){
        return AccountEntity.builder()
                .firstName(account.getFirstName())
                .lastName(account.getLastName()).build();
    }

    public AccountEntity toAccountEntity(AccountV3 account){
        return AccountEntity.builder()
                .firstName(account.getFirstName1() + " " + account.getFirstName2())
                .lastName(account.getLastName1()  + " " + account.getLastName2()).build();
    }
}
