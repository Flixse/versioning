package com.example.versioning.feature.account.get.mapper;

import com.example.versioning.feature.common.account.Account;
import com.example.versioning.feature.common.account.AccountEntity;
import com.example.versioning.feature.common.account.HRef;
import com.example.versioning.feature.common.account.HRefDetail;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GetAccountMapper {

    public Account mapToAccount(AccountEntity accountEntity){
        return Account.builder()
                .firstName(accountEntity.getFirstName())
                .lastName(accountEntity.getLastName())
                .href(getHrefFromAccountEntity(accountEntity.getId()))
                .build();
    }

    public List<Account> mapToAccounts(List<AccountEntity> accountEntityList){
        return accountEntityList.stream()
                .map(this::mapToAccount)
                .collect(Collectors.toList());
    }

    private HRef getHrefFromAccountEntity(int id){
        String uri = "/accounts/{id}/addresses";
        HRefDetail hRefDetailGetAddresses = HRefDetail.builder()
                .href(StringUtils.replace(uri, "{id}", id +""))
                .httpMethod("GET")
                .build();
        List<String> neededFields = new ArrayList<>();
        neededFields.add("postcode");
        neededFields.add("street");
        neededFields.add("extra");
        neededFields.add("houseNumber");
        neededFields.add("city");
        neededFields.add("country");
        neededFields.add("postBusNumber");
        HRefDetail hRefDetailCreateAddress = HRefDetail.builder()
                .href(StringUtils.replace(uri, "{id}", id +""))
                .httpMethod("POST")
                .neededFields(neededFields)
                .build();
        List<HRefDetail> addressDetails = new ArrayList<>();
        addressDetails.add(hRefDetailCreateAddress);
        addressDetails.add(hRefDetailGetAddresses);
        return HRef.builder()
                .address(addressDetails)
                .build();
    }
}
