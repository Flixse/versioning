package com.example.versioning.feature.account.create.mapper;

import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountEntity;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountMapper {
    public AccountEntity toAccountEntity(Account account){
        return AccountEntity.builder()
                .firstName(account.getFirstName())
                .lastName(account.getLastName()).build();
    }
}
